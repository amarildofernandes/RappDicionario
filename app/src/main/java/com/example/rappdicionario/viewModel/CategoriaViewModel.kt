package proitdevelopers.com.bloomberg.viewModel

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.rappdicionario.basededados.daos.DbDicionarioRapp
import com.example.rappdicionario.basededados.db.CategoriaDao
import com.example.rappdicionario.basededados.entidade.Categoria

class CategoriaViewModel(application:Application):AndroidViewModel(application) {

    private val categoriaDao: CategoriaDao
    internal val categoriaLista:LiveData<List<Categoria>>

    init {
        val dbMediaRumo = DbDicionarioRapp.getDataBase(application)
        categoriaDao = dbMediaRumo!!.categoriaDao()
        categoriaLista = categoriaDao.listarCategoria
    }

    fun insertCategoria(categoria:Categoria){
        InsertAsyncTask(categoriaDao).execute(categoria)
    }

    fun deleteCategoria(categoria: Categoria){
        DeleteAsyncTask(categoriaDao).execute(categoria)
    }

    fun deleteTodasCategorias(){
        DeleteAllAsyncTask(categoriaDao).execute()
    }

    companion object{
        private class InsertAsyncTask(private val mCategoriaDao: CategoriaDao):AsyncTask<Categoria,Void,Void>(){
            override fun doInBackground(vararg categoria: Categoria): Void? {
                mCategoriaDao.inserirCategoria(categoria[0])
                return null
            }
        }

        private class DeleteAsyncTask(private val mCategoriaDao: CategoriaDao): AsyncTask<Categoria,Void,Void>(){
            override fun doInBackground(vararg categoria: Categoria): Void? {
                mCategoriaDao.apagarCategoria(categoria[0])
                return null
            }
        }

        private class DeleteAllAsyncTask(private val mCategoriaDao: CategoriaDao): AsyncTask<Categoria,Void,Void>(){
            override fun doInBackground(vararg categoria: Categoria): Void? {
                mCategoriaDao.apagarTodasCategorias()
                return null
            }
        }

    }

}