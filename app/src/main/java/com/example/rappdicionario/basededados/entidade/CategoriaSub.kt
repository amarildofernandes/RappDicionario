package com.example.rappdicionario.basededados.entidade

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categoriasub")
class CategoriaSub (
        @field:PrimaryKey
        var idCatSub: String,
        var catSub: String,
        val descricao:String,
        val categoriaPai:String
)