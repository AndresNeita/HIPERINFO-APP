package com.example.proyectocoitl

import android.database.CursorWindow
import android.view.Window
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsAnimationControllerCompat
import androidx.core.view.WindowInsetsControllerCompat

fun setFullScren (window: Window){
    WindowCompat.setDecorFitsSystemWindows(window,false)

}

fun lightStatusBar(window: Window, islight : Boolean = true){
    val wic = WindowInsetsControllerCompat(window,window.decorView)
    wic.isAppearanceLightStatusBars = islight
}