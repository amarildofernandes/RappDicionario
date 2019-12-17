package com.example.rappdicionario


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.adapter.CategoriasAdapeter
import com.example.rappdicionario.commum.listaCategoria
import kotlinx.android.synthetic.main.fragment_categorias.*

class CategoriasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_categorias, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val layoutManager = LinearLayoutManager(context)
            layoutManager.orientation = RecyclerView.VERTICAL
            val adapterCategorias = CategoriasAdapeter(view.context, listaCategoria, activity)
            recycler_categorias.layoutManager = layoutManager
            recycler_categorias.adapter = adapterCategorias

    }



}
