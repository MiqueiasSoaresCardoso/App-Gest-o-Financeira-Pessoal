package br.com.dispositivosmoveis.gestorfinanceiropessoal.Componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.dispositivosmoveis.gestorfinanceiropessoal.ui.theme.ButtonColor
import shapes

@Composable
fun Botao(
    onClick : () -> Unit,
    modifier: Modifier,
    text: String
){

    Button(
        onClick,
        modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = ButtonColor
        ),
        shape = shapes.small
    ){
    Text(text = text, fontWeight = FontWeight.Bold, fontSize = 18.sp)
    }




}