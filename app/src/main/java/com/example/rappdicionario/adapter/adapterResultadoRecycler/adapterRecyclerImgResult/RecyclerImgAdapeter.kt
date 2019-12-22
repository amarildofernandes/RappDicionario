package proitappsolutions.com.rumosstore.adapter

import android.content.Context
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rappdicionario.InicialDicFragment
import com.example.rappdicionario.R
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.esconderTeclado
import com.example.rappdicionario.fragmentos.fragmentoHost.HomeHostFragmentDirections
import kotlinx.android.synthetic.main.item_descricao_palavra.view.*
import kotlinx.android.synthetic.main.item_resultado_pesquisa.view.*

class RecyclerImgAdapeter(private val context: Context,
                          private val activity: FragmentActivity?) : RecyclerView.Adapter<RecyclerImgAdapeter.MyViewHolder>() {

    private var resultadosRoom: List<String> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_descricao_palavra, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = resultadosRoom.size

    override fun onBindViewHolder(holder: MyViewHolder, posicao: Int) {
            holder.mudarDados(posicao)
    }

    fun setNoticias(resultados: List<String>) {
        resultadosRoom = resultados
        notifyDataSetChanged()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun mudarDados(posicao: Int) {
            Glide.with(context).load(Uri.parse(resultadosRoom[posicao])).into(itemView.img_result)
        }

    }

}