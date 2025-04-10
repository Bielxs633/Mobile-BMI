package br.senai.sp.jandira.bmi.model

import androidx.compose.ui.graphics.Color

data class Bmi(

    var color: Color = Color.Transparent,
    var status: BmiStatus = BmiStatus.NORMAL,
    var bmiValues: Pair<String, Double> = Pair("", 0.0)

)
