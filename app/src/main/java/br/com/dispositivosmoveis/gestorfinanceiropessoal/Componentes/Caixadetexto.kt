import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixadeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
    placeholder: String
){
    OutlinedTextField(
        value = value ,
        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(text = label )
        },
        placeholder = {
            Text(text = placeholder )
        },
        maxLines = 1,
        )
}

@Composable
@Preview
private fun CaixadeTextoPreview(){
    CaixadeTexto()
}