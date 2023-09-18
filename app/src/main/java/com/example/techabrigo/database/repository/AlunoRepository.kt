package com.example.techabrigo.database.repository

import android.content.Context
import com.example.techabrigo.database.dao.AlunoDb
import com.example.techabrigo.model.Aluno

class AlunoRepository(context: Context){

    var db = AlunoDb.getDatabase(context).alunoDao()

    fun salvar(aluno: Aluno): Long {
        return db.salvar(aluno = aluno)
    }
    fun atualizar(aluno: Aluno): Int {
        return db.atualizar(aluno = aluno)
    }
    fun excluir(aluno: Aluno): Int {
        return db.excuir(aluno = aluno)
    }

}