package com.example.techabrigo.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.techabrigo.model.Aluno

@Dao
interface AlunoDao {

    @Insert
    fun salvar(aluno: Aluno): Long

    @Update
    fun atualizar(aluno: Aluno): Int

    @Delete
    fun excuir(aluno: Aluno): Int

    @Query("SELECT * FROM tbl_aluno WHERE id = :id")
    fun buscar(id: Int): Aluno

}