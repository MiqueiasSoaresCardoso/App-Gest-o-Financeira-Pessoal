import android.annotation.SuppressLint
import androidx.compose.foundation.Image
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
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.com.dispositivosmoveis.gestorfinanceiropessoal.R
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.BlueBase
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.CorFundo
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.GreenBase

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavHostController) {
    Scaffold(
        containerColor = BlueBase,


        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate("New_Count")
            }, containerColor = GreenBase, modifier = Modifier) {
                // Adicionando a imagem no botão
                Image(imageVector = ImageVector.vectorResource(R.drawable.add), contentDescription ="" )
            }
        }

    )
    {
       //Image(painter = painterResource(id = R.drawable.fundo), contentDescription = "")
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(color = CorFundo)
                .padding(16.dp)
                .fillMaxWidth()
            ,
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top,
        ) {
            CardMoney();
            Spacer(modifier = Modifier.height(16.dp));
            Text(text = "Lista de despesas",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(bottom= 10.dp)

            );
            ItemContaa();
        }

    }
}