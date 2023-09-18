package com.example.techabrigo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.techabrigo.R
import java.lang.Error


@Composable
fun CaixaDeEntrada(
    placeHolder: String,
    value: String,
    atualizarValor: (String) -> Unit,
    keyboardType: KeyboardType,
    modifier: Modifier,
    isError: Boolean
    ) {


        OutlinedTextField(
        value = value,
        onValueChange = atualizarValor,
        modifier = modifier,
        placeholder = { Text(text = placeHolder)},
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        textStyle = TextStyle(Color.White),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Gray,
            unfocusedPlaceholderColor = Color.Gray)
    )
}
@Composable

fun PasswordTextField(
    placeHolder: String,
    value: String,
    keyboardType: KeyboardType,
    modifier: Modifier,
    atualizarValor: (String) -> Unit,
    isError: Boolean
) {
    OutlinedTextField(
        value = value,
        onValueChange =  atualizarValor,
        modifier = modifier,
        placeholder = { Text(text = placeHolder) },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        textStyle = TextStyle(Color.White),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Gray,
            unfocusedPlaceholderColor = Color.Gray
        ),
    )
}
@Composable
fun UserTextField(
    placeHolder: String,
    value: String,
    keyboardType: KeyboardType,
    modifier: Modifier,
    atualizarValor: (String) -> Unit,
    isError: Boolean

    ) {
    OutlinedTextField(
        value = value,
        onValueChange = atualizarValor,
        modifier = modifier,
        placeholder = { Text(text = placeHolder)},
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        textStyle = TextStyle(Color.White),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Gray,
            unfocusedPlaceholderColor = Color.Gray
        )
    )
}




