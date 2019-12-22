package com.example.rappdicionario


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_descricao_palavra.*
import proitappsolutions.com.rumosstore.adapter.RecyclerImgAdapeter

class DescricaoPalavraFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_descricao_palavra, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoria = arguments?.let { DescricaoPalavraFragmentArgs.fromBundle(it).categoria }
        val palavra = arguments?.let { DescricaoPalavraFragmentArgs.fromBundle(it).palavra }
        val descricao = arguments?.let { DescricaoPalavraFragmentArgs.fromBundle(it).descricao }
        val foto = arguments?.let { DescricaoPalavraFragmentArgs.fromBundle(it).foto }

        if (categoria != null && palavra != null && foto != null && descricao != null) {
            palavra_tv.text = palavra
            categoria_tv.text = categoria
            descricao_txt.text = descricao
            legenda_tv.text = palavra
            val fotos = foto.split(",")
            if (fotos[0].length>2){
                confRealTimeRecycler(view.context,fotos)
            } else{
                recyclerView_imagens.visibility = View.GONE
                legenda_tv.visibility = View.GONE
            }
        }
        img_btn_voltar.setOnClickListener {  getFragmentManager()?.popBackStack() }
    }

    private fun confRealTimeRecycler(context: Context, imagens:List<String>){
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        val adapterConfAtualidade = RecyclerImgAdapeter(context,activity)
        recyclerView_imagens.layoutManager = layoutManager
        recyclerView_imagens.adapter = adapterConfAtualidade
        adapterConfAtualidade.setNoticias(imagens)
    }

}
