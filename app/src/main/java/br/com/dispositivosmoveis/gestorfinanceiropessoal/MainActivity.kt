package br.com.dispositivosmoveis.gestorfinanceiropessoal

import Home
import Login
import New_cont
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Configurando o Navigation
            /* a nossa variavel abaixo estará herdando de NavHostController que é quem permite a navegação
            entre telas*/
                    val navController = rememberNavController()
                                                                    //Id da minha tela
                    NavHost(navController = navController, startDestination = "Home"){
                        composable(
                            route = "Login"
                        ){
                            //Tela de Inicio
                            Login(navController)
                        }
                        composable(
                            route="Home"
                        ){
                            Home(navController)
                        }
                        composable(
                            route="New_Count"
                        ){
                            New_cont(navController)
                        }
                    }
                }
            }
        }


