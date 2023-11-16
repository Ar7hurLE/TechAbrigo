package com.example.techabrigo.Termos

import Video
import YoutubeVideoPlayer
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
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.techabrigo.R
import com.example.techabrigo.ui.theme.BlackOpsOne



@Composable
fun CursoFrontEndScreen(navController: NavController) {

    var expandedVideo by rememberSaveable { mutableStateOf<Int?>(null) }
    val listState = rememberLazyListState()
    val videos = listOf(
        Video("01 - Instalando Ferramentas","UForX7ehChM"),
        Video("02 - Seu primeiro código HTML","E6CdIawPTh0"),
        Video("03 - Parágrafos e Quebras","f6NTJdtEFOc"),
        Video("04 - Símbolos e Emoji no seu site","nhMdFe3WwYc"),
        Video("05 - Você tem o direito de usar qualquer imagem no seu site?","bDULqeGEvAw"),
        Video("06 - Quais são os formatos para imagens na Web?","xg-vHgLF0mI&list"),
        Video("07 - O tamanho das imagens importa para um site?","8rkuukKA8a4"),
        Video("08 - A tag img em HTML5 ","CwOmEetWMnU")
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)

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
                            onClick = { navController.navigate("cursos") }
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
            ) {
                item {
                Image(
                    painter = painterResource(id = R.drawable.frontend),
                    contentDescription = "Screen Notification",
                    modifier = Modifier
                        .requiredHeight(200.dp)
                        //.requiredWidth(800.dp)
                        .background(Color.Black)
                )
            }
                itemsIndexed(videos) { index, video ->
                    val isExpanded = index == expandedVideo
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .clickable {
                                expandedVideo = if (isExpanded) null else index
                            }
                    ) {
                            Column {
                                Text(
                                    text = video.title,
                                    fontSize = 20.sp,
                                    color = Color.White,
                                    fontFamily = BlackOpsOne,
                                    modifier = Modifier
                                        .padding(bottom = 10.dp)
                                )
                                if (!isExpanded) {
                                    Divider(
                                        color = Color.White,
                                        thickness = 1.dp,
                                    )
                                }
                                if (isExpanded) {
                                    YoutubeVideoPlayer(videoId = video.videoId)
                                }
                            }
                        }
                    }
                        item {
                            BottomAppBar(
                                backgroundColor = colorResource(id = R.color.logout),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(70.dp)
                                    .clickable { navController.navigate("cursos") },
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
                                        text = stringResource(id = R.string.logout_trilha),
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
            }
        }