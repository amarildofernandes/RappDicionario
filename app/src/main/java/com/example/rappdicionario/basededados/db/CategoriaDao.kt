package com.example.rappdicionario.basededados.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.rappdicionario.basededados.entidade.Categoria
import com.example.rappdicionario.basededados.entidade.Palavra

@Dao
interface CategoriaDao {

    @Insert
    fun inserirCategoria(categoria:Categoria)

    @get:Query("SELECT * FROM categoria")
    val listarCategoria:LiveData<List<Categoria>>

    @Delete
    fun apagarCategoria(categoria: Categoria)

    @Query("DELETE FROM categoria")
    fun apagarTodasCategorias()


}