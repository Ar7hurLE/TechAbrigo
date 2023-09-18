package com.example.techabrigo.cadastro

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class CadastroScreenViewModel {

    private val _abrigosList = MutableLiveData<List<String>>(listOf("Crianca Feliz", "Pote de Ouro", "Sorriso no Olhar"))
    val abrigosList: LiveData<List<String>> = _abrigosList

    private val _abrigo = MutableLiveData<String>()
    val abrigo: LiveData<String> = _abrigo

    private val _sexo = MutableLiveData<String>()
    val sexo: LiveData<String> = _sexo

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _email = MutableLiveData<String>()
    val email : LiveData<String> = _email

    private val _terms = MutableLiveData<Boolean>()
    val terms : LiveData<Boolean> = _terms

    private val _lastName = MutableLiveData<String>()
    val lastName: LiveData<String> = _lastName

    private val _date = MutableLiveData<String>()
    val date: LiveData<String> = _date

    private val _password = MutableLiveData<String>()
    val password : LiveData<String> = _password

    private val _user = MutableLiveData<String>()
    val user : LiveData<String> = _user

    fun onUserChanged(newUser: String){
        _user.value = newUser
    }

    fun onPasswordChanged(newPassword: String){
        _password.value = newPassword
    }
    fun onTermsAcepted(newTerms: Boolean){
        _terms.value = newTerms
    }
    fun onSexoChanged(newSexo: String){
        _sexo.value = newSexo
    }
    fun onEmailChanged(newEmail: String){
        _email.value = newEmail
    }
    fun onAbrigoChanged(newAbrigo: String) {
        _abrigo.value = newAbrigo
    }

    fun onNameChanged(newName: String) {
        _name.value = newName
    }

    fun onLastNameChanged(newLastName: String) {
        _lastName.value = newLastName
    }

    fun onDateChanged(newDate: String) {
        _date.value = newDate
    }
}

