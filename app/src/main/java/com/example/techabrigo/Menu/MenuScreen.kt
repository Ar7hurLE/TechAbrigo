package com.example.techabrigo.Menu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.ui.theme.BlackOpsOne

@Composable
fun MenuScreen(navController: NavController, user: String) {

    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Column {
            TopAppBar(
                backgroundColor = colorResource(id = R.color.white),
                modifier = Modifier
                    .fillMaxWidth(),
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = {
                                navController.navigate("cursos/M4th3uz")
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = "voltar pro dashboard",
                                tint = Color.Black,
                                modifier = Modifier

                            )
                        }
                        Text(
                            text = stringResource(id = R.string.tech_Abrigo),
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = BlackOpsOne
                        )

                    }
                }
            )
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(267.dp)
                    .background(Color.Black)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Icon(
                        imageVector = Icons.Default.AccountBox,
                        contentDescription = "Icone de perfil",
                        tint = Color.White,
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.matheus),
                        fontFamily = BlackOpsOne,
                        color = Color.White
                    )
                    Row {

                        Text(
                            text = "Username: ",
                            fontFamily = BlackOpsOne,
                            color = Color.White
                        )
                        Text(
                            text = "$user",
                            fontFamily = BlackOpsOne,
                            color = Color.Yellow
                        )
                    }
                }
            }
            Column {
                Button(onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.AccountBox,
                                contentDescription = "Meus Dados",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.meus_dados),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
                Button(onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.CheckCircle,
                                contentDescription = "Meus Cursos",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.meus_cursos),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
                Button(onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "XP",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.xp),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
                Button(onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = "Jobs",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.jobs),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
                Button(onClick = { navController.navigate("cursos/M4th3uz") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = "Cursos",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.cursos),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
                Button(onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(70.dp),
                    shape = RectangleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.tech_color)),
                    content = {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "News",
                                tint = Color.White,
                                modifier = Modifier
                                    .padding(start = 16.dp, end = 30.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.news),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                )
                Divider(
                    color = Color.Black,
                    thickness = 1.dp
                )
            }
            BottomAppBar(
                backgroundColor = colorResource(id = R.color.logout),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .clickable { navController.navigate("login") },
                content = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Icon(
                            imageVector = Icons.Default.ExitToApp,
                            contentDescription = "Sair",
                            tint = Color.White,
                            modifier = Modifier
                                .padding(start = 16.dp, end = 30.dp)


                        )
                    }
                    Text(
                        text = stringResource(id = R.string.logout),
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = BlackOpsOne
                    )

                }
            )
        }
    }
}













