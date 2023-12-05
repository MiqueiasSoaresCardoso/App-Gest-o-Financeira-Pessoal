import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.Cinza
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.GreenBase

@Composable
fun CardMoney(){

    Column(
        modifier = Modifier
            .clip(shapes.small)
            .background(GreenBase)
            .fillMaxWidth()
            .padding(10.dp)
            .clickable {  }

    ){
        Row {
            Text(text = "Olá! Allyson",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color.White)
        };
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(bottom = 8.dp)

        ) {
            Text(text = "Valor disponivel em caixa",
                fontSize = 14.sp,
                color = Color.White,
            );

        };
        Row {
            Text(text = "R$ 67,00",
                modifier = Modifier.clip(shapes.small).background(Cinza).padding(5.dp),
                fontSize = 16.sp,
                color = Color.Black,
            )
        }

    }

}