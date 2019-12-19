package com.example.rappdicionario.basededados.daos

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.rappdicionario.basededados.db.CategoriaDao
import com.example.rappdicionario.basededados.db.CategoriaSubDao
import com.example.rappdicionario.basededados.db.PalavraDao
import com.example.rappdicionario.basededados.entidade.Categoria
import com.example.rappdicionario.basededados.entidade.CategoriaSub
import com.example.rappdicionario.basededados.entidade.Palavra

@Database(entities = [Palavra::class,Categoria::class,CategoriaSub::class],
    version = 1)
abstract class DbDicionarioRapp:RoomDatabase() {

    abstract fun palavraDao(): PalavraDao
    abstract fun categoriaDao(): CategoriaDao
    abstract fun categoriaSubDao(): CategoriaSubDao

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