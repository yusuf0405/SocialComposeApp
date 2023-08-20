package com.joseph.kmmacademyapp.android.screens.auth.sign_up

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.joseph.socialcomposeapp.theme.SocialAppTheme

@Preview
@Composable
fun SignUpScreenPreview() {
    SocialAppTheme {
        SignUpScreen()

    }
}

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    onNavigateToLoginScreen: () -> Unit = {}
) {

    val gray = Color.Gray.copy(alpha = 0.5f)

    val uiController = rememberSystemUiController()

    uiController.setStatusBarColor(
        color = MaterialTheme.colors.background,
        darkIcons = !isSystemInDarkTheme()
    )
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
    }
}
