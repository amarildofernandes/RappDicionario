package com.example.rappdicionario


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.palavraViewModel
import kotlinx.android.synthetic.main.fragment_palavras_filtradas.*
import kotlinx.android.synthetic.main.fragment_palavras_filtradas.view.*
import proitappsolutions.com.rumosstore.adapter.ResultadoAdapeter
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel

class PalavrasFiltradasFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_palavras_filtradas, container, false)
        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)
        val palavra = arguments?.let { PalavrasFiltradasFragmentArgs.fromBundle(it).prefixo }
        if (palavra!=null){
            view.tv_inicial_pesquisa.text = "${palavra.substring(0,1).capitalize()}"
            palavraViewModel.palavraByPalavra("%${palavra}%")?.observe(this@PalavrasFiltradasFragment, Observer { palavras ->
                palavras?.let {
                    confRealTimeRecycler(view,palavras)
                    view.tv_resultados.text = "Cerca de ${palavras.size} resultados"
                }
                if (palavras.size==0)
                    view.recyclerView_resultado_pesquisa.visibility = View.GONE
            })
        }

        view.ic_voltar_palavra_filtrada.setOnClickListener {  getFragmentManager()?.popBackStack() }

        return view
    }

    private fun confRealTimeRecycler(view: View, palavras: List<Palavra>) {
            val layoutManager = LinearLayoutManager(context)
            layoutManager.orientation = RecyclerView.VERTICAL
            val adapterConfAtualidade = ResultadoAdapeter(view.context,activity,false)
            view.recyclerView_resultado_pesquisa.layoutManager = layoutManager
            view.recyclerView_resultado_pesquisa.adapter = adapterConfAtualidade
            adapterConfAtualidade.setNoticias(palavras)
    }

}
