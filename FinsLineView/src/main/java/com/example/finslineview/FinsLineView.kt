package com.example.finslineview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.content.Context
import android.app.Activity

val colors : Array<String> = arrayOf(
    "#f44336",
    "#9C27B0",
    "#BF360C",
    "#00C853",
    "#1A237E"
)
val parts : Int = 4
val strokeFactor : Float = 90f
val scGap : Float = 0.02f / parts
val sizeFactor : Float = 2.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val rot : Float = 45f

