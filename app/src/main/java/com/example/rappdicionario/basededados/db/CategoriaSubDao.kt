package com.example.rappdicionario.basededados.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.rappdicionario.basededados.entidade.Categoria
import com.example.rappdicionario.basededados.entidade.CategoriaSub
import com.example.rappdicionario.basededados.entidade.Palavra

@Dao
interface CategoriaSubDao {

    @Insert
    fun inserirCategoria(categoriaSub: CategoriaSub)

    @get:Query("SELECT * FROM categoriasub")
    val listarCategoriaSub:LiveData<List<CategoriaSub>>

    @Delete
    fun apagarCategoriaSub(categoriaSub: CategoriaSub)

    @Query("DELETE FROM categoriasub")
    fun apagarTodasCategoriasSub()

}