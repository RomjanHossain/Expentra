package com.dstore.expensetracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.dstore.expensetracker.R

val fonts = FontFamily(
    Font(R.font.inter_regular),
    Font(R.font.inter_italic, style = FontStyle.Italic),

    Font(R.font.inter_black),
    Font(R.font.inter_blackitalic, style = FontStyle.Italic),

    Font(R.font.inter_bold, weight = FontWeight.Bold),
    Font(R.font.inter_bolditalic, weight = FontWeight.Bold, style = FontStyle.Italic),

    Font(R.font.inter_extrabold, weight = FontWeight.ExtraBold),
    Font(R.font.inter_extrabolditalic, weight = FontWeight.ExtraBold, style = FontStyle.Italic),

    Font(R.font.inter_extralight, weight = FontWeight.ExtraLight,),
    Font(R.font.inter_extralightitalic, weight = FontWeight.ExtraLight, style = FontStyle.Italic),


    Font(R.font.inter_light, weight = FontWeight.Light,),
    Font(R.font.inter_lightitalic, weight = FontWeight.Light, style = FontStyle.Italic),

    Font(R.font.inter_medium, weight = FontWeight.Medium,),
    Font(R.font.inter_mediumitalic, weight = FontWeight.Medium, style = FontStyle.Italic),


    Font(R.font.inter_semibold, weight = FontWeight.SemiBold,),
    Font(R.font.inter_semibolditalic, weight = FontWeight.SemiBold, style = FontStyle.Italic),

    Font(R.font.inter_thin, weight = FontWeight.Thin),
    Font(R.font.inter_thinitalic, weight = FontWeight.Thin, style = FontStyle.Italic),

    )

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 19.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 19.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 18.sp,
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)
