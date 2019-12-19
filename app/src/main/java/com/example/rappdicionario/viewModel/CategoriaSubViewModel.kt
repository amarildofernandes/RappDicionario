package proitdevelopers.com.bloomberg.viewModel

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.rappdicionario.basededados.daos.DbDicionarioRapp
import com.example.rappdicionario.basededados.db.CategoriaSubDao
import com.example.rappdicionario.basededados.entidade.Categoria
import com.example.rappdicionario.basededados.entidade.CategoriaSub

class CategoriaSubViewModel(application:Application):AndroidViewModel(application) {

    private val categoriaSubDao: CategoriaSubDao
    internal val categoriaSubLista:LiveData<List<CategoriaSub>>

    init {
        val dbMediaRumo = DbDicionarioRapp.getDataBase(application)
        categoriaSubDao = dbMediaRumo!!.categoriaSubDao()
        categoriaSubLista = categoriaSubDao.listarCategoriaSub
    }

    fun insertCategoria(categoriaSub:CategoriaSub){
        InsertAsyncTask(categoriaSubDao).execute(categoriaSub)
    }

    fun deleteCategoria(categoriaSub: CategoriaSub){
        DeleteAsyncTask(categoriaSubDao).execute(categoriaSub)
    }

    fun deleteTodasCategorias(){
        DeleteAllAsyncTask(categoriaSubDao).execute()
    }

    companion object{
        private class InsertAsyncTask(private val mCategoriaDao: CategoriaSubDao):AsyncTask<CategoriaSub,Void,Void>(){
            override fun doInBackground(vararg categoriaSub: CategoriaSub): Void? {
                mCategoriaDao.inserirCategoria(categoriaSub[0])
                return null
            }
        }

        private class DeleteAsyncTask(private val mCategoriaDao: CategoriaSubDao): AsyncTask<CategoriaSub,Void,Void>(){
            override fun doInBackground(vararg categoriaSub: CategoriaSub): Void? {
                mCategoriaDao.apagarCategoriaSub(categoriaSub[0])
                return null
            }
        }

        private class DeleteAllAsyncTask(private val mCategoriaDao: CategoriaSubDao): AsyncTask<CategoriaSub,Void,Void>(){
            override fun doInBackground(vararg categoriaSub: CategoriaSub): Void? {
                mCategoriaDao.apagarTodasCategoriasSub()
                return null
            }
        }

    }

}