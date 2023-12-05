package br.com.dispositivosmoveis.gestorfinanceiropessoal.DataSo

import com.google.firebase.firestore.FirebaseFirestore

class DataSource {

    //Iniciando uma instância do Firebase Firestore
    private val database = FirebaseFirestore.getInstance()

    //Metódo para salvar uma conta
    fun DsalvarConta(nome:String, valor: String, data:String, descricao: String){
        var valorof = valor.toFloat();
        val ContaMap = hashMapOf(
            "nome" to nome,
            "valor" to valorof,
            "data" to data,
            "descricao" to descricao
        )
        database.collection("contas").document(nome).set(ContaMap).addOnCompleteListener{
            // se der certo
        }.addOnCanceledListener {
            //se dere errado
        }
    }
}