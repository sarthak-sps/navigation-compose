package com.example.navigationcompose

sealed class Screen(val route:String) {
    object MainScreen :Screen("main_screen")
    object DetailsScreen :Screen("detail_screen")

    fun withArgs(vararg args:String):String
    {
        return buildString{
            append(route)
            args.forEach { args-> append("/$args") }
        }
    }
}