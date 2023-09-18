package com.example.techabrigo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_Aluno")
data class Aluno(
    @PrimaryKey (autoGenerate = true)var id: Long = 0,
    var nome: String = "",
    var sobrenome: String = "",
    @ColumnInfo(name = "data_nascimento")var dataNasc: String = "",
    var user: String = "",
    var password: String = "",
    var email: String = "",
    var sexo: String = "",
    @ColumnInfo(name = "termo_aceito")var termosAcepted: Boolean = false,
)
