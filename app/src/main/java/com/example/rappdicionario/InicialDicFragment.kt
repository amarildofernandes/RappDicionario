package com.example.rappdicionario


import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.esconderTeclado
import com.example.rappdicionario.commum.palavraViewModel
import com.example.rappdicionario.fragmentos.fragmentoHost.HomeHostFragmentDirections
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

       edit_txt_pesquisa?.setOnKeyListener { v, keyCode, event ->
            if((event.action == KeyEvent.ACTION_DOWN)
                && (event.keyCode == KeyEvent.KEYCODE_ENTER)){
                activity?.let { it1 -> esconderTeclado(it1) }
                activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                    HomeHostFragmentDirections
                        .actionHomeHostFragmentToDescricaoPalavraFragment("","","","")
                )
                Toast.makeText(view.context,"Enter",Toast.LENGTH_SHORT).show()
                return@setOnKeyListener true
            }
            false
        }

        edit_txt_pesquisa.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                activity?.let { it1 -> esconderTeclado(it1) }

                activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                    HomeHostFragmentDirections
                        .actionHomeHostFragmentToDescricaoPalavraFragment("","","","")
                )

                Toast.makeText(view.context,"Pesquisou",Toast.LENGTH_SHORT).show()
                return@OnEditorActionListener true
            }
            false
        })

        edit_txt_pesquisa.setImeActionLabel("Pesquisar",KeyEvent.KEYCODE_ENTER)

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