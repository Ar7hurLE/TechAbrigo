package com.example.techabrigo.login
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.components.PasswordTextField
import com.example.techabrigo.components.UserTextField
import com.example.techabrigo.ui.theme.BlackOpsOne

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(loginScreenViewModel: LoginScreenViewModel, navController: NavController) {
    val user by loginScreenViewModel.user.observeAsState(initial = "")
    val password by loginScreenViewModel.password.observeAsState(initial = "")

    var errorPassword by remember { mutableStateOf(false) }
    var errorEmail by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.tech_logo),
                    contentDescription = "Tech Abrigo Logo",
                    modifier = Modifier
                        .clip(RectangleShape)
                        .requiredHeight(350.dp)
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

                    UserTextField(
                        placeHolder = stringResource(id = R.string.username),
                        value = user,
                        keyboardType = KeyboardType.Text,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .background(Color.Transparent),
                        atualizarValor = { loginScreenViewModel.onUserChanged(it) },
                        isError = errorEmail
                    )
                    if (errorEmail) {
                        Text(
                            text = "O email é obrigatória",
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
                            .padding(16.dp)
                            .background(Color.Transparent),
                        atualizarValor = { newValue ->
                            val maxLength = 8
                            if (newValue.length <= maxLength) {
                                loginScreenViewModel.onPasswordChanged(newValue)
                            }
                             },
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
                    Spacer(modifier = Modifier.height(24.dp))
                }

                item {
                    Row {

                        Text(text = stringResource(id = R.string.missed_password),
                            color = Color.White,
                            fontSize = 13.sp,
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .clickable { }
                        )
                    }
                }
                item {
                    Row {
                        Button(
                            onClick = {
                                errorPassword = password.isEmpty()
                                errorEmail = user.isEmpty()
                                if (password.isEmpty() || user.isEmpty()) {
                                    errorPassword
                                    errorEmail
                                } else if(user == "M4th3uz" && password == "teste123") {
                                navController.navigate("cursos/M4th3uz")
                            }
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp, top = 50.dp, end = 16.dp)
                                .height(70.dp),
                            shape = RectangleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                            content = {
                                Text(
                                    text = stringResource(id = R.string.btn_login),
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White,
                                    fontSize = 23.sp,
                                    fontFamily = BlackOpsOne
                                )
                            }
                        )
                    }
                }
                item {
                    Row {

                        Text(
                            text = stringResource(id = R.string.not_user),
                            color = Color.White,
                            fontSize = 13.sp,
                            modifier = Modifier
                                .padding(start = 16.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.here),
                            color = colorResource(id = R.color.link),
                            fontSize = 13.sp,
                            modifier = Modifier
                                .padding(start = 3.dp)
                                .clickable { navController.navigate("cadastro") }
                        )
                    }
                }
                item {
                    Divider(
                        color = Color.White,
                        thickness = 2.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 90.dp)
                            .height(2.dp)
                    )

                }
                item {
                    Row {

                        Text(
                            text = stringResource(id = R.string.not_patrocinador),
                            color = Color.White,
                            fontSize = 13.sp
                        )
                        Text(
                            text = stringResource(id = R.string.here),
                            color = colorResource(id = R.color.link),
                            fontSize = 13.sp,
                            modifier = Modifier
                                .padding(start = 3.dp)
                                .clickable { }
                        )

                    }
                }
            }
        }
    }
}



