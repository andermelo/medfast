package com.medfest.android.medfestapp.firebase.database

import com.google.firebase.database.*
import com.medfest.android.medfestapp.model.*
import javax.inject.Inject

private const val KEY_USER = "user"
private const val KEY_RECEITA = "receita"
private const val KEY_FAVORITE = "favorite"

class FirebaseDatabaseManager @Inject constructor(private val database: FirebaseDatabase) : FirebaseDatabaseInterface {
  override fun createUser(id: String, name: String, email: String) {
    val user = User(id, name, email)

    database.reference.child(KEY_USER).child(id).setValue(user)
  }

  override fun listenToReceitas(onReceitaAdded: (Receita) -> Unit) {
    database.reference.child(KEY_RECEITA)
            .orderByKey()
            .addChildEventListener(object : ChildEventListener {
              override fun onCancelled(p0: DatabaseError) = Unit
              override fun onChildMoved(p0: DataSnapshot, p1: String?) = Unit
              override fun onChildChanged(p0: DataSnapshot, p1: String?) = Unit
              override fun onChildRemoved(p0: DataSnapshot) = Unit

              override fun onChildAdded(snapshot: DataSnapshot, p1: String?) {
                snapshot?.getValue(ReceitaResponse::class.java)?.run {
                  if (isValid()) {
                    onReceitaAdded(mapToReceita())
                  }
                }
              }
            })
  }

  override fun addNewReceita(receita: Receita, onResult: (Boolean) -> Unit) {
    val newReceitaReference = database.reference.child(KEY_RECEITA).push()
    val newReceita = receita.copy(id = newReceitaReference.key!!)

    newReceitaReference.setValue(newReceita).addOnCompleteListener { onResult(it.isSuccessful && it.isComplete) }
  }

  override fun getFavoriteReceitas(userId: String, onResult: (List<Receita>) -> Unit) {
    database.reference
            .child(KEY_USER)
            .child(userId)
            .child(KEY_FAVORITE)
            .addValueEventListener(object : ValueEventListener {
              override fun onCancelled(error: DatabaseError) = onResult(listOf())

              override fun onDataChange(snapshot: DataSnapshot) {
                snapshot?.run {
                  val receitas = children.mapNotNull { it.getValue(ReceitaResponse::class.java) }

                  onResult(receitas.map(ReceitaResponse::mapToReceita))
                }
              }
            })
  }

  override fun changeReceitaFavoriteStatus(receita: Receita, userId: String) {
    val reference = database.reference
            .child(KEY_USER)
            .child(userId)
            .child(KEY_FAVORITE)
            .child(receita.id)

    reference.addListenerForSingleValueEvent(object : ValueEventListener {
      override fun onCancelled(error: DatabaseError) {}

      override fun onDataChange(snapshot: DataSnapshot) {
        val oldReceita = snapshot?.getValue(ReceitaResponse::class.java)

        if (oldReceita != null) {
          reference.setValue(null)
        } else {
          reference.setValue(receita)
        }
      }
    })
  }

  override fun getProfile(id: String, onResult: (User) -> Unit) {
        database.reference
                .child(KEY_USER)
                .child(id)
                .addValueEventListener(object : ValueEventListener {
                    override fun onCancelled(error: DatabaseError) = Unit

                    override fun onDataChange(snapshot: DataSnapshot) {
                        val user = snapshot?.getValue(UserResponse::class.java)
                        val favoriteReceitas = snapshot?.child(KEY_FAVORITE)?.children
                                ?.map { it?.getValue(ReceitaResponse::class.java) }
                                ?.mapNotNull { it?.mapToReceita() }
                                ?: listOf()


                        user?.run { onResult(User(id, username, email, favoriteReceitas)) }
                    }
                })
    }
  }
