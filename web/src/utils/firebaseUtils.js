import firebase from 'firebase';

const prodConfig = {
    apiKey: "AIzaSyCk9ZZsWVid3WAlxBHKvphWDRV4LfYwfds",
    authDomain: "medfast-223122.firebaseapp.com",
    databaseURL: "https://medfast-223122.firebaseio.com",
    projectId: "medfast-223122",
    storageBucket: "medfast-223122.appspot.com",
    messagingSenderId: "766051650808"
};

const devConfig = {
    apiKey: "AIzaSyCk9ZZsWVid3WAlxBHKvphWDRV4LfYwfds",
    authDomain: "medfast-223122.firebaseapp.com",
    databaseURL: "https://medfast-223122.firebaseio.com",
    projectId: "medfast-223122",
    storageBucket: "medfast-223122.appspot.com",
    messagingSenderId: "766051650808"
};

const config = process.env.NODE_ENV === 'production'
    ? prodConfig
    : devConfig;

export const firebaseImpl = firebase.initializeApp(config);
export const firebaseDatabase = firebase.database();