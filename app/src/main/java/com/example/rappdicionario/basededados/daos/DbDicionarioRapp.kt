package com.example.rappdicionario.basededados.daos

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rappdicionario.basededados.db.PalavraDao
import com.example.rappdicionario.basededados.entidade.Palavra

@Database(entities = [Palavra::class],
    version = 1)
abstract class DbDicionarioRapp:RoomDatabase() {

    abstract fun palavraDao(): PalavraDao

    companion object{
        @Volatile
        private var dbDicionarioRapp : DbDicionarioRapp? = null

        internal fun getDataBase(context: Context):DbDicionarioRapp?{
            if (dbDicionarioRapp == null){
                synchronized(DbDicionarioRapp::class.java){
                    if (dbDicionarioRapp == null){
                        dbDicionarioRapp = Room.databaseBuilder(
                            context.applicationContext,
                            DbDicionarioRapp::class.java,"db_dicionario")
                            .build()
                    }
                }
            }
            return dbDicionarioRapp
        }
    }
}