package com.example.rappdicionario


import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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
import kotlinx.android.synthetic.main.fragment_inicial_dic.*
import proitappsolutions.com.rumosstore.adapter.ResultadoAdapeter
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel


class InicialDicFragment : Fragment() {

    var pesquisaRes: MutableList<String> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)

        return inflater.inflate(R.layout.fragment_inicial_dic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        edit_txt_pesquisa.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                Log.i("mudanca","")
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.i("mudanca","")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                palavraViewModel.palavraByPalavra("%${p0.toString()}%")?.observe(this@InicialDicFragment, Observer { palavras ->
                    palavras?.let {
                            confRealTimeRecycler(view.context,palavras)
                    }
                })
            }
        })
    }

    private fun confRealTimeRecycler(context: Context,pesqisarPor:List<Palavra>){
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        val adapterConfAtualidade = ResultadoAdapeter(context,activity)
        recyclerResultado.layoutManager = layoutManager
        recyclerResultado.adapter = adapterConfAtualidade
        adapterConfAtualidade.setNoticias(pesqisarPor)
    }
}