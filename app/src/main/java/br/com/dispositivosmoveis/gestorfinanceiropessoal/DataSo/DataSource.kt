package br.com.dispositivosmoveis.gestorfinanceiropessoal.DataSo

import br.com.dispositivosmoveis.gestorfinanceiropessoal.Models.Conta
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DataSource {

    //Iniciando uma instância do Firebase Firestore
    private val database = FirebaseFirestore.getInstance()

    //Fluxo de estado assincrono
    private val _contas = MutableStateFlow<MutableList<Conta>>(mutableListOf())
    private val contas : StateFlow<MutableList<Conta>> = _contas

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
    fun listar(): Flow<MutableList<Conta>>{

        val ListaContas: MutableList<Conta> = mutableListOf()

        database.collection("contas").get().addOnCompleteListener{resultado ->
            //Se for um sucesso quer dizer que tem alguma coisa no banco de dados
            if(resultado.isSuccessful){
                for(conta in resultado.result){
                    val conta = conta.toObject(Conta::class.java)
                    ListaContas.add(conta)
                    _contas.value = ListaContas
                }

            }
        }
        return contas
    }
}