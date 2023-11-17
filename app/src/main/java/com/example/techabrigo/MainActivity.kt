package com.example.techabrigo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.techabrigo.CursoBackEnd.CursoBackEndScreen
import com.example.techabrigo.CursoQA.CursoQAScreen
import com.example.techabrigo.Menu.MenuScreen
import com.example.techabrigo.Termos.CursoFrontEndScreen
import com.example.techabrigo.Termos.TermosScreen
import com.example.techabrigo.cadastro.CadastroScreen
import com.example.techabrigo.cadastro.CadastroScreenViewModel
import com.example.techabrigo.cursos.CursosScreen
import com.example.techabrigo.login.LoginScreen
import com.example.techabrigo.login.LoginScreenViewModel
import com.example.techabrigo.ui.theme.TechAbrigoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TechAbrigoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = "login"){

                        composable(route = "login"){
                            LoginScreen(loginScreenViewModel = LoginScreenViewModel(), navController = navController )
                        }
                        composable(route = "cadastro"){
                            CadastroScreen(cadastroScreenViewModel = CadastroScreenViewModel(), navController = navController)
                        }
                        composable(route = "termos"){
                            TermosScreen(navController = navController )
                        }
                        composable(route = "cursoFrontEnd"){
                            CursoFrontEndScreen(navController = navController )
                        }
                        composable(route ="cursos"){
                            CursosScreen(navController = navController)
                        }
                        composable(route ="menu"){
                            MenuScreen(navController = navController)
                        }
                        composable(route ="cursoQA"){
                            CursoQAScreen(navController = navController)
                        }
                        composable(route ="cursoBack"){
                            CursoBackEndScreen(navController = navController)
                        }
                    }

                }
            }
        }
    }
}

