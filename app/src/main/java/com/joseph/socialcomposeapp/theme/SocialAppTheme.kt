package com.joseph.socialcomposeapp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.joseph.socialcomposeapp.theme.DarkColors
import com.joseph.socialcomposeapp.theme.LightColors
import com.joseph.socialcomposeapp.theme.Shapes
import com.joseph.socialcomposeapp.theme.Typography

@Composable
fun SocialAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colors = colors,
        shapes = Shapes,
        typography = Typography,
        content = content
    )
}
