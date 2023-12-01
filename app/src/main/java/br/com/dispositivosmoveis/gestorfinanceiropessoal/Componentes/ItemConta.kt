import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.GreenBase
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.Yellow

@Composable
fun ItemConta(){

    Card(
        modifier = Modifier
            .background(GreenBase)
            .fillMaxWidth()
            .padding(10.dp)
            .shadow(2.dp)
    ) {
        ConstraintLayout(
            modifier = Modifier
                .padding(10.dp)

        ) {
            val(textNome, txtData, floatValor,txtObservacao) = createRefs()

            Text(
                text = "20/04/2003",
                modifier = Modifier.constrainAs(textNome){
                    top.linkTo(parent.top, margin = 15.dp)
                    //Alinhamento a esquerda
                    start.linkTo(parent.start, margin = 5.dp)
                }
            );
            Text(
                text= "Tarefa 01",
                modifier = Modifier.constrainAs(txtData){
                    bottom.linkTo(textNome.bottom, margin = 20.dp)
                    start.linkTo(parent.start, margin = 5.dp)
                }
            );
            Card(
                modifier = Modifier
                    .size(80.dp)
                    .background(color = Yellow)
                    .constrainAs(floatValor) {
                        top.linkTo(parent.top, margin = 15.dp)
                        start.linkTo(txtData.end, margin = 80.dp)

                    },
                shape = shapes.medium
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ) {
                    Text(text= "Valor",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                        );

                    Text(text = "89,50",
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                        )
                }


            }

        }
    }

}


@Composable
@Preview
private fun ItemContaPreview(){
    ItemConta();
}