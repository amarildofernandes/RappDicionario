package com.example.rappdicionario.basededados.entidade

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categoria")
class Categoria (
        @field:PrimaryKey
        var idCategoria: String,
        var categoria: String,
        val descricao:String
)