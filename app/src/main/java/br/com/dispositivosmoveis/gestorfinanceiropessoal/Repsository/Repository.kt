package br.com.dispositivosmoveis.gestorfinanceiropessoal.Repsository

import br.com.dispositivosmoveis.gestorfinanceiropessoal.DataSo.DataSource
import br.com.dispositivosmoveis.gestorfinanceiropessoal.Models.Conta
import kotlinx.coroutines.flow.Flow

class Repository() {

    private val dataSource = DataSource();

    fun SalvarConta(nome:String, valor: String, data:String, descricao: String){
        dataSource.DsalvarConta(nome,valor,data,descricao)
    }

    fun Listar(): Flow<MutableList<Conta>>{
        return dataSource.listar();
    }
}