package com.example.rappdicionario.commum

import com.example.rappdicionario.basededados.db.CategoriaDao
import proitdevelopers.com.bloomberg.viewModel.CategoriaSubViewModel
import proitdevelopers.com.bloomberg.viewModel.CategoriaViewModel
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel

val listaCategoria = mutableListOf("Actividade Agricola", "Culturas","Instrumentos","Peixe","Pesca")

lateinit var palavraViewModel: PalavraViewModel
lateinit var categoriaViewModel: CategoriaViewModel
lateinit var categoriaSubViewModel: CategoriaSubViewModel