package com.example.techabrigo.cursos

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.login.LoginScreenViewModel
import com.example.techabrigo.ui.theme.BlackOpsOne

@Composable
fun CursosScreen(navController: NavController, user: String) {

    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column {
            TopAppBar(
                backgroundColor = colorResource(id = R.color.white),
                modifier = Modifier
                    .fillMaxWidth(),
                title = {
                    Text(
                        text = stringResource(id = R.string.hello) + " " + "$user",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = BlackOpsOne
                    )
                },
                actions = {
                    IconButton(
                        onClick = { navController.navigate("menu/M4th3uz") }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Perfil Menu",
                            tint = Color.Black,
                            modifier = Modifier

                        )
                    }
                }
            )
            LazyColumn(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxSize()

            ) {
                item {
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "Screen Notification",
                        modifier = Modifier
                            .clip(RectangleShape)
                            .requiredHeight(200.dp)
                            .fillMaxWidth()
                            .background(Color.Black)
                    )
                }
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        {
                            Text(
                                text = stringResource(id = R.string.trilhas) + " ",
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 25.sp,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .padding(start = 16.dp, top = 16.dp)
                            )
                            Text(
                                text = stringResource(id = R.string.top5),
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp,
                                color = Color.Yellow,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .padding( top = 16.dp)
                            )
                        }
                    }
                }
                item {
                    LazyRow(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, top = 16.dp)

                    ) {
                        item {
                            Image(
                                painter = painterResource(id = R.drawable.frontend),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier


                            )
                            Image(
                                painter = painterResource(id = R.drawable.datascience),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                            Image(
                                painter = painterResource(id = R.drawable.backend),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                            Image(
                                painter = painterResource(id = R.drawable.qa),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                            Image(
                                painter = painterResource(id = R.drawable.pentest),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                        }
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        {
                            Text(
                                text = stringResource(id = R.string.fast_courses),
                                fontSize = 20.sp,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .padding(start = 16.dp, top = 16.dp)
                            )
                        }
                    }
                }
                item {
                    LazyRow(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, top = 16.dp)

                    ) {
                        item {
                            Image(
                                painter = painterResource(id = R.drawable.html),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier


                            )
                            Image(
                                painter = painterResource(id = R.drawable.php),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                            Image(
                                painter = painterResource(id = R.drawable.selenium),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                            Image(
                                painter = painterResource(id = R.drawable.js),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 15.dp)

                            )
                        }
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                        {
                            Text(
                                text =  stringResource(id = R.string.other_courses),
                                fontSize = 20.sp,
                                color = Color.White,
                                fontFamily = BlackOpsOne,
                                modifier = Modifier
                                    .padding(start = 16.dp, top = 16.dp)
                            )
                        }
                    }
                }
                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 120.dp)

                    ) {
                        Row {
                            Image(
                                painter = painterResource(id = R.drawable.angular),
                                contentDescription = "Curso Frontend",



                            )
                            Image(
                                painter = painterResource(id = R.drawable.java),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 20.dp)

                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Row {

                            Image(
                                painter = painterResource(id = R.drawable.react),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding()

                            )
                            Image(
                                painter = painterResource(id = R.drawable.python),
                                contentDescription = "Curso Frontend",
                                modifier = Modifier
                                    .padding(start = 20.dp)

                            )
                        }

                    }
                }
            }
        }
        BottomAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
            }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                        .offset(y = (-20.dp))
                        .padding(start = 16.dp, end = 16.dp)
                        //.background(Color.Magenta)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier

                    ){
                        FloatingActionButton(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            containerColor = colorResource(id = R.color.tech_color),
                            modifier = Modifier
                                .border(3.dp, Color.Black, CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.Warning, contentDescription ="Warning", tint = Color.White)

                        }
                        Text(
                            text =  stringResource(id = R.string.jobs),
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                    ){
                        FloatingActionButton(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            containerColor = colorResource(id = R.color.tech_color),
                            modifier = Modifier
                                .border(3.dp, Color.Black, CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.Star, contentDescription ="Experiencia", tint = Color.White)
                        }
                        Text(
                            text = stringResource(id = R.string.xp) ,
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                    ){
                        FloatingActionButton(
                            onClick = { navController.navigate("cursos/M4th3uz")},
                            shape = CircleShape,
                            containerColor = colorResource(id = R.color.tech_color),
                            modifier = Modifier
                                .border(3.dp, Color.Black, CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.PlayArrow, contentDescription ="Courses", tint = Color.White)

                        }
                        Text(
                            text = stringResource(id = R.string.cursos) ,
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(top = 8.dp))

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                    ){
                        FloatingActionButton(
                            onClick = { /*TODO*/ },
                            shape = CircleShape,
                            containerColor = colorResource(id = R.color.tech_color),
                            modifier = Modifier
                                .border(3.dp, Color.Black, CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.Notifications, contentDescription ="News", tint = Color.White)

                        }
                        Text(
                            text = stringResource(id = R.string.news) ,
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                    ){
                        FloatingActionButton(
                            onClick = {navController.navigate("menu/M4th3uz") },
                            shape = CircleShape,
                            containerColor = colorResource(id = R.color.tech_color),
                            modifier = Modifier
                                .border(3.dp, Color.Black, CircleShape)
                        ) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription ="menu", tint = Color.White)

                        }
                        Text(
                            text = stringResource(id = R.string.menu),
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(top = 8.dp)
                        )
                    }
                }
    }
}








