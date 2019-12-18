package com.example.rappdicionario


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.adapter.adapterCategorias.ExpandableListViewAdapter
import com.example.rappdicionario.commum.listaCategoria
import kotlinx.android.synthetic.main.fragment_categorias.*

class CategoriasFragment : Fragment() {

    val titulo:MutableList<String> = ArrayList()
    val itensLista:MutableList<MutableList<String>> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_categorias, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        titulo.add("Actividade Agricola")
        titulo.add("Animais")
        titulo.add("Culturas")
        titulo.add("Instrumentos")
        titulo.add("Rega")

        itensLista.add(s1)
        itensLista.add(s2)
        itensLista.add(s3)
        itensLista.add(s4)



        expandableListView.setAdapter(ExpandableListViewAdapter(view.context,expandableListView,titulo,itensLista))

    }


    fun valoresEstaticos(){



    }


}
