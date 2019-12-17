package com.example.rappdicionario.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.R
import kotlinx.android.synthetic.main.item_categorias_parent.view.*

class CategoriasAdapeter(
        private val context: Context,
        private val listaCategorias: MutableList<String>,
        private val activity: FragmentActivity?) : RecyclerView.Adapter<CategoriasAdapeter.MyViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_categorias_parent, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = listaCategorias.size

    override fun onBindViewHolder(holder: MyViewHolder, posicao: Int) {
            holder.mudarDados(posicao)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun mudarDados(posicao: Int) {
        itemView.txt_categoria.text = listaCategorias.get(posicao)
    }

    }
}