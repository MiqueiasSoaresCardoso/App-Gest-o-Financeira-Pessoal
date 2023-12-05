package br.com.dispositivosmoveis.gestorfinanceiropessoal.Repsository

import br.com.dispositivosmoveis.gestorfinanceiropessoal.DataSo.DataSource

class TarefasRepository() {

    private val dataSource = DataSource();

    fun SalvarConta(nome:String, valor: String, data:String, descricao: String){
        dataSource.DsalvarConta(nome,valor,data,descricao)
    }
}