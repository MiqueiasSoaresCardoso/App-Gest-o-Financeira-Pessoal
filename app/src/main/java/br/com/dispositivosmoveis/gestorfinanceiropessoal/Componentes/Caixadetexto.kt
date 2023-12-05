import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixadeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
    placeholder: String,
    maxlines: Int,
    keyboardType: KeyboardType
){
    TextField(
        value = value ,

        onValueChange = onValueChange,
        modifier = modifier,
        label = {
            Text(text = label )
        },
        placeholder = {
            Text(text = placeholder )
        },
        maxLines = maxlines,
        shape = shapes.small,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
        )

}



