package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                    App ();

            }
        }
    }
}

@Composable
fun SimpleText() {
    Text("App cadastro", fontSize = 25.sp)
}

@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Nome:") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleUm() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Endereço:") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleDois() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Bairro:") }
    )
}
@Composable
fun SimpleOutlinedTextFieldSampleTres() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Cep:") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleQuatro() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Cidade:") }
    )
}

@Composable
fun SimpleOutlinedTextFieldSampleCinco() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Estado :") }
    )
}

@Composable
fun App(){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row {
            SimpleText()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSample()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleUm()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleDois()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleTres()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleQuatro()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center
        ) {
            SimpleOutlinedTextFieldSampleCinco()
        }
        Row (
            Modifier
                .padding(8.dp)
        ) {
        }
        Row (
            Modifier
                .fillMaxWidth(),
            Arrangement.Absolute.Center

        ) {
            OutlinedButton(onClick = { onClick() }) {
                Text("Cadastrar")
            }
        }
    }
}

fun onClick() {
    TODO("Not yet implemented")
}


@Composable
@Preview
fun AppPreview () {
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App();
        }
    }
    App();
}