import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.CorFundo
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.Yellow

@Composable
fun ItemContaa(){

    Column(
        modifier = Modifier.clip(shapes.small)
    ) {
        Row {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .weight(1f)
                    //.fillMaxHeight()// 50% do espaço disponível
            ) {
                // Conteúdo da parte esquerda
                Text(
                    text= "Tarefa 01",
                    modifier = Modifier.padding(start=10.dp,bottom = 20.dp),
                    fontSize = 20.sp,
                    //color = Color.White
                    //fontWeight = FontWeight.Bold
                );

                Text(
                    text = "20/04/2003",
                    modifier = Modifier
                        .padding(start=10.dp,top=30.dp,bottom=10.dp),
                    color = Color.DarkGray
//
                    //fontSize = 20.sp,
                    //fontWeight = FontWeight.Bold
                );
            }

            // Parte direita
            Box(
                modifier = Modifier
                    .background(Yellow)
                    .weight(1f)
                    .align(alignment = Alignment.CenterVertically)
                    //.fillMaxHeight()// 50% do espaço disponível
            ) {
                // Conteúdo da parte direita

                Text(
                    text= "Valor:",
                    modifier = Modifier.padding(start=10.dp,bottom = 20.dp),
                    fontSize = 20.sp,
                    color = Color.White
                    //fontWeight = FontWeight.Bold
                );

                Text(
                    text = "R$ 125,00",
                    modifier = Modifier
                        .padding(start=10.dp,top=30.dp,bottom=10.dp),
                    color = Color.White
//
                    //fontSize = 20.sp,
                    //fontWeight = FontWeight.Bold
                );
            }
        };
        Row(
            modifier = Modifier.background(Color.Blue)
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Text(text = "Observaçãojjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj",
                //fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.White,

                )
        }
    }
}

@Composable
@Preview
private fun ItemContaPreview(){
    ItemContaa();
}