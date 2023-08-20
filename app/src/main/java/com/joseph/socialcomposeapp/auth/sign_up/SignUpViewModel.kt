package com.joseph.socialcomposeapp.auth.sign_up

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class SignUpViewModel : ViewModel() {

    private val _toastFlow = MutableSharedFlow<String>(1)
    val toastFlow = _toastFlow.asSharedFlow()
}