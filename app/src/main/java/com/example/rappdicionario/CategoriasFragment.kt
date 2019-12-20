package com.example.rappdicionario

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.rappdicionario.adapter.adapterCategorias.ExpandableListViewAdapter
import com.example.rappdicionario.commum.categoriaViewModel
import kotlinx.android.synthetic.main.fragment_categorias.*
import proitdevelopers.com.bloomberg.viewModel.CategoriaViewModel

class CategoriasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_categorias, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoriaViewModel = ViewModelProviders.of(this).get(CategoriaViewModel::class.java)

        categoriaViewModel.categoriaLista.observe(this, androidx.lifecycle.Observer { categorias ->


            categorias?.let {
                if (categorias.size>0){

                    val titulo:MutableList<String> = ArrayList()
                    val itensLista:MutableList<MutableList<String>> = ArrayList()

                    for (categ in categorias){
                        titulo.add(categ.categoria)
                        Log.i("xxnaxa",categ.categoria)
                    }

                    val s1 :MutableList<String> = ArrayList()
                    s1.add("xxxxxx1")
                    s1.add("xxxxxx2")
                    s1.add("xxxxxx3")

                    val s2 :MutableList<String> = ArrayList()
                    s2.add("xxxxxx1")
                    s2.add("xxxxxx2")
                    s2.add("xxxxxx3")

                    val s3 :MutableList<String> = ArrayList()
                    s3.add("xxxxxx1")
                    s3.add("xxxxxx2")
                    s3.add("xxxxxx3")

                    val s4 :MutableList<String> = ArrayList()
                    s4.add("xxxxxx1")
                    s4.add("xxxxxx2")
                    s4.add("xxxxxx3")

                    itensLista.add(s1)
                    itensLista.add(s2)
                    itensLista.add(s3)
                    itensLista.add(s4)
                    itensLista.add(s4)
                    itensLista.add(s4)

                    //expandableListView.setAdapter(ExpandableListViewAdapter(view.context,expandableListView,titulo,itensLista,activity))
                }
            }
        })
    }
}
