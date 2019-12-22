package proitappsolutions.com.rumosstore.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rappdicionario.InicialDicFragment
import com.example.rappdicionario.PalavrasFiltradasFragmentDirections
import com.example.rappdicionario.R
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.esconderTeclado
import com.example.rappdicionario.fragmentos.fragmentoHost.HomeHostFragmentDirections
import kotlinx.android.synthetic.main.item_resultado_pesquisa.view.*

class ResultadoAdapeter(private val context: Context,
                        private val activity: FragmentActivity?,
                        private val quem: Boolean ) : RecyclerView.Adapter<ResultadoAdapeter.MyViewHolder>() {

    private var resultadosRoom: List<Palavra> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_resultado_pesquisa, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = resultadosRoom.size

    override fun onBindViewHolder(holder: MyViewHolder, posicao: Int) {
            holder.mudarDados(posicao)
    }

    fun setNoticias(resultados: List<Palavra>) {
        resultadosRoom = resultados
        notifyDataSetChanged()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun mudarDados(posicao: Int) {
            itemView.resultado_tv.text = resultadosRoom[posicao].palavra
            itemView.setOnClickListener {
                activity?.let { it1 -> esconderTeclado(it1) }

                if (quem == true){
                    activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                        HomeHostFragmentDirections
                            .actionHomeHostFragmentToDescricaoPalavraFragment(
                                resultadosRoom[posicao].palavra,resultadosRoom[posicao].categoria,
                                resultadosRoom[posicao].imagem,resultadosRoom[posicao].descricao)
                    )
                }else{
                    activity?.findNavController(R.id.fragmentConteinerSplash)?.navigate(
                        PalavrasFiltradasFragmentDirections
                            .actionPalavrasFiltradasFragmentToDescricaoPalavraFragment(
                                resultadosRoom[posicao].palavra,resultadosRoom[posicao].categoria,
                                resultadosRoom[posicao].imagem,resultadosRoom[posicao].descricao)
                    )
                }
            }
        }

    }

}