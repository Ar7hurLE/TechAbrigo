package com.example.techabrigo.cadastro

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.components.CaixaDeEntrada
import com.example.techabrigo.components.PasswordTextField
import com.example.techabrigo.components.UserTextField
import com.example.techabrigo.database.repository.AlunoRepository
import com.example.techabrigo.model.Aluno
import com.example.techabrigo.ui.theme.BlackOpsOne


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CadastroScreen(cadastroScreenViewModel: CadastroScreenViewModel, navController: NavController) {
    val context = LocalContext.current
    val alunoRepository = AlunoRepository(context)

    val name by cadastroScreenViewModel.name.observeAsState(initial = "")
    val email by cadastroScreenViewModel.email.observeAsState(initial = "")
    val sexo by cadastroScreenViewModel.sexo.observeAsState(initial = "")
    val lastName by cadastroScreenViewModel.lastName.observeAsState(initial = "")
    val date by cadastroScreenViewModel.date.observeAsState(initial = "")
    val password by cadastroScreenViewModel.password.observeAsState(initial = "")
    val user by cadastroScreenViewModel.user.observeAsState(initial = "")
    val terms by cadastroScreenViewModel.terms.observeAsState(false)
    val abrigosList by cadastroScreenViewModel.abrigosList.observeAsState(emptyList())
    val abrigo by cadastroScreenViewModel.abrigo.observeAsState("")
    var isDropDownVisible by remember { mutableStateOf(false) }


    var errorPassword by remember { mutableStateOf(false) }
    var errorEmail by remember { mutableStateOf(false) }
    var errorUsername by remember { mutableStateOf(false) }
    var errorFullName by remember { mutableStateOf(false) }
    var errorBirthday by remember { mutableStateOf(false) }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                TopAppBar(
                    backgroundColor = colorResource(id = R.color.tech_color),
                    modifier = Modifier
                        .fillMaxWidth(),
                    title = {
                        Text(
                            text = stringResource(id = R.string.cadastro),
                            color = Color.White,
                            fontFamily = BlackOpsOne
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = { navController.navigate("login") }
                        ) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    }
                )
                Image(
                    painter = painterResource(id = R.drawable.welcome),
                    contentDescription = "Tech Abrigo Logo",
                    modifier = Modifier
                        .clip(RectangleShape)
                        .requiredHeight(200.dp)
                        .fillMaxWidth()
                        .background(Color.Black)
                )
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                item {
                    Column {
                        Row {
                            CaixaDeEntrada(
                                placeHolder = stringResource(id = R.string.name),
                                value = name,
                                atualizarValor = { cadastroScreenViewModel.onNameChanged(it) },
                                keyboardType = KeyboardType.Text,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                    .weight(1f),
                                isError = errorFullName
                            )

                            CaixaDeEntrada(
                                placeHolder = stringResource(id = R.string.last_name),
                                value = lastName,
                                atualizarValor = { cadastroScreenViewModel.onLastNameChanged(it) },
                                keyboardType = KeyboardType.Text,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                    .weight(1f),
                                isError = errorFullName
                            )
                        }
                        if (errorFullName) {
                            Text(
                                text = "o nome e o sobrenome são obrigatórios",
                                modifier = Modifier.padding(start = 12.dp),
                                fontSize = 12.sp,
                                color = colorResource(id = R.color.erro),
                            )
                        }
                    }
                }
                item {
                    Row {
                        CaixaDeEntrada(
                            placeHolder = stringResource(id = R.string.birthday),
                            value = date,
                            atualizarValor = { cadastroScreenViewModel.onDateChanged(it) },
                            keyboardType = KeyboardType.Text,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 10.dp),
                            isError = errorBirthday
                        )
                    }
                    if (errorBirthday) {
                        Text(
                            text = "A data de nascimento é obrigatória",
                            modifier = Modifier.padding(start = 12.dp),
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.erro),
                        )
                    }
                }
                item {
                    Column {
                        Text(
                            text = stringResource(id = R.string.sex),
                            color = Color.White,
                            modifier = Modifier
                                .padding(10.dp)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        )
                        {
                            RadioButton(
                                selected = sexo == stringResource(id = R.string.sexM),
                                onClick = { cadastroScreenViewModel.onSexoChanged("Masculino") },
                                colors = RadioButtonDefaults.colors(
                                    unselectedColor = Color.Gray,
                                    selectedColor = Color.Magenta
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.sexM),
                                color = Color.White,
                                modifier = Modifier
                            )
                            RadioButton(
                                selected = sexo == stringResource(id = R.string.sexF),
                                onClick = { cadastroScreenViewModel.onSexoChanged("Feminino") },
                                colors = RadioButtonDefaults.colors(
                                    unselectedColor = Color.Gray,
                                    selectedColor = Color.Magenta
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.sexF),
                                color = Color.White
                            )
                            RadioButton(
                                selected = sexo == stringResource(id = R.string.sexNB),
                                onClick = { cadastroScreenViewModel.onSexoChanged("Não Binário") },

                                colors = RadioButtonDefaults.colors(
                                    unselectedColor = Color.Gray,
                                    selectedColor = Color.Magenta
                                )
                            )
                            Text(
                                text = stringResource(id = R.string.sexNB),
                                color = Color.White
                            )
                        }
                    }
                }
                item {
                    Box(
                        modifier = Modifier
                            .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                    )
                    {
                        TextField(
                            value = abrigo,
                            textStyle = TextStyle(Color.White),
                            onValueChange = {
                                cadastroScreenViewModel.onAbrigoChanged(it)
                                isDropDownVisible = true
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                .clickable {
                                    isDropDownVisible = true
                                },
                            placeholder = {
                                Text(text = stringResource(id = R.string.list),
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                        .clickable { isDropDownVisible = true })
                            },
                        )
                        DropdownMenu(
                            expanded = isDropDownVisible,
                            onDismissRequest = { isDropDownVisible = false },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            abrigosList.forEach { abrigoItem ->
                                DropdownMenuItem(onClick = {
                                    cadastroScreenViewModel.onAbrigoChanged(abrigoItem)
                                    isDropDownVisible = false
                                }) {
                                    Text(
                                        text = abrigoItem
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    Row {
                        CaixaDeEntrada(
                            placeHolder = stringResource(id = R.string.email),
                            value = email,
                            atualizarValor = { newValue ->
                                cadastroScreenViewModel.onEmailChanged(
                                    newValue
                                )
                            },
                            keyboardType = KeyboardType.Text,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 10.dp),
                            isError = errorEmail
                        )
                    }
                    if (errorEmail) {
                        Text(
                            text = "O email é obrigatório",
                            modifier = Modifier.padding(start = 12.dp),
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.erro),
                        )
                    }
                }

                item {
                    Row {

                        UserTextField(
                            placeHolder = stringResource(id = R.string.username),
                            value = user,
                            keyboardType = KeyboardType.Text,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                .background(Color.Transparent),
                             atualizarValor = {cadastroScreenViewModel.onUserChanged(it)},
                            isError = errorUsername
                            )
                    }
                    if (errorUsername) {
                        Text(
                            text = "O username é obrigatório",
                            modifier = Modifier.padding(start = 12.dp),
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.erro),
                        )
                    }
                }

                item {
                    PasswordTextField(
                        placeHolder = stringResource(id = R.string.password),
                        value = password,
                        keyboardType = KeyboardType.Password,

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                            .background(Color.Transparent),
                        atualizarValor = { cadastroScreenViewModel.onPasswordChanged(it) },
                        isError = errorPassword
                    )
                    if (errorPassword) {
                        Text(
                            text = "A senha é obrigatória",
                            modifier = Modifier.padding(start = 12.dp),
                            fontSize = 12.sp,
                            color = colorResource(id = R.color.erro),
                        )
                    }
                }
                item {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Checkbox(
                            checked = terms,
                            onCheckedChange = { cadastroScreenViewModel.onTermsAcepted(it) }
                        )
                        Text(
                            text = stringResource(id = R.string.terms),
                            color = colorResource(id = R.color.link),
                            modifier = Modifier
                                .clickable { navController.navigate("termos") }
                        )
                    }
                }
                item {
                    Row {
                        Button(
                            onClick = {
                                errorFullName = name.isEmpty()
                                errorBirthday = date.isEmpty()
                                errorEmail = email.isEmpty()
                                errorUsername = user.isEmpty()
                                errorPassword = password.isEmpty()
                                if (name.isEmpty() || date.isEmpty() || email.isEmpty() || user.isEmpty() || password.isEmpty()) {
                                    errorFullName
                                    errorBirthday
                                    errorEmail
                                    errorUsername
                                    errorPassword
                                } else {
                                    val aluno = Aluno(
                                        id = 0,
                                        nome = name,
                                        sobrenome = lastName,
                                        dataNasc = date,
                                        sexo = sexo,
                                        email = email,
                                        user = user,
                                        password = password,
                                        termosAcepted = terms
                                    )
                                    alunoRepository.salvar(aluno)
                                    navController.navigate("cursos/M4th3uz")
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                                .height(70.dp),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                            content = {
                                Text(
                                    text = stringResource(id = R.string.entrar),
                                    textAlign = TextAlign.Center,
                                    color = Color.White,
                                    fontSize = 23.sp,
                                    fontFamily = BlackOpsOne
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}






