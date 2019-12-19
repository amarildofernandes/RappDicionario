package com.example.rappdicionario.basededados.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.rappdicionario.basededados.entidade.Palavra

@Dao
interface PalavraDao {

    @Insert
    fun inserirPalavra(palavra: Palavra)

    @Query("SELECT * FROM palavras WHERE palavra LIKE :palavraProcurada")
    fun palavraProcuradaQuery(palavraProcurada:String):LiveData<List<Palavra>>

    @get:Query("SELECT * FROM palavras")
    val listarPalavras:LiveData<List<Palavra>>

    @Delete
    fun apagarPalavras(palavra: Palavra)

    @Query("DELETE FROM palavras")
    fun apagarTodasPalavras()


}