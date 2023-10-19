import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.navigation.NavHostController
import br.com.dispositivosmoveis.gestorfinanceiropessoal.R
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.BlueBase
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.GreenBase

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavHostController) {
    Scaffold(
        containerColor = BlueBase,
        topBar = {
            TopAppBar(title = { Text(text = "Lista")})
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {

            }, containerColor = GreenBase, modifier = Modifier) {
                // Adicionando a imagem no botão
                Image(imageVector = ImageVector.vectorResource(R.drawable.add), contentDescription ="" )
            }
        }

    )
    {
       //Image(painter = painterResource(id = R.drawable.fundo), contentDescription = "")
    }
}