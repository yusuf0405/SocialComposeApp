package com.joseph.socialcomposeapp.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.joseph.socialcomposeapp.theme.SocialAppTheme

@Preview
@Composable
fun LoginScreenPreview() {
    SocialAppTheme {
        LoginScreen()

    }
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onNavigateToSignUpScreen: () -> Unit = {}
) {

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
