package com.example.techabrigo.database.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.techabrigo.model.Aluno

@Database(
    entities = [Aluno:: class], version = 1)
abstract class AlunoDb: RoomDatabase(){

    abstract fun alunoDao(): AlunoDao

    companion object{
        private lateinit var instance: AlunoDb

        fun getDatabase(context: Context): AlunoDb{
            if (!::instance.isInitialized){
                instance = Room
                    .databaseBuilder(
                        context,
                        AlunoDb::class.java,
                        "Aluno_db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }

    }
}