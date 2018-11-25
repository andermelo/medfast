# Universidade Anhembi Morumbi

Sistemas de Informação

Projeto Sistema de Registro de Receitas Médicas - MedFast (trabalho acadêmico)

## Descrição
 
O sistema gera uma prescrição/receita médica digital com CRM do profissional de saúde que a gerar. O sistema irá ajudar a evitar fraudes e aumentará o controle de receitas geradas promovendo novos dados para melhoria da saúde no país.

Cada prescrição gerada irá ser adicionada a um contador de prescrições de acordo com cada usuário gerador. O profissional de saúde deverá ter uma página de perfil com suas informações profissionais e pessoais com CRM, especialidade, e-mail, telefone para contato, nome completo e histórico de prescrições. O sistema irá também cadastrar farmácias parceiras com o Nome, CNPJ, endereços, horário de funcionamento de cada unidade e indicará se o medicamento receitado estará disponível. O paciente irá cadastrar seu nome, CPF, e-mail ,telefone para contato e endereço.
 
O sistema é integrado ao [Portal Médico do Conselho Federal de Medicina(CFM)](https://www.consultacrm.com.br/index/api) para validar o CRM do médico no momento da criação ou atualização do perfil do usuário.
 
O paciente recebe a receita médica apenas para visualização e confirmação do conteúdo, via aplicação mobile, e então validará com o médico a criação do token. Com a receita gerada no sistema o paciente receberá um token onde poderá utiliza-lo para retirar nas farmácias credenciadas com desconto ou em qualquer outra farmácia sem desconto. Após a utilização do token o atendente da farmácia irá dar baixa na receita utilizando o token do paciente e o paciente receberá uma notificação sobre a baixa do token, tendo 24 horas para reportar qualquer falsa utilização.
 
O sistema guardará, além dos dados do médico, paciente e farmácia, as transações realizadas entre as 3 entidades, histórico de atendimentos, medicamentos utilizados, unidade de farmácia mais procurada e gerará relatórios.

## Links

- [Painel de Cadastro dos Médicos](https://medfast-223122.firebaseapp.com)

