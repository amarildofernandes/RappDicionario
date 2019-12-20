package com.example.rappdicionario.activitys

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.rappdicionario.R
import com.example.rappdicionario.basededados.entidade.Categoria
import com.example.rappdicionario.basededados.entidade.CategoriaSub
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.categoriaSubViewModel
import com.example.rappdicionario.commum.categoriaViewModel
import com.example.rappdicionario.commum.palavraViewModel
import proitdevelopers.com.bloomberg.viewModel.CategoriaSubViewModel
import proitdevelopers.com.bloomberg.viewModel.CategoriaViewModel
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)
        categoriaViewModel = ViewModelProviders.of(this).get(CategoriaViewModel::class.java)
        categoriaSubViewModel = ViewModelProviders.of(this).get(CategoriaSubViewModel::class.java)

        Log.i("xxxxxx","xjsvjdvsjd")

        viewModelPalavras(palavraViewModel)
        viewModelCategoria(categoriaViewModel)
        viewModelCategoriaSub(categoriaSubViewModel)
    }

    private fun viewModelPalavras(palavraViewModel: PalavraViewModel) {

        palavraViewModel.palavrasLista.observe(this, androidx.lifecycle.Observer { palavras ->
            palavras?.let {
               Log.i("palavras","${palavras.size}")
                if (palavras.size==0){
                    inserirPalavrasBd(palavraViewModel)
                }else{
                    for (palavras in palavras){
                        Log.i("palavras","${palavras.categoria}")
                        Log.i("palavras","${palavras.descricao}")
                        Log.i("palavras","${palavras.idPalavras}")
                        Log.i("palavras","${palavras.imagem}")
                        Log.i("palavras","${palavras.palavra}")
                        Log.i("palavras","----------------")
                    }
            }
            }
        })

    }

    private fun viewModelCategoria(categoriaViewModel: CategoriaViewModel) {

        categoriaViewModel.categoriaLista.observe(this, androidx.lifecycle.Observer { categorias ->
            categorias?.let {
                Log.i("palavras","${categorias.size}")
                if (categorias.size==0){
                    inserirCategoriaBd(categoriaViewModel)
                }else{
                    for (categorias in categorias){
                        Log.i("categoria","${categorias.categoria}")
                        Log.i("categoria","${categorias.descricao}")
                        Log.i("categoria","${categorias.idCategoria}")
                        Log.i("categoria","----------------")
                    }
                }
            }
        })
    }

    private fun viewModelCategoriaSub(categoriaSubViewModel: CategoriaSubViewModel) {
        categoriaSubViewModel.categoriaSubLista.observe(this, androidx.lifecycle.Observer { categoriasSub ->
            categoriasSub?.let {
                Log.i("palavras","${categoriasSub.size}")
                if (categoriasSub.size==0){
                    inserirCategoriaSubBd(categoriaSubViewModel)
                }else{
                    for (categorias in categoriasSub){
                        Log.i("categorias","${categorias.catSub}")
                        Log.i("categorias","${categorias.categoriaPai}")
                        Log.i("categorias","${categorias.descricao}")
                        Log.i("categorias","${categorias.idCatSub}")
                        Log.i("categorias","----------------")
                    }
                }
            }
        })
    }

    private fun inserirCategoriaSubBd(categoriaViewModel: CategoriaSubViewModel) {
        categoriaViewModel.insertCategoria(CategoriaSub(UUID.randomUUID().toString(),"Adubo Natural",
            "","Actividade Agricola"))

        categoriaViewModel.insertCategoria(CategoriaSub(UUID.randomUUID().toString(),"Adubo Químico",
            "","Actividade Agricola"))

        categoriaViewModel.insertCategoria(CategoriaSub(UUID.randomUUID().toString(),"Culturas Permanentes",
            "São culturas com um ciclo vegetativo superior ou igual a doze (12) meses, e podem esperar " +
                    "vários anos antes de ser replantadas.\n Por exemplo, a banana, mandioca de 12 meses, abacate, " +
                    "citrinos, etc.\n","Actividade Agricola"))

        categoriaViewModel.insertCategoria(CategoriaSub(UUID.randomUUID().toString(),"Culturas Temporárias",
            "São culturas que têm um ciclo de vegetação inferior ou igual a seis (6) meses. \n Exemplo: Milho," +
                    " Massango, Massambala, Arroz, feijão, Tomate, etc.\n","Actividade Agricola"))
    }

    private fun inserirPalavrasBd(palavraViewModel: PalavraViewModel) {
        val uri = Uri.parse("android.resource://com.example.rappdicionario/drawable/inelogo").toString()

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "Produtos de natureza mineral ou orgânica, compostos por um ou vários nutrientes " +
                    "principais para as plantas, que se destinam a aumentar a fertilidade do solo, melhorar a " +
                    "estrutura e aumento do rendimento das culturas, quando correctamente aplicados.",uri,"Adubo"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "É uma actividade económica que visa à transformação e a valorização do meio ambiente natural," +
                    " a fim de obter produtos vegetais (animais, em geral) úteis aos seres humanos, especialmente aqueles " +
                    "destinados à sua alimentação.",uri,"Agrícola"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Culturas Permanentes",
            "Estrume ou esterco são designações dadas ao material orgânico em avançado estado de" +
                    " decomposição utilizado como fertilizante e condicionador dos solos para melhoria das práticas agrícolas." +
                    "\n" ,uri,"Estrume"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Adubo Químico",
            "São substâncias utilizadas na actividade agrícola com objectivo de se elevar" +
                    " (maximizar) a produtividade das culturas. Divididos em orgânicos e inorgânicos.",uri,"Fertilizante"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Culturas Permanentes",
            "1. Bosque de palmeiras. = PALMEIRAL\n" +
                    "2. Aldeia ou quinta situada num terreno com palmeiras.\n" +
                    "\n" ,uri,"Palmar"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Culturas Temporáis",
            "Cereais são as plantas cultivadas por seus frutos (do tipo cariopse) comestíveis, normalmente" +
                    " chamados grãos e são na maior parte gramíneas, compondo uma família com mais de 6 mil espécies. \n " +
                    "Os cereais são produzidos em todo mundo em maiores quantidades do que qualquer outro tipo de produto e são os " +
                    "que mais fornecem calorias ao ser humano." ,uri,"Cereais"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Culturas Temporáis",
            "Cereais são as plantas cultivadas por seus frutos (do tipo cariopse) comestíveis, normalmente" +
                    " chamados grãos e são na maior parte gramíneas, compondo uma família com mais de 6 mil espécies. \n " +
                    "Os cereais são produzidos em todo mundo em maiores quantidades do que qualquer outro tipo de produto e são os " +
                    "que mais fornecem calorias ao ser humano." ,uri,"Fertilizantes"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Culturas Temporáis",
            "Um hectare, representado pelo símbolo ha[1] (conhecido também como hectômetro/hectómetro " +
                    "quadrado [hm²]), é uma unidade de medida de área equivalente a 100 (cem) ares ou a 10 000 " +
                    "(dez mil) metros quadrados." ,uri,"Hectares"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "A horticultura é o ramo da agricultura que estuda as técnicas de produção e aproveitamento" +
                    " dos frutos, hortaliças, árvores, arbustos e flores. Inclui também a jardinagem." ,uri,"Horticultura"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "São grãos contidos em vagens ricas em tecido fibroso." +
                    "\n Algumas espécies podem ser consumidas quando ainda verdes (ervilhas" +
                    " e vagens). Os grãos apresentam uma envoltura de celulose, que representa 2" +
                    " a 5% e contêm no seu interior 50% de amido e 23% de proteínas." ,uri,"Leguminosas"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "São vegetais que possuem óleos e gorduras que podem ser extraídos através de processos " +
                    "adequados. Os óleos extraídos são substâncias insolúveis em água (hidrofóbicas), " +
                       "que na temperatura de 20° C exibem aspecto líquido. As gorduras distinguem-se dos" +
                    " óleos por apresentar um aspecto sólido à temperatura de 20°" ,uri,"Oleaginosas"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "É uma porção de terra sob um único regime de posse, completamente cercada por outras terras," +
                    " curso de água, estradas, florestas ou outros elementos que não fazem parte da exploração agro-pecuária," +
                    " ou que fazem parte dela sob outro regime de posse." ,uri,"Parcela"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "Os pesticidas ou praguicidas são todas as substâncias ou " +
                    "misturas que têm, como objetivo, impedir, destruir, repelir ou mitigar " +
                    "qualquer praga. Um pesticida pode ser uma substância química ou um agente biológico " +
                    "(tal como um vírus ou bactéria) que é lançado de encontro às pragas que estiverem destruindo " +
                    "uma plantação, disseminando doenças, incomodando pessoas etc. É utilizada em diversas formas de " +
                    "seres vivos, tais como: insetos, erva daninha, moluscos, pássaros, mamíferos, peixes, nematelmintos e " +
                    "micróbios. Não são necessariamente venenos, porém, quase sempre, são tóxicos ao ser humano." ,uri,"Pesticida"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "Tubérculos e raizes são diferentes de raízes tuberosas como a batata doce, a beterraba, a cenoura ou " +
                    "a mandioca, que armazenam seus nutrientes na própria raiz, muito mais desenvolvida que a dos " +
                    "tubérculos. Também se diferenciam de bulbos como cebolas e alho, que apesar de usarem parte do " +
                    "caule, também usam folhas modificadas, conhecidas como catafilos para armazenar nutrientes." ,uri,"Raízes e Tubérculos"))

        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Actividade Agricola",
            "é uma operação cultural que consiste em remover a camadasuperficial da terra eliminar as ervas daninhas para permitir um bom" +
                    "desenvolvimento das plantas, evitando assim a incidência de pragas e doenças." ,uri,"Sacha"))

        /*palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Macaco", "XXXXXXXXX",12,"Macaco"))
        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Rapousa", "XXXXXXXXX",12,"Rapousa"))
        palavraViewModel.insertUsuario(Palavra(UUID.randomUUID().toString(),"Lagostin", "XXXXXXXXX",12,"Lagostin")) */

    }

    private fun inserirCategoriaBd(categoriaViewModel: CategoriaViewModel) {
        categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Actividade Agricola",
            "É uma acção económica relacionada com a produção de culturas, que constituí um processo produtivo que" +
                    " depende do ciclo da natureza, que ocorre em diferentes fases ou estádios fenológicos de desenvolvimento" +
                    " da planta, à realização desta produção, bem como as actividades exercidas pelo homem que se enquadram num" +
                    " âmbito da produção ou que sejam apoiadas numa exploração."))

        /*categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Animais", "Animais"))
        categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Instrumentos", "Instrumentos"))
        categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Tipos de Peixes", "Peixe"))
        categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Tipos de Pescas", "Pesca"))
        categoriaViewModel.insertCategoria(Categoria(UUID.randomUUID().toString(),"Tipos de Regas", "Rega"))*/
    }
}