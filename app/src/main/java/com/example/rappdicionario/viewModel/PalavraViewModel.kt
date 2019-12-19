package proitdevelopers.com.bloomberg.viewModel

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.rappdicionario.basededados.daos.DbDicionarioRapp
import com.example.rappdicionario.basededados.db.PalavraDao
import com.example.rappdicionario.basededados.entidade.Palavra

class PalavraViewModel(application:Application):AndroidViewModel(application) {

    private val palavraDao: PalavraDao
    internal val palavrasLista:LiveData<List<Palavra>>

    init {
        val dbMediaRumo = DbDicionarioRapp.getDataBase(application)
        palavraDao = dbMediaRumo!!.palavraDao()
        palavrasLista = palavraDao.listarPalavras
    }

    fun insertUsuario(palavra:Palavra){
        InsertAsyncTask(palavraDao).execute(palavra)
    }

    fun palavraByPalavra(palavraProcurada:String):LiveData<List<Palavra>>?{
        return palavraDao.palavraProcuradaQuery(palavraProcurada)
    }

    fun deleteUsuarioSessao(palavra: Palavra){
        DeleteAsyncTask(palavraDao).execute(palavra)
    }

    fun deleteTodasUsuarios(){
        DeleteAllAsyncTask(palavraDao).execute()
    }

    companion object{
        private class InsertAsyncTask(private val mpalavraDao: PalavraDao):AsyncTask<Palavra,Void,Void>(){
            override fun doInBackground(vararg usuario: Palavra): Void? {
                mpalavraDao.inserirPalavra(usuario[0])
                return null
            }
        }

        private class DeleteAsyncTask(private val mpalavraDao: PalavraDao): AsyncTask<Palavra,Void,Void>(){
            override fun doInBackground(vararg usuario: Palavra): Void? {
                mpalavraDao.apagarPalavras(usuario[0])
                return null
            }
        }

        private class DeleteAllAsyncTask(private val mpalavraDao: PalavraDao): AsyncTask<Palavra,Void,Void>(){
            override fun doInBackground(vararg usuario: Palavra): Void? {
                mpalavraDao.apagarTodasPalavras()
                return null
            }
        }

    }

}