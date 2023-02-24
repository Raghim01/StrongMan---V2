package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class NavRoute(val route: String){
    object MainScreen:NavRoute("choice_page")
    object ExercisePage:NavRoute("exercise_page")
    object FullBodyWorkout:NavRoute("fullbody_page")
    object ArmWorkoutPage:NavRoute("arm_page")
    object BackWorkoutPage:NavRoute("back_page")
    object LegWorkoutPage:NavRoute("leg_page")
    object ProfilePage:NavRoute("profile_page")
    object BMICalculatorPage:NavRoute("bmi_page")
    object RatePage:NavRoute("rate_page")
    object PPPage:NavRoute("policy_page")
    object SharePage:NavRoute("share_page")
    object ContactUs:NavRoute("contact_us")
}

@Composable
fun GymNavHost (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavRoute.MainScreen.route){
        composable(NavRoute.MainScreen.route){ MainScreen(navController = navController) }
        composable(NavRoute.ExercisePage.route){ ExercisePage(navController = navController) }
        composable(NavRoute.FullBodyWorkout.route){ FullBodyWorkoutPage(navController = navController) }
        composable(NavRoute.ArmWorkoutPage.route){ ArmWorkoutPage(navController = navController) }
        composable(NavRoute.BackWorkoutPage.route){ BackWorkoutPage(navController = navController) }
        composable(NavRoute.LegWorkoutPage.route){ LegWorkoutPage(navController = navController) }
        composable(NavRoute.ProfilePage.route){ ProfilePage(navController = navController) }
        composable(NavRoute.BMICalculatorPage.route){ BMICalculatorPage(navController = navController) }
        composable(NavRoute.RatePage.route){ RatePageScreen(navController = navController)}
        composable(NavRoute.PPPage.route){ PrivacyPolicy(navController = navController)}
        composable(NavRoute.SharePage.route){ ShareScreen(navController = navController)}
        composable(NavRoute.ContactUs.route){ ContactUsScreen(navController = navController)}
    }
}