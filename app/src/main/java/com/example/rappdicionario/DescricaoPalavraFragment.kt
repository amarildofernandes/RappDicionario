package com.example.rappdicionario


import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_descricao_palavra.*

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
            Glide.with(view.context).load(Uri.parse(foto)).into(img_result)
        }
        img_btn_voltar.setOnClickListener {  getFragmentManager()?.popBackStack() }
    }


}
