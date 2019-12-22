package com.example.rappdicionario


import android.content.Context
import android.os.Bundle
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
import kotlinx.android.synthetic.main.fragment_todas_palavras.*
import kotlinx.android.synthetic.main.fragment_todas_palavras.view.*
import proitappsolutions.com.rumosstore.adapter.TodasPalavrasAdapter
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel

class TodasPalavrasFragment : Fragment() {

    lateinit var layoutManager: LinearLayoutManager
    internal val palavrasColecti = mutableListOf<Palavra>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_todas_palavras, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)

        palavraViewModel.palavrasLista.observe(this@TodasPalavrasFragment, Observer { palavras ->
            palavras?.let {

                for (palavra in palavras){
                    palavrasColecti.add(palavra)
                }
                palavrasColecti.let {
                    confRealTimeRecyclerPalavras(view.context,palavrasColecti)

                }
            }
        })

        view.ic_voltar_todas_palavras.setOnClickListener {  getFragmentManager()?.popBackStack() }

    }

    private fun confRealTimeRecyclerPalavras(context: Context, palavras:List<Palavra>){

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        val adapterConfAtualidade = TodasPalavrasAdapter(context,activity,tv_az)
        recyclerToasPalavras.layoutManager = layoutManager
        recyclerToasPalavras.adapter = adapterConfAtualidade
        adapterConfAtualidade.setNoticias(palavras)

    }

}
