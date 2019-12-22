package com.example.rappdicionario


import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
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

    var dialogRapp: Dialog? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)

        return inflater.inflate(R.layout.fragment_inicial_dic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initDialogo(view)
        img_rapp_logo.setOnClickListener { dialogRapp?.show() }
       edit_txt_pesquisa?.setOnKeyListener { v, keyCode, event ->
            if((event.action == KeyEvent.ACTION_DOWN)
                && (event.keyCode == KeyEvent.KEYCODE_ENTER)){
                if (!TextUtils.isEmpty(edit_txt_pesquisa.text.toString())){
                    activity?.let { it1 -> esconderTeclado(it1) }
                    activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                        HomeHostFragmentDirections
                            .actionHomeHostFragmentToPalavrasFiltradasFragment(edit_txt_pesquisa.text.toString())
                    )
                }
                return@setOnKeyListener true
            }
            false
        }

        edit_txt_pesquisa.setOnEditorActionListener(OnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                if (!TextUtils.isEmpty(edit_txt_pesquisa.text.toString())){
                    activity?.let { it1 -> esconderTeclado(it1) }
                    activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                        HomeHostFragmentDirections
                            .actionHomeHostFragmentToPalavrasFiltradasFragment(edit_txt_pesquisa.text.toString())
                    )
                }
                return@OnEditorActionListener true
            }
            false
        })

        edit_txt_pesquisa.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                palavraViewModel.palavraByPalavra("%${p0.toString()}%")?.observe(this@InicialDicFragment, Observer { palavras ->
                    palavras?.let {
                            confRealTimeRecycler(view.context,palavras)
                    }
                })
            }
        })

        tv_palavras_a_z.setOnClickListener {
            activity?.let { it1 -> esconderTeclado(it1) }
            activity?.findNavController(R.id.fragmentConteinerSessao_)?.navigate(
                InicialDicFragmentDirections
                    .actionInicialDicFragmentToTodasPalavrasFragment()
            )
        }
    }

    private fun confRealTimeRecycler(context: Context,pesqisarPor:List<Palavra>){
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        val adapterConfAtualidade = ResultadoAdapeter(context,activity,true)
        recyclerResultado.layoutManager = layoutManager
        recyclerResultado.adapter = adapterConfAtualidade
        adapterConfAtualidade.setNoticias(pesqisarPor)
    }

    private fun initDialogo(view: View) {
        dialogRapp = Dialog(view.context)
        dialogRapp?.setContentView(R.layout.dialogo_rapp_intro)
    }
}