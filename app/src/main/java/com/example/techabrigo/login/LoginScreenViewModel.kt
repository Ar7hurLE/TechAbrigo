package com.example.techabrigo.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginScreenViewModel: ViewModel() {

    private val _user = MutableLiveData<String>()
    val user: LiveData<String> = _user

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    fun onUserChanged(newUser: String) {
        _user.value = newUser
    }


    fun onPasswordChanged(newPassword: String) {
        _password.value = newPassword
    }

}
