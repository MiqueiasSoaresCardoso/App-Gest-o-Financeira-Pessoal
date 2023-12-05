import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.com.dispositivosmoveis.gestorfinanceiropessoal.Componentes.Botao
import br.com.dispositivosmoveis.gestorfinanceiropessoal.Repsository.TarefasRepository
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.CorFundo
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.GreenBase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun New_cont(
    navController: NavHostController
) {

    val scope = rememberCoroutineScope()
    //Capturando o contexto para a utilização de mensagens
    val context = LocalContext.current
    //Repository
    val Repository = TarefasRepository();
    Scaffold(
        modifier = Modifier.background(Color.Blue),

    ) {
        //Criando o estado que será utilizado no value da caixa de texto
        var NomeDespesa by remember {
            mutableStateOf("")
        }
        var ValorDespesa by remember{
            mutableStateOf("")
        }
        var Data by remember{
            mutableStateOf("")
        }
        var Descricao by remember{
            mutableStateOf("")
        }

        //Spacer(modifier = Modifier.height(20.dp));
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(color = CorFundo)
                .padding(16.dp)
                .fillMaxWidth()
                .clip(shapes.small)
            ,
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
        ) {
            CardMoney();
            //INSERIR CARD MONEY
            Spacer(modifier = Modifier.height(16.dp));
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(GreenBase)
                    .clip(shapes.small),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Top,

            ) {
                CaixadeTexto(
                    value = NomeDespesa,
                    onValueChange = {
                        NomeDespesa = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 0.dp) ,
                    label = "Nova Despesa",
                    placeholder = "Insira o nome da despesa" ,
                    maxlines = 1 ,
                    keyboardType = KeyboardType.Text
                );
                CaixadeTexto(
                    value = ValorDespesa ,
                    onValueChange = {
                        ValorDespesa = it
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 0.dp),

                    label = "Valor da despesa",
                    placeholder = "R$ 0,00",
                    maxlines = 1 ,
                    keyboardType = KeyboardType.Number
                );
                CaixadeTexto(
                    value = Data ,
                    onValueChange = {
                        Data = it
                    } ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 20.dp, 20.dp, 0.dp) ,
                    label = "Data da Despesa",
                    placeholder = "21/11/2023" ,
                    maxlines = 1,
                    keyboardType = KeyboardType.Text
                );
                CaixadeTexto(
                    value = Descricao ,
                    onValueChange = {
                        Descricao = it
                    } ,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(20.dp, 20.dp, 20.dp, 0.dp) ,
                    label = "Descrição",
                    placeholder = "Gasto com laches" ,
                    maxlines = 1,
                    keyboardType = KeyboardType.Text
                );
                Botao(onClick = {

                    var mensagem = false
                    //criando um tread em segundo plano para salvar contas
                    scope.launch(Dispatchers.IO ) {
                        if(NomeDespesa.isEmpty()){
                            mensagem = true;
                        }else if(NomeDespesa.isNotEmpty() && ValorDespesa.isNotEmpty() && Data.isNotEmpty() && Descricao.isNotEmpty()){
                            Repository.SalvarConta(NomeDespesa,ValorDespesa,Data,Descricao)
                            mensagem = true
                        }
                    }
                    scope.launch(Dispatchers.Main ) {
                        if(mensagem){
                            Toast.makeText(context,"Conta Salva com Sucesso!",Toast.LENGTH_SHORT).show()
                                navController.navigate("Home")
                        }else{
                            Toast.makeText(context,"Preencha todos os campos!",Toast.LENGTH_SHORT).show()
                        }
                    }
                                },
                    modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp), text = "Salvar")
            }

            }

        }
    }


@Composable
@Preview
private fun New_cont_preview(){
    //New_cont();
}