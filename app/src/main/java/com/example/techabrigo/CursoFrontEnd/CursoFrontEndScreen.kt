package com.example.techabrigo.Termos


import YoutubeVideoPlayer
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.ui.theme.BlackOpsOne


@Composable
fun CursoFrontEndScreen(navController: NavController) {

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
                            text = stringResource(id = R.string.trilha_front),
                            color = Color.White,
                            fontFamily = BlackOpsOne,
                        )
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {navController.navigate("cursos/{user}")}
                        ) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowLeft,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    }
                )
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                item {
                    Column {
                        Text(
                            text = "01 - Instalando Ferramentas",
                            fontSize = 20.sp,
                            color = Color.White,
                            fontFamily = BlackOpsOne,
                            modifier = Modifier
                                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                        )
                        YoutubeVideoPlayer(videoId = "UForX7ehChM")
                    }
                }
            }
        }
    }
}
