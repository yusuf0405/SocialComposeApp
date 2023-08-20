package com.joseph.socialcomposeapp.auth.sign_up

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.joseph.kmmacademyapp.android.screens.auth.sign_up.SignUpScreen
import com.joseph.socialcomposeapp.auth.destinations.LoginDestination
import com.joseph.socialcomposeapp.auth.destinations.SignUpDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun SignUp(
    navigator: DestinationsNavigator,
) {
    val viewModel: SignUpViewModel = viewModel()
    val context = LocalContext.current
    val toastMessage = viewModel.toastFlow.collectAsState(initial = null)

    LaunchedEffect(toastMessage.value) {
        if (toastMessage.value != null) {
            Toast.makeText(
                context,
                toastMessage.value,
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    SignUpScreen(
        onNavigateToLoginScreen = {
            navigator.navigate(LoginDestination.route) {
                popUpTo(SignUpDestination.route) {
                    inclusive = true
                }
            }
        }
    )
}