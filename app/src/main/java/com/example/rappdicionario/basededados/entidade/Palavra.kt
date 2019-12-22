package com.example.rappdicionario.basededados.entidade

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "palavras")
class Palavra (
        @field:PrimaryKey
        var idPalavras: String,
        var categoria: String,
        val palavra: String,
        val descricao:String,
        val imagem:String
)