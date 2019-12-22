package com.example.rappdicionario.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.rappdicionario.R
import com.example.rappdicionario.basededados.entidade.Palavra
import com.example.rappdicionario.commum.palavraViewModel
import proitdevelopers.com.bloomberg.viewModel.PalavraViewModel
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        palavraViewModel = ViewModelProviders.of(this).get(PalavraViewModel::class.java)

        viewModelPalavras(palavraViewModel)

    }

    private fun viewModelPalavras(palavraViewModel: PalavraViewModel) {

        palavraViewModel.palavrasLista.observe(this, androidx.lifecycle.Observer { palavras ->
            palavras?.let {
               Log.i("palavras","${palavras.size}")
                if (palavras.size==0){
                    inserirPalavraA(palavraViewModel)
                    inserirPalavraB(palavraViewModel)
                    inserirPalavraC(palavraViewModel)
                    inserirPalavraE(palavraViewModel)
                    inserirPalavraF(palavraViewModel)
                    inserirPalavraG(palavraViewModel)
                    inserirPalavraH(palavraViewModel)
                    inserirPalavraI(palavraViewModel)
                    inserirPalavraL(palavraViewModel)
                    inserirPalavraM(palavraViewModel)
                    inserirPalavraO(palavraViewModel)
                    inserirPalavraP(palavraViewModel)
                    inserirPalavraQ(palavraViewModel)
                    inserirPalavraR(palavraViewModel)
                    inserirPalavraS(palavraViewModel)
                    inserirPalavraT(palavraViewModel)
                    inserirPalavraU(palavraViewModel)
                    inserirPalavraV(palavraViewModel)
                    inserirPalavraZ(palavraViewModel)
                }
            }
        })

    }

    private fun inserirPalavraA(palavraViewModel: PalavraViewModel){
        val uri_padrao = ","
        val abrigo_baixo = "android.resource://com.example.rappdicionario/drawable/abrigo_baixo" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/abrigo_baixo_dois"

        val abrigo_de_sombra = "android.resource://com.example.rappdicionario/drawable/abrigo_de_sombra" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/abrigo_de_sombra_dois"

        val actividade_agricola = "android.resource://com.example.rappdicionario/drawable/actividade_agricola" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/actividade_agricola_dois"


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Abrigo Alto","Ver Estufa",uri_padrao))
        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Abrigo Baixo","Estrutura fixa ou móvel coberta por um material translúcido e impermeável à água, com a finalidade de alterar as condições climáticas no seu interior de modo a serem mais propícias ao desenvolvimento de uma cultura e dentro do qual uma pessoa não pode trabalhar de pé.",abrigo_baixo))
        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Abrigo de Sombra", "Estruturas de pilares de madeira, tubos ou outros suportes, com cobertura (teto e/ou paredes) de rede, com a finalidade de proteger as plantas da intensidade solar.", abrigo_de_sombra))
        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Atividade Agrícola","Produção, criação ou cultivo de produtos agrícolas, incluindo a colheita, ordenha, criação de animais ou detenção de animais para fins de produção, ou a manutenção das terras em boas condições agrícolas e ambientais.", actividade_agricola))

        val  acude = "android.resource://com.example.rappdicionario/drawable/acude" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/acude_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Açude","\t1. Estruturas de derivação de água para rega, construídas no leito dos cursos de água em que o regolfo estabelecido não ultrapassa as suas margens normais.\t2. Estrutura hidráulica para derivação de água para rega ou para a criação de uma determinada cota de plano de água tendo em vista a rega por gravidade.",acude))

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Açude Hidroagrícola","Ver Açude",acude))

        val adubos = "android.resource://com.example.rappdicionario/drawable/adubos" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/adubos_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Adubos","Fertilizantes que, pela sua natureza e pelo teor em um ou vários macro nutrientes principais (azoto, fósforo, potássio), se destinam a melhorar as produções agrícolas, por rapidamente disponibilizarem os nutrientes para as plantas.",adubos))

        val agricultor = "android.resource://com.example.rappdicionario/drawable/agricultor" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agricultor_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Agricultor","Entidade singular ou coletiva que exerça uma atividade agrícola, com ou sem recurso a trabalho assalariado e utilizando fatores de produção próprios e/ou de terceiros.",agricultor))

        val  agricultura_biologica= "android.resource://com.example.rappdicionario/drawable/agricultura_biologica" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agricultura_biologica_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Agricultura Biológica","Modo de produção agrícola, sustentável, baseado na atividade biológica do solo, alimentada pela incorporação de matéria orgânica, que constitui a base da fertilização, evitando o recurso a produtos químicos de síntese e adubos facilmente solúveis, respeitando o bem-estar animal e os encabeçamentos adequados, privilegiando estratégias preventivas na sanidade vegetal e animal. Procura-se, desta forma, a obtenção de alimentos de qualidade, a sustentabilidade do ambiente, a valorização dos recursos locais e a dignificação da atividade agrícola.",agricultura_biologica))


        val agua_de_irrigacao  = "android.resource://com.example.rappdicionario/drawable/agua_de_irrigacao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_de_irrigacao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Irrigação","Água de superfície, água subterrânea ou água residual, que vise satisfazer ou complementar as necessidades hídricas das culturas agrícolas ou florestais.",agua_de_irrigacao))

        val agua_subterranea = "android.resource://com.example.rappdicionario/drawable/agua_subterranea" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_subterranea_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Origem Subterrânea","Água proveniente da exploração ou das imediações, originária de furos ou poços, de fontes naturais, águas subterrâneas ou de outras fontes semelhantes. Nota: A água proveniente destas origens não é necessariamente utilizada apenas para irrigação, podendo igualmente ser usada na exploração para outros fins.",agua_subterranea))


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Rega","Ver Água de Irrigação",agua_de_irrigacao))

        val agua_de_superficie_fora_exploracao = "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_fora_exploracao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_fora_exploracao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Superfície Fora da Exploração","Águas provenientes de lagos, linhas de água ou de albufeiras criadas por barragens artificiais e utilizadas por uma exploração.",agua_de_superficie_fora_exploracao))

        val agua_de_superficie_na_exploracao= "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_na_exploracao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_na_exploracao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Superfície na Exploração","Pequenas lagoas naturais ou barragens artificiais situadas exclusivamente na exploração e utilizadas apenas por uma exploração. Nota: A água pode provir inicialmente de águas pluviais ou de águas subterrâneas, recolhidas em reservatórios; se as águas subterrâneas forem recolhidas na barragem apenas durante a época de irrigação, são registadas com águas subterrâneas.",agua_de_superficie_na_exploracao))

        val agua_de_superficie_lagos_rios = "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_lagos_rios" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_de_superficie_lagos_rios_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água de Superfície Proveniente de Lagos, Rios ou Cursos de Água","Águas doces de superfície, por exemplo, lagos, rios e outras vias navegáveis, que não tenham sido criadas artificialmente para fins de irrigação. Nota: Barragens, canais ou rios artificiais, mesmo que não tenham sido criados especificamente para fins de irrigação, são registados como águas provenientes de redes comuns de abastecimento. Incluem-se neste ponto as barragens de pequena dimensão (menos de 1000 m3) construídas apenas para permitir o funcionamento correcto de bombas em pequenos riachos.",agua_de_superficie_lagos_rios))

        val agua_doce  = "android.resource://com.example.rappdicionario/drawable/agua_doce" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/agua_doce_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água Doce","A água que ocorre naturalmente, com uma concentração reduzida de sais, frequentemente aceitável para efetuar a captação e tratamento com vista à produção de água potável.",agua_doce))


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Água Subterrânea","Toda a água que se situa abaixo da superfície do solo na zona de saturação e em contacto directo com o sol subsolo.\n Ver Água de Origem Subterrânea",agua_subterranea))

        val albufeira = "android.resource://com.example.rappdicionario/drawable/albufeira" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/albufeira_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Albufeira","Massa de água retida pela barragem (conteúdo), terreno que circunda a mesma massa de água (continente), ou ambos, devendo o sentido, em cada caso, ser deduzido do contexto.",albufeira))

        val alimentos_complementares_animais  = "android.resource://com.example.rappdicionario/drawable/alimentos_complementares_animais" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/alimentos_complementares_animais_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Alimentos Compostos Complementares para Animais","As misturas de alimentos contendo teores elevados de certas substâncias e que, pela sua composição, não asseguram a ração diária, senão quando associados a outros alimentos para animais.",alimentos_complementares_animais))

        val alimento_composto_completo_animal  = "android.resource://com.example.rappdicionario/drawable/alimento_composto_completo_animal" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/alimento_composto_completo_animal"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Alimentos Compostos Completos para Animais","As misturas de alimentos que pela sua composição são suficientes para assegurar a ração diária.",alimento_composto_completo_animal))

        val alquive = "android.resource://com.example.rappdicionario/drawable/alquive" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/alquive_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Alqueive","Terra lavrada que se encontra em pousio, podendo ou não ser revestido.",alquive))

        /*val  = "android.resource://com.example.rappdicionario/drawable/" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Amendoal","Ver Pomar de Amendoeiras",uri_padrao))

        val ano_agricola  = "android.resource://com.example.rappdicionario/drawable/ano_agricola" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/ano_agricola_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Ano Agrícola","O período de tempo em que se realizam as operações culturais necessárias à produção agrícola e que se inicia em Novembro de cada ano (n-1) e termina em 31 de Outubro do ano n.",ano_agricola))


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Análises Foliares","Processo laboratorial para avaliar o estado nutricional das plantas, permitindo determinar as fertilizações mais adequadas.",uri_padrao))

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Aplicação ao Solo","Ver Aplicação de Fertilizante",uri_padrao))

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Aplicação de Fertilizante","Adição de substâncias ao solo, por empalhamento à superfície do solo, injecção no solo, colocação abaixo superfície do solo ou mistura com as camadas superficiais do solo.",adubos))

        val arborizacao  = "android.resource://com.example.rappdicionario/drawable/arborizacao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/arborizacao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Arborização ou Rearborização","Constituição de novos povoamentos florestais em terrenos:\n" +
                "1.\t1. antes utilizados por culturas agrícolas, recentemente abandonados ou com abandono mais antigo, cobertos de matos ou vegetação rasteira;\n" +
                "2.\t2. ocupados por vegetação de maior porte, mas de interesse económico reduzido;\n" +
                "3.\t3. com povoamentos arbóreos de certo interesse que se julga vantajoso \"converter\" ou \"transformar\" ou proceder a \"alterações de composição\";\n" +
                "4.\t4. antes submetidos a corte final ou percorridos por incêndios.\n",arborizacao))


        /* val  = "android.resource://com.example.rappdicionario/drawable/" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área de Propagação","Ver Viveiro de Plantas Não-Lenhosas",uri_padrao))

        /* val  = "android.resource://com.example.rappdicionario/drawable/" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área de Propagação de Culturas Lenhosas","Ver Viveiro de Plantas Lenhosas Não Florestais",uri_padrao))

        /* val  = "android.resource://com.example.rappdicionario/drawable/" +
                 "," +
                 "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área de Quercíneas e Alfarrobeiras","Ver Povoamento de Quercíneas ou Alfarrobeiras",uri_padrao))

        /* val  = "android.resource://com.example.rappdicionario/drawable/" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área Florestal","Ver Povoamento Florestal Sem Cultura Associada",uri_padrao))

        /* val  = "android.resource://com.example.rappdicionario/drawable/" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/"*/

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área Forrageira","Ver Cultura Forrageira",uri_padrao))

        val area_geografica_de_producao  = "android.resource://com.example.rappdicionario/drawable/area_geografica_de_producao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/area_geografica_de_producao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área Geográfica de Produção","Área geográfica delimitada no interior da qual ocorre a produção, transformação e elaboração dos produtos cujo nome é uma Denominação de Origem Protegida (DOP) ou no interior da qual ocorre, pelo menos, uma das fases produtivas dos produtos cujo nome é uma DOP.",area_geografica_de_producao))

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área Improdutiva","Ver Zona Improdutiva",uri_padrao))


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Área Social","Ver Zona Social",uri_padrao))

        val arjao  = "android.resource://com.example.rappdicionario/drawable/arjao" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/arjao_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Arjão","Sistema tradicional de condução da vinha que consiste em estender fios de arame entre as várias árvores plantadas nas bordaduras dos campos, até à altura de 6 a 8 metros, e deixar as videiras subir e expandir-se. Os arjoados resultam de uma evolução e intensificação das uveiras relacionadas com a difusão do arame. Tal como os enforcados, estes arjões são típicos de uma produção vinícola em regime de agricultura intensiva, não especializada, consociada com variadas outras culturas, e que tira proveito de uma produção que praticamente ocupa o espaço no solo e não requer dispêndio de mão-de-obra.",arjao))

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Arjoado","Ver Arjão",uri_padrao))

        val arrozavel  = "android.resource://com.example.rappdicionario/drawable/arrozavel" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/arrozavel_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Arrozal","Parcela com cultivo de arroz (Oryza sativa L.).",arrozavel))

        val aspersor = "android.resource://com.example.rappdicionario/drawable/aspersor" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/aspersor_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Aspersor","Aparelho que, na rega por aspersão, opera em círculos ou em setores, projectando a água sob pressão sobre as plantas através de um orifício.",aspersor))

        val ave_capoeira  = "android.resource://com.example.rappdicionario/drawable/ave_capoeira" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/ave_capoeira_dois"

        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Ave de Capoeira","ver \n" +
                "1.\t1. Aves de capoeira - galinhas, perus, pintadas, patos, gansos, codornizes, pombos, faisões, perdizes e avestruzes criadas ou mantidas em cativeiro com vista à sua reprodução, produção de carne ou de ovos para consumo;\n" +
                "2.\tAves cinegéticas de capoeira - faisões, perdizes, codornizes e patos criados ou mantidos em cativeiro para produção de caça visando o repovoamento, largada ou a utilização em campos de treino de caça.\n",ave_capoeira))

        val aviario = "android.resource://com.example.rappdicionario/drawable/aviario" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/aviario_dois"


        palavraViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"A", "Aviário","Instalação destinada a exploração de aves para a produção de carne e de ovos para a alimentação e para incubação, quer os pintos se destinem a venda, quer a povoar as suas próprias secções de produção de ovos, de consumo de carne.",aviario))
    }

    private fun inserirPalavraB(palavraBViewModel: PalavraViewModel){
        val uri_padrao = ","


        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bacelada","Ver Vinha com Porta-Enxertos ainda não Enxertados",uri_padrao))

        val bacelo = "android.resource://com.example.rappdicionario/drawable/bacelo" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/bacelo_dois"
        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bacelo","1.\tTécnica de reprodução da vinha que consiste em implantar um sarmento da planta mãe, retirando-o e cortando-o quando estiver enraizado. Este método ancestral só pode ser utilizado em países como o Chile, que não sofre ameaça da filoxera e podem plantar a vinha sem enxertia.\n" +
                "2.\tTermo utilizado para designar \"porta-enxerto\"; pé-de-vinha no qual se fará a enxertia com a casta desejada. Começou a ser usado desde os finais do século XIX, após a filoxera.\n",bacelo))


        val baldio  = "android.resource://com.example.rappdicionario/drawable/baldio" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/baldio_dois"

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Baldio","Terrenos possuídos e geridos por comunidades locais, constituindo estas, para efeitos da lei, o universo dos compartes. São compartes os moradores de uma ou mais freguesias ou parte delas que, segundo os usos e costumes, têm direito ao uso e fruição do baldio. Os compartes estão constituídos em Assembleia, que elege o Conselho Diretivo. Consideram-se os baldios administrados exclusivamente por compartes, por compartes Estado ou diretamente pelas Juntas de Freguesia ou Câmaras Municipais.",baldio))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bardo","Sistema de condução de vinha contínua baixa que consiste numa linha de esteios com 1,5 a 2 metros de altura, espaçados de 6 a 8 metros, que sustentam 4 a 6 arames. As videiras são plantadas geralmente num compasso apertado (cerca de 1 metro de intervalo) e espalmadas, permitindo-se que comecem a frutificar à altura do primeiro arame, ou seja, muito próximo do solo. Este sistema de condução, em que as linhas de videiras distam cerca de 3 metros entre si, permite o tratamento mecanizado e simplificação da vinha. O seu maior inconveniente situa-se na poda excessiva que o sistema implica, originando desequilíbrios vegetativos e produtivos. Na realidade estas vinhas têm uma longevidade bastante incerta e uma produção irregular.",uri_padrao))

        val barragem  = "android.resource://com.example.rappdicionario/drawable/barragem" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/barragem_dois"

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Barragem","Em sentido lato, é o conjunto formado pela estrutura de retenção, sua fundação, zona vizinha a jusante, órgão de segurança e exploração e albufeira. Em sentido mais restrito, a estrutura de retenção com ou sem outras componentes devendo o sentido, em cada caso, ser deduzido do contexto (exceptuam-se diques fluviais e costeiros e ensecadeiras que não permaneçam para além do período de construção).",barragem))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Barragem Hidroagrícola","Barragem com características de regulação anual ou inter-anual de caudais, cuja água armazenada tem como finalidade principal a rega de culturas.",uri_padrao))

        val barragem_hidroeletrica  = "android.resource://com.example.rappdicionario/drawable/barragem_hidroeletrica" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/barragem_hidroeletrica_dois"

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Barragem Hidroelétrica","Barragem cuja água armazenada tem como finalidade principal a produção de energia elétrica.",barragem_hidroeletrica))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Barragem, Dique ou Similar","Ver Estrutura Hidraúlica",uri_padrao))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Batata","Ver Cultura de Batata",uri_padrao))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Beterraba Sacarina","Ver Cultura de Beterraba Sacarina",uri_padrao))

        val biomassa_agricola  = "android.resource://com.example.rappdicionario/drawable/biomassa_agricola" +
                "," +
                "android.resource://com.example.rappdicionario/drawable/biomassa_agricola_dois"

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Biomassa Agrícola","Produtos e resíduos da atividade agrícola e florestal (cereais, forragens, produtos amiláceos, oleaginosas, produtos fibrosos e lenhosos, efluentes de pecuária, entre outros) que podem ser convertidos em combustíveis (etanol, biodiesel, hidrogénio), energia elétrica e calorífica, assim como uma vasta gama de materiais (plásticos, adesivos, tintas, detergentes, produtos farmacêuticos, algodão e linho), por diversos processos (fermentação, gaseificação, combustão).",biomassa_agricola))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bloco Agrícola com Acesso a Caminho Público","Bloco da exploração agrícola com acesso direto a caminho público. Entende-se que existe acesso a um campo quando é possível passar um trator durante a maior parte do ano; exclui-se o direito de servidão.",uri_padrao))

        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bloco com Superfície Agrícola Utilizada","Ver Bloco de Terra Agrícola",uri_padrao))


        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bloco de Terra Agrícola","Parte de uma exploração agrícola inteiramente rodeada de terras, águas, etc., não pertencentes à exploração. Considera-se um bloco único o que é atravessado por uma estrada ou caminho, por uma linha férrea, etc., desde que essa interrupção não prejudique a continuidade, em termos de passagem dum lado para o outro. Alguns possuem acesso a caminhos públicos.",uri_padrao))


        palavraBViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"B", "Bordadura","Estruturas lineares arbóreo-arbustivas constituídas por espécies autóctones plantadas nas estremas das parcelas nos caminhos de trabalho e ou acesso.",uri_padrao))
    }

    private fun inserirPalavraC(palavraCViewModel: PalavraViewModel){

       val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Caminho Agrícola ou Florestal","Caminho público com acesso directo a um bloco de uma exploração agrícola ou florestal, que permite a circulação de veículos, máquinas e pessoas. Nota: uma servidão de passagem não é um caminho público.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Canhão","Dispositivo de rega rotativo que opera com elevada pressão (5 a 10 bar), alta pluviometria (40 a 120 m3/h) e alcance de 30 a 7.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Casta","Ver Variedade",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cereal","Nota: O termo CEREAL é reservado apenas para o grão comestível, não para a planta ou a cultura.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cereal para a Produção de Grão","Ver Cultura Cerealífera para Produção de Grão",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Charca","Depressão ou escavação do solo, mais ou menos extensa, onde se acumula água pouco profunda de várias proveniências, que pode ser utilizada para rega.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Chorume","Mistura de excrementos e urina de animais domésticos que pode conter água e/ou uma pequena quantidade palha.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cobertura de Plástico","1.\t1. Coberturas de filme de polietileno simples, térmico, reforçado três estações, etc., utilizado nas estufas e estruturas afins, na solarização e na cobertura de solo em faixas, sobre a linha de algumas culturas.\n" +
               "2.\t2. Coberturas de policarbonato, policloreto de vinilo (PVC), polimecatrilato (PMMA), etc., em plástico rígido, quer seja em chapas onduladas, quer lisas, utilizadas nas estufas.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Compasso","Distância que, numa plantação regular, separa as plantas entre si, quer na linha quer na entrelinha.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Consociação Anual","Associações de várias espécies de leguminosas e gramíneas, ou só de leguminosas, ou só de gramíneas, em monoculturas e/ou rotações. Produzem pastagem ou forragem, que pode servir também para completar a alimentação animal no Inverno, utilizando-se em verde ou conservada na forma de feno ou silagem. Podem ser sujeitas a um ou vários cortes. Espécies normalmente utilizadas: leguminosas (ervilhacas, cizirões, anafa, tremocilha, serradela, trevo da Pérsia, trevo encarnado, bersim) e gramíneas (aveia, cevada, azevém anual).",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Construção Diversa","Instalações/construções destinados à armazenagem, conservação e transformação de produtos agrícolas ou simplesmente construções associadas ao aparelho produtivo das explorações agrícolas.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cordão","Sistema de condução das videiras que pode ser considerado uma evolução das cruzetas, uma vez que o tipo condução das videiras é idêntico, embora se assemelhe pela estrutura de suporte aos antigos bardos. Tal com os bardos, a estrutura de suporte é constituída por linhas de esteios espaçados entre 6 e 8 metros e distantes entre si de 2,5 a 3 metros, nos quais se apoiam arames, a partir de 1,2 metros de altura. O princípio fundamental consiste em fazer a videira chegar a esses arames sem ramificação, deitando-se depois sobre ele, tal como sucede nas cruzetas, para aí se situar a zona vegetativa e produtiva. Pode optar-se por cordão simples, havendo, nesse caso, um só arame de apoio à videira (a cerca de 1,5 metros do solo) e um ou dois arames mais finos para permitir que o desenvolvimento vegetativo se agarre e melhore a exposição das folhas e sobretudo dos cachos; ou por cordão sobreposto, havendo então dois arames para suportar as videiras (o primeiro, ligeiramente mais baixo do que no caso do cordão simples; o segundo, uma altura idêntica aquela que se verifica nas cruzetas) e um outro de apoio ao desenvolvimento vegetativo da videira que ocorre no arame superior.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Corretivo","Substâncias que, podendo apresentar algum valor fertilizante, são incorporadas no solo com o principal objetivo de lhe melhorar as características físicas, químicas e biológicas. Classificam-se em corretivos minerais (ex: calcário, enxofre, gesso) e corretivos orgânicos (ex: estrumes, resíduos de culturas, composto).",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cooling System","Sistema de arrefecimento de estufas com duas componentes: numa das paredes da estufa estão instalados painéis de material poroso e permeável, que são humedecidos com água, através da aspersão dos painéis, ou distribuindo-se a água através de tubagem perfurada; na parede oposta, estão instalados ventiladores-extratores, que promovem a circulação do ar arrefecido no interior da estufa.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cruzeta","Sistema de condução de vinhas contínuas que, na sua forma original, consiste num poste vertical com 2 metros de altura ou mais e outro horizontal, formando uma cruz. O poste horizontal mede entre 1.5 a 2 metros e deve situar-se entre 1,5 e 2,5 metros do solo. As extremidades dos braços das sucessivas cruzes, que devem distar entre os 8 metros, são unidas por um fio de arame. Junto de cada cruzeta plantam-se quatro videiras que acompanha aos pares, os braços da cruz, seguindo depois cada uma o seu arame. As videiras assim plantadas são depois podadas de forma a que a folhagem e os frutos se desenvolvam apenas na parte da planta que se apoia sobre o arame, formando dois longos cordões paralelos. Este formato-base tem sofrido algumas alterações, sendo de destacar as seguintes:\n" +
               "1.\t1. Utilização de um terceiro arame unindo o topo das cruzetas e servindo de suporte a duas outras videiras que acompanham o poste vertical.\n" +
               "2.\t2. a utilização do sistema de suporte das videiras, mas associado a diferentes formas de plantação (tanto podem ser colocadas duas a duas como isoladamente e tanto podem ser plantadas no enfiamento dos postes verticais como directamente debaixo dos arames).\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultivador","Dá-se o nome de escarificadores, ou cultivadores, a uma série de alfaias mais ou menos pesadas, compostas por um quadro rectangular ou uma simples barra, cujos órgãos activos são dentes, rígidos ou flexíveis, terminados em ferro ou bicos de vários tipos. Têm a função de mobilizar o terreno, sem reviramento, para combater infestações, para arejar o solo e para trazer torrões e pedras à superfície.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultivar","Ver Variedade",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Arvense","Inclui:\n" +
               "ver Ver Cultura Temporária\n" +
               "1.\t1. Cereais: trigo duro; outras variedades de trigo e mistura de centeio com trigo,com excepção do trigo duro, centeio; cevada; aveia; milho; sorgo de grafo; trigo mourisco, painço e alpista; outros cereais; milho doce.\n" +
               "2.\t2. Sementes de oleaginosas: soja; sementes de nabo silvestre ou de colza; sementes de girassol.\n" +
               "3.\t3. Proteaginosas: ervilhas; favas e fava forrageira; sementes de tremoço doce.\n" +
               "4.\t4. Linho não textil: Sementes de linho (Linum usitatissimum L.)\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Associada","ver \n" +
               "1.\t1. . Associação de culturas temporárias (culturas das terras aráveis ou forragens) e de culturas permanentes e/ou de plantas florestais numa única e mesma superfície; numa acepção mais lata, considera-se igualmente a associação de culturas permanentes de diferentes espécies ou de diferentes culturas temporárias numa única e mesma superfície.\n" +
               "2.\t2. Duas ou mais culturas que ocupam simultaneamente a mesma parcela durante toda ou a maior parte do seu período vegetativo.\n" +
               "3.\tNota: Deve registar-se a superfície total efetivamente ocupada pelas culturas associadas. A repartição da superfície total proporcionalmente entre as diferentes culturas deve ser agregada à superfície ocupada por cada cultura estreme.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Cerealífera","Ver Cultura Cerealífera para Produção de Grão",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Cerealífera para Produção de Grão","Culturas de cereais para a produção de grão. Inclui: sementes. Exclui: os cereais colhidos ou consumidos em verde que são incluídos nas culturas forrageiras.\n" +
               "1.\tTrigo mole e espelta (Triticum aestivum L. emend. Fiori et Paol., Triticum spelta L, e Triticum monococcum L.), Trigo duro (Triticum durum Desf.), Centeio (Secale cereale L.) incluindo misturas de centeio e outros cereais de Invern,.Cevada (Hordeum vulgare L.)Aveia (Avena sativa L.) incluindo misturas de aveia e outros cereais de Verão,Milho em grão. Inclui: Milho (Zea mays L.) colhido para grão, milho cuja colheita é efetuada manualmente por colhedor-descamisador, por descarolador de espiga ou por ceifeira-debulhadora, independentemente da sua finalidade, incluindo o grão para silagem. Inclui-se ainda o grão colhido com partes do carolo, mas com uma humidade superior a 20%, destinado a silagem (denominado Corn-cob-mix, CCM). Exclui: As espigas de milho doce destinadas ao consumo humano.Arroz (Oryza sativa L.)\n" +
               "2.\tOutros cereais para a produção de grão: Cereais em cultura pura, colhidos em seco para grão e diferentes dos acima indicados. Entre outras, devem ser registadas neste ponto as seguintes culturas: sorgo (Sorghum bicolorSorghum sudanense.), triticale (Triticosecale Wittmack) e painço (Panicum miliaceum L.). O trigo mourisco (Fagopesculentum.) e a alpista (Phalaris canariensis L.) estão igualmente incluídos neste ponto, uma vez que são cultivados transformados como os cereais.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Ar Livre ou Abrigo Baixo","Consideram-se ao ar livre, as culturas cobertas com folhas flexíveis de plástico colocadas sobre o terreno e as cobertas com estruturas fixas ou móveis dentro das quais uma pessoa não pode trabalhar de pé.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Batata","1.\t1. Batata, incluindo batata primor e batata de semente (Solanum tuberosum L.)\n" +
               "2.\t2. A área de cultura de batata em hortas familiares e em cultura hortícola intensiva é objecto de registo autónomo.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Beterraba Sacarina","Beterraba sacarina, excluindo sementes, (Beta vulgaris L.), destinada à indústria do açúcar e à produção de álcool.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Cobertura","Culturas deliberadamente cultivadas tendo em conta a sua potencial contribuição para a diminuição e perda de nutrientes para o ar e de águas de superfície ou subterrâneas, durante o Inverno ou outros período em que a terra não seja cultivada ou esteja mais suscetível a perdas. As referidas culturas são economicamente importantes, sendo a proteção do solo o seu principal objetivo\n" +
               "1.\tNota: As superfícies agrícolas sem cobertura vegetal ou onde apenas exista uma camada superior de resíduos vegetais são especialmente susceptíveis a perdas de nutrientes. Tal foi tomado em consideração quer pelos agricultores quer pela legislação/administração.\n" +
               "2.\tUm dos instrumentos mais eficazes para reduzir as perdas, prejudiciais para o ambiente e para a economia, é a manutenção de uma cobertura vegetal contínua, ao longo do ano. Em alguns Estados-Membros, a necessidade de ocupar uma determinada percentagem das terras aráveis com culturas de Inverno habituais, como o trigo duro, ou com culturas de cobertura, tal como definidas aqui, está consagrada na legislação ou é parte integrante dos regimes agro-ambientais a que os agricultores podem aderir.\n" +
               "3.\tEstas culturas são semeadas no Outono apenas com a finalidade de reduzir a perda de nutrientes, pelo que não devem ser confundidas com as habituais culturas herbáceas de Inverno como, por exemplo, o trigo duro destinado a ser colhido ou as gramíneas. Em geral, estas culturas são aradas durante a Primavera, antes de se proceder à sementeira de outra cultura, não sendo colhidas nem utilizadas para pastagem.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Cogumelos","Cogumelos de cultura cultivados quer em edifícios especialmente construídos ou adaptados para a cultura dos cogumelos quer em subterrâneos, grutas ou caves. Regista-se a superfície de cultura efectiva (camadas, recipientes ou superfícies semelhantes) que tenha sido utilizada pelo menos uma vez durante os 12 meses de referência. Se isso acontecer várias vezes, a superfície de camadas é contada uma única vez.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Flores de Corte","Cultura de espécies florícolas cultivadas com a finalidade da produção da flor, comercializada sem raiz.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Flores ou Plantas Ornamentais","Espécies florícolas e outras plantas ornamentais, quer sejam de interior quer de exterior, independentemente de serem ou não utilizadas para a produção de flor ou de folhagem de corte. Compreende as flores, folhas e raízes para corte, plantas em vasos ou sacos, os vários tipos de transplante, etc. A roseira é incluída neste grupo de plantas, como cultura temporária. Nas plantas colocadas em tabuleiros sobrepostos, apenas é contabilizada uma só vez a área (projeção no solo). Exclui: as áreas de viveiros e produção de sementes, incluídas em sementes e propágulos de culturas não lenhosas.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Folhagens de Corte ou Complementos de Flor","Espécies florícolas cultivadas com a finalidade da produção de folhagem e complementos de flor.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Leguminosa Seca para Grão","Leguminosas cultivadas para colheita do grão após maturação completa, quer se destinem à alimentação humana ou à alimentação animal.Inclui: as áreas para produção de sementes. Exclui: as leguminosas colhidas com o grão em verde, ou seja, antes da maturação completa (neste caso, consideram-se culturas hortícolas) e as as leguminosas forrageiras em que a planta é colhida por inteiro, inclusive nas culturas forrageiras.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura de Plantas Ornamentais","Espécies ornamentais, comercializadas com raiz, quer sejam de interior, quer de exterior, independentemente de serem ou não utilizadas para a produção de flor ou de folhagem de corte.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura em Estufa","Culturas feitas em estufas com estruturas fixas ou móveis (vidro ou folhas de material plástico rígido ou flexível) durante todo o ciclo vegetativo ou na sua maior parte. Nota: Excluem-se as folhas flexíveis de material plástico pousadas sobre o solo, as culturas em túneis de plástico não acessíveis ao homem, em estufins e estruturas portáteis. No caso de estufas e estruturas móveis altas contam-se todas as superfícies cobertas nos 12 últimos meses e adicionam-se para obter a superfície total das culturas em estufa; não contar apenas a superfície de base destas instalações. As superfícies das culturas parcialmente cultivadas em estufa e parcialmente ao ar livre são recenseadas exclusivamente nas superfícies das culturas em estufa, desde que o período em estufa não seja muito limitado. Se uma determinada superfície em estufa for utilizada várias vezes, deverá ser contada apenas uma vez. No caso de estufas com andares, conta-se apenas a superfície de base.\n Ver Cultura de Ar Livre ou Abrigo Baixo e Estufa",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Estreme de Leguminosa Seca para Grão para Alimentação Animal","Leguminosas secas para grão, tais como ervilhas, favas, favarolas, ervilhacas e tremoços, em cultura estreme ou mistura), para utilização na alimentação animal.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Forrageira","Conjunto das culturas arvenses para forragem, que entram na rotação das culturas e que ocupam mesma superfície durante menos de cinco anos (forragens anuais e plurianuais). Nota: Estas culturas forrageiras (ao contrário das destinadas à produção de grão) são normalmente utilizada enquanto pastagem para os animais ou colhidas em verde, embora também possam ser colhidas secas (com feno). Em geral, a planta é colhida e utilizada na totalidade (excepto as raízes) para forragem. Inclui: Culturas que não forem utilizadas na exploração e forem vendidas para utilização directa noutra exploração ou à indústria; cereais e plantas industriais, bem como outras culturas arvenses, colhidos e/ou consumidos e verde, para forragem. Exclui: culturas forrageiras sachadas. Certas espécies forrageiras podem ser cultivadas para enterramento no solo, servindo como adubo verde, não sendo incluídas neste grupo. As terras ocupadas por culturas forrageiras disponíveis para alimentação animal directa durante um período pelo menos 7 meses com início a 1 de janeiro. Nota: por vezes as zonas de matos são aqui incluídas. Normalmente os prados (permanentes) são declarados como área forrageira.\n Ver Pastagem Permanente",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Forrageira Sachada","1.\tCulturas forrageiras sachadas (excluindo sementes): Beterrabas forrageiras (Beta vulgaris L.) e plantas da família Brassicae destinadas a forragem, e outra plantas cultivadas principalmente pelas suas raízes, para forragem, diferentes das já indicadas. Nota: Todas as plantas da família Brassicae destinadas a forragem estão incluídas neste ponto, independentem do facto de se utilizar a raiz ou o caule para forragem. Entre outros, incluem-se, por exemplo, os topimambos (Helianthus tuberosus L.), a batata doce (Ipomoea batatas (L.) Lam.), a pastinaga forrageira (Pastinaca sativa L.), o (Discorea spp.) e a mandioca (Manihot esculenta Crantz).\n" +
               "2.\tCulturas sachadas (no sentido estrito em que o termo é utilizado no Recenseamento Geral da Agricultura) :Consideram-se aqui as plantas forrageiras que necessitam da aplicação intensa de amanhos de limpeza do terreno contra as ervas infestantes. Inclui: as seguintes espécies, desde que destinadas à alimentação animal: beterraba forrageira, cenoura forrageira, couve forrageira, nabo forrageiro, abóbora forrageira e outras.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Hortícola","Inclui: Produtos hortícolas frescos, melões, tomate para indústria, Culturas ao ar livre e sob abrigo. Exclui: Cogumelos cultivados.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Hortícola Extensiva","1.\tProdutos hortícolas que entram na rotação com outras culturas agrícolas. Nota: Os produtos hortícolas cultivados extensivamente destinam-se, em grande parte (mas nem sempre), ao processamento industrial mais do que à comercialização direta no mercado. Neste caso, o elemento básico é o sistema de rotação da exploração: se as superfícies ocupadas pelos produtos hortícolas entram em rotação com outras culturas hortícolas, a superfície em questão é considerada \"em cultura extensiva\". Inclui: as áreas exclusivamente com tomate para a indústria ou com melão.\n" +
               "2.\tCulturas hortícolas efectuadas como cultura única no ano agrícola ou cultivadas em parcelas que entram em rotação com outras culturas não hortícolas, não se sucedendo em geral várias culturas hortícolas na mesma área durante o mesmo ano agrícola. Inclui: tomate para indústria.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Hortícola Intensiva","Produtos hortícolas cultivados em terras que entram na rotação com outras culturas agrícolas. Nota: Os produtos hortícolas cultivados intensivamente destinam-se, em grande parte (mas nem sempre), à comercialização directa mais do que ao processamento industrial. Neste caso, o elemento que serve de base é o sistema de rotação da folha: se a superfície ocupada pelos produtos hortícolas entra em rotação apenas com outras culturas hortícolas, a superfície em questão é considerada \"e cultura intensiva\". \n Nas culturas hortícolas intensivas só se inclui em cultura principal a superfície na qual se fizeram as culturas base e não a soma das diversas culturas hortícolas realizadas na mesma parcela durante o ano agrícola. Uma superfície de hortícolas intensivas apenas é considerada cultura secundária quando for feita sob cobertura de culturas permanentes. Inclui: a área de batata efectuada nestas parcelas. Exclui: as áreas exclusivamente com tomate para a indústria ou com melão são incluídas em culturas hortícolas extensivas.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Industrial","Cultura de plantas industriais, i.e. plantas que não são, em geral, comercializadas directamente, uma vez que para a sua utilização final é necessário um processamento industrial prévio. Inclui: sementes de culturas oleaginosas herbáceas. Exclui: sementes e propágulos de culturas têxteis, lúpulo, tabaco e de outras culturas industriais. Exemplos:\n" +
               "1.\tTabaco (Nicotiana tabacum L.); lúpulo (Humulus lupulus L.); algodão (Gossypium spp.); colza e nabo silvestre (Brassica napus L. e Brassica rapa) cultivados para a produção de óleo e colhidos em grão seco; girassol (Helian annuus L.); soja (Glycine max L.); sementes de linho (Linum usitatissimum L.) variedades cultivadas principalmente para a produção de óleo.\n" +
               "2.\tOutras culturas oleaginosas: outras plantas cultivadas principalmente pelo seu teor de óleo, colhidas em grão seco, diferentes das já indicadas, nomeadamente, mostarda (Sinapis alba L.), papoila-dormideira (Papaver somniferum L.), sementes de sésamo (Sesamum indicum L.), chufa (Cyperus esculentus L.) e amendoins (Arachis hypogea).\n" +
               "3.\tLinho (Linum usitatissimum L.), variedades cultivadas principalmente para a produção têxtil; cânhamo (Cannabis sativa L.); outras culturas têxteis, i.e., outras plantas cultivadas principalmente pelo seu teor de fibra, diferentes dasjá indicadas, nomeadamente, juta (Corchorus capsularis), cânhamo de Manila (Musa textilis), sisal (Agave sisalana) cânhamo de hibisco (Hibiscus cannabinus).\n" +
               "4.\tPlantas aromáticas, medicinais e condimentares: as principais plantas aromáticas, medicinais e condimentares são as seguintes: Angélica (Angelica spp.), beladona (Atropa spp.), camomila (Matricaria spp.), cominho (Carum spp.), digital (Digitalis spp.), genciana (Gentiana spp.), hissopo (Hyssopus spp.), jasmim (Jasminum spp.), alfazema (Lavandula spp.), orégão (Origanum spp.), melissa (Melissa spp.), hortelã (Mentha spp.), papoila-dormideira (Papaver spp.), congossa (Vinca spp.), psílo (sementes) (Psyllium spp.), açafrão (Curcuma spp.), salva (Salvia spp.), maravilha (Calendula spp.), valeriana (Valeriana spp.), etc.\n" +
               "5.\tOutras plantas industriais, diferentes das já indicadas, nomeadamente, chicória (Cichorium intibus L.) e cana-de-açúcar (Saccharum officinarum L.). Não inclui o tomate para a indústria.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Irrigada","1.\tSuperfície das culturas que, no ano de referência, foram efetivamente irrigadas pelo menos uma vez. Exclui: Não se incluem as culturas em estufa e as hortas familiares que são quase sempre irrigadas. Se, no decurso do período vegetativo, forem cultivadas várias culturas num campo, a superfície só deve ser indicada uma vez e isto para a cultura principal se esta for irrigada, se não, para a cultura secundária mais importante (ou cultura sucessiva) irrigada.\n" +
               "2.\tCulturas temporárias, culturas permanentes e prados e pastagens permanentes (exclui a horta familiar), que foram efectivamente regadas pelo menos uma vez. Considera-se as áreas das culturas quer sejam consideradas culturas principais, sucessivas ou sob-coberto, podendo a mesma área ser contabilizada duas ou mais vezes. Em culturas temporárias sucessivas, considera-se a área da parcela para cada uma das culturas, desde que tenha sido regada. Em associações de culturas temporárias, são ambas consideradas culturas irrigadas. Em associação de culturas temporárias com culturas permanentes: se o sistema de rega é dirigido à cultura temporária, nesta situação a permanente não é considerada regada. Se o objectivo foi regar a cultura permanente, a temporária não é considerada regada. Em culturas intensivas, hortícolas ou florícolas, ao ar livre ou em abrigo baixo, que sejam regadas, considera-se apenas a área base regada. Em culturas em estufa, considera-se apenas a área base regada.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Oleaginosa","Cultura de plantas produtoras de óleos alimentares ou industriais como por exemplo o girassol, o rícino, a soja, etc..\n" +
               "1.\tCulturas permanentes são culturas fora da rotação, excluindo os prados e pastagens permanentes, que ocupam terra durante um longo período e fornecem repetidas colheitas. Inclui: viveiros (excluindo os viveiros florestais não comerciais que se encontram nas florestas e são recenseados na superfície florestal), bem como as culturas para entrançar como vime, cana, junco, etc. Exclui: as culturas de produtos hortícolas, de plantas ornamentais e de plantas industriais (por exemplo, esp rosas, plantas ornamentais pela flor e/ou pela verdura e folhagem, morangos e lúpulo), mesmo que permanentes. Estas são registadas nas respectivas rubricas relativas a terras aráveis. Inclui: a) Culturas permanentes ao ar livre b) Pomares de árvores de fruto e bagas c) Pomares de citrinos d) Olivais e) Vinhas f) Viveiros g) Outras culturas permanentes h) Culturas permanentes em estufa\n" +
               "2.\tNo caso das árvores de fruto só são considerados os povoamentos regulares, com densidade mínima de 100 árvores, ou de 45 no caso de oliveiras, figueiras e frutos secos. Considera-se a superfície utilizada bruta (incluindo passagens).\n" +
               "3.\tInclui, além dos referidos no ponto 1.: plantações recentes e culturas em estufas. Exclui, além dos referidos no ponto 1: pastagens permanentes, áreas abandonadas e os pés das culturas permanentes quando a densidade das árvores atinge determinados limites.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Permanente","São culturas com um ciclo vegetativo superior ou igual a doze (12) meses, e podem esperar vários anos antes de ser replantadas. Por exemplo, a banana, mandioca de 12 meses, abacate, citrinos, etc.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Permanente Associada","O registo da área ocupada por culturas permanentes em associação é realizado da seguinte forma:\n" +
               "1.\tem associações de diferentes culturas permanentes: as áreas são repartidas segundo a superfície ocupada por cada espécie; se existirem várias espécies, sendo duas ou três predominantes, a área é repartida proporcionalmente por estas, desprezando-se aquelas cuja representatividade é insignificante.\n" +
               "2.\tem associações com culturas temporárias: considera-se a totalidade da área tanto para as culturas permanentes como para as culturas temporárias (que são incluídas em culturas associadas sob-coberto de permanentes).\n" +
               "3.\tem associações com pastagens permanentes sob-coberto: considera-se a totalidade da área tanto para as culturas permanentes como para as pastagens permanentes (que são incluídas em culturas associadas sob-coberto de pastagens permanentes).\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Principal","Cultura que proporciona maior rendimento sob o ponto de vista económico, quando na mesma parcela de cultivo se fazem sucessivamente várias culturas no mesmo ano agrícola. Se a cultura principal for temporária, as outras culturas são consideradas culturas secundárias sucessivas. Por convenção:\n Ver Cultura Secundária \n 1.\tna associação de matas e florestas com culturas temporárias, as culturas temporárias serão as principais;\n" +
               "2.\tna associação de culturas temporárias e culturas permanentes as primeiras são consideradas sempre secundárias.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Proteaginosa","Culturas de plantas cultivadas e colhidas principalmente pelo seu teor de proteínas.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Proteaginosa para a Produção de Grão","Culturas proteaginosas para a produção de grão (incluindo sementes e misturas de leguminosas secas e cereais). Inclui:\n" +
               "1.\tErvilhas, favarolas e tremoços doces (Pisum sativum L., Vicia faba L., Lupinus spp.) em cultura pura, colhida em seco para grão.\n" +
               "2.\tLentilhas, grão de bico e ervilhaca (Lens culinaris, Cicer arietinum, Vicia pannonica Crantz ou Vicia varia) em caule pura, colhidos em seco para grão.\n" +
               "3.\tOutras proteaginosas para forragem: culturas cultivadas e colhidas em seco para grão, principalmente pelo seu teor de proteínas, diferentes das já indicadas.\n" +
               "4.\tExclui: as proteaginosas colhidas em verde, que, consoante a sua finalidade, devem ser classificadas como produtos hortícolas frescos ou como culturas forrageiras. Estas culturas são principalmente de leguminosas.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Regada","Ver Cultura Irrigada",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Sachada","Culturas que podem ser hortícolas, arvenses ou forrageiras, que necessitam de mobilizações frequentes do solo, entre as linhas da cultura, para controlo das ervas infestantes.\n Ver Cultura Forrageira Sachada",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Secundária","Culturas que proporcionam menor rendimento sob o ponto de vista económico, quando na mesma parcela de terreno se fazem sucessivamente várias culturas no mesmo ano agrícola, bem como as culturas efectuadas sobre coberto de culturas permanentes em compasso regular. \n Ver Cultura Principal",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Secundária Sucessiva","Culturas sucessivas à cultura principal (eventualmente precedendo) e colhidas ao longo dos 12 meses de referência. Deve registar-se a superfície de cada uma das culturas, caso exista mais do que uma cultura sucessiva (ou precedente). Exclui: as culturas hortofrutícolas intensivas, culturas em estufa e hortas familiares.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Sob-coberto","Culturas efectuadas em terra arável sob-coberto de culturas permanentes em compasso regular ou sob-coberto nas matas e florestas em povoamento regular. \n Ver Cultura Permanente e Povoamento Florestal",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Sob-Coberto de Matas e Florestas","Ver Cultura Sob-coberto de povoamento florestal",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Sob-coberto de Povoamento Florestal","Culturas temporárias, pastagens permanentes e pousio sob-coberto de matas e florestas. Por convenção, a cultura sob-coberto considera-se a cultura principal.",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Sucessiva","Ver Cultura Temporária Sucessiva",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Temporária","São culturas que têm um ciclo de vegetação inferior ou igual a seis (6) meses. Exemplo: Milho, Massango, Massambala, Arroz, feijão, Tomate, etc.\n",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Temporária Associada","Culturas temporárias que ocupam simultaneamente a mesma parcela.\n Ver Cultura Principal",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Temporária Associada Sob-Coberto de Cultura Permanente","Culturas temporárias que estão sob coberto de culturas permanentes. Por convenção, são consideradas culturas temporárias secundárias, uma vez que a cultura permanente é sempre considerada como principal.\n Ver Cultura Principal e Cultura Permanente",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Temporária Principal","Ver Cultura Temporária e Cultura Principal",uri_padrao))
       palavraCViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"C", "Cultura Temporária Sucessiva","Culturas que ocupam sucessivamente a mesma parcela no mesmo ano agrícola. Uma delas é considerada a cultura principal e a(s) outra(s) é(são) cultura(s) secundária(s).\n Ver Cultura Principal e Cultura Secundária",uri_padrao))

   }

    private fun inserirPalavraE(palavraEViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Enforcado","Ver Uveira",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Enrelvamento na Entrelinha","Prática agrícola que consiste na manutenção do revestimento vegetal natural ou semeado das entrelinhas das culturas permanentes, com o objetivo de reduzir a utilização de herbicidas, diminuir a mobilização do solo, prevenir a erosão, melhorar a estrutura do solo, facilitar a entrada nos pomares ou nas vinhas, contribuir para a biodiversidade.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Enxertia","Ver Propagação Vegetativa",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Equipamento de Mobilização do Solo","Ver Mobilização do Solo",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Escarificador","Ver Cultivador",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estaca","Fracção do ramo, herbáceo ou lenhoso, de uma planta que se destina a formar a parte subterrânea de uma nova planta ou a uma nova planta.\n Ver Propagação Vegetativa e Porta-Enxerto",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estação de Captação, Elevação e Filtração de Água","Estruturas de captação de água e instalações com equipamento para a elevar e filtrar, de forma a colocá-la disponível em todos os pontos de consumo de uma determinada área, em condições de serviço exigíveis pela respectiva utilização.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estado Fenológico","Estádio de desenvolvimento das plantas detectável por alterações morfológicas.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estrume Animal","Ver Estrume Sólido",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estrume Líquido","Urina de animais domésticos, incluindo, provavelmente",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estrume Sólido","Os excrementos de animais ou a mistura de palha e de excrementos de animais, mesmo transformados.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa","Estrutura fixa ou móvel, flexível ou rígida, em vidro, plástico ou outro material translúcido e impermeável à água, aquecida ou não, com a finalidade de alterar as condições climáticas no seu interior de modo a serem mais propícias ao desenvolvimento de uma cultura e dentro da qual uma pessoa pode trabalhar de pé e na vertical. Normalmente a estufa/abrigo alto é revestido a plástico só com arejamentos laterais e sem climatização. Considera-se a superfície total coberta pela estufa/abrigo alto, incluindo as passagens e o equipamento.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa com Solo","Estufa em que as plantas desenvolvem o seu sistema radicular no solo.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Dupla","Estufas com dois vãos livres. É indiferente o formato da cobertura, podendo ser capela, serra, arco abatido, em ângulo ou serreada.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Múltipla","Estufas com quatro, ou mais, vãos livres. É indiferente o formato da cobertura, podendo ser capela, serra, arco, abatido, etc.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Parral","Tipo de estufa cuja cobertura superior (tecto) está instalada com um ângulo pouco acentuado em relação ao solo (forma apenas uma água) e consta de um filme plástico entre duas redes de malha metálica.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Sem Solo","Estufa em que as plantas desenvolvem o seu sistema radicular num meio inerte (ex: perlite, lã de rocha) delimitado e isolado fora do solo, onde circula uma solução nutritiva.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Simples","Estufa com um único vão livre. É indiferente o formato da cobertura, podendo ser capela, serra, arco abatido, etc.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Tripla","Estufas com três vãos livres. É indiferente o formato da cobertura, podendo ser capela, serra, arco batido, etc.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Estufa Túnel","Estufas cujas paredes laterais e cobertura apresentam uma curvatura, em forma de túnel.",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Exploração Abandonada","Exploração que tinha os limites (em área, número de animais ou produção animal) estabelecidos para ser considerada exploração agrícola (no âmbito do Recenseamento Agrícola), mas que no momento da realização de um determinado inquérito agrícola não se encontra em produção, mantendo, no entanto, intacta a capacidade de retoma da actividade agrícola.\n Ver Atividade Agrícola",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Exploração Agrícola","Unidade técnico-económica que utiliza fatores de produção comuns, tais como: mão de obra, máquinas, instalações, terrenos, entre outros, e que deve satisfazer obrigatoriamente as quatro condições seguintes:\n Ver Actividade Agrícola \n 1.\tproduzir produtos agrícolas ou manter em boas condições agrícolas e ambientais as terras que já não são utilizadas para fins produtivos;\n" +
                "2.\tatingir ou ultrapassar uma certa dimensão (área, número de animais);\n" +
                "3.\testar submetida a uma gestão única;\n" +
                "4.\testar localizada num local bem determinado e identificável.\n",uri_padrao))
        palavraEViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"E", "Exploração Desaparecida","Exploração que tinha os limites (em área, número de animais ou produção animal) estabelecidos para ser considerada exploração agrícola (no âmbito do Recenseamento Agrícola), mas que no momento da realização de um determinado inquérito agrícola deixou de os ter.",uri_padrao))

    }

    private fun inserirPalavraF(palavraFViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Fertilizante","Ver Aplicação de Fertilizante \n \n 1.\tQualquer substância que contenha um ou mais compostos azotados, utilizada no solo para favorecer o crescimento da vegetação, pode incluir estrume e chorume animal, resíduos de empresas de piscicultura e da depuração.\n" +
                "2.\tSubstâncias utilizadas (adubos e/ou corretivos) com o objectivo de direta ou indiretamente melhorar a nutrição das plantas.\n",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Fertilizante Natural","Ver Fertilizante",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Fertilizante Químico","Qualquer fertilizante fabricado industrialmente. \n Ver Fertilizante",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Fertirrigação","Prática cultural que se baseia na incorporação dos adubos químicos (fertirrigação mineral) ou dos escorrimentos provenientes das instalações pecuárias (fertirrigação orgânica) na água de rega.",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Figueiral","Ver Pomar de Figueiras",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Filme de Plástico","Ver Cobertura de Plástico",uri_padrao))
        palavraFViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"F", "Fungicida","Substância ou preparação que destrói os fungos ou impede o seu desenvolvimento.",uri_padrao))

    }

    private fun inserirPalavraG(palavraGViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraGViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"G", "Galeria Ripícola","Estrutura linear de composição arbóreo-arbustiva e herbácea própria de zonas húmidas, ao longo de linhas água, ocupando uma faixa de 5 metros para os lados de ambas as margens.",uri_padrao))

    }

    private fun inserirPalavraH(palavraHViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraHViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"H", "Herbicidas","Produtos químicos, que, pela sua variedade e poder seletivo, atuam nas ervas daninhas procurando não prejudicar o normal desenvolvimento das culturas.",uri_padrao))
        palavraHViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"H", "Horta Familiar","Ver Exploração Agrícola\n\n 1.\tSuperfícies consagradas à cultura de produtos agrícolas destinados sobretudo ao consumo do próprio agricultor e do seu agregado familiar.\n" +
                "2.\tSuperfície de dimensão normalmente inferior a 20 ares, reservada à produção de hortícolas, frutos e flores destinados fundamentalmente ao autoconsumo. Inclui: as hortas familiares em terra limpa.\n" +
                "3.\tNotas: As hortas familiares, reconhecíveis como tais, estão normalmente separadas da restante superfície agrícola. Só a eventual produção excedente proveniente desta superfície é vendida pela exploração. Todas as superfícies cujos produtos sejam regularmente vendidos no mercado não são registadas neste ponto, mesmo que parte dos produtos seja consumida pelo produtor e pelo seu agregado familiar.\n" +
                "4.\tAs superfícies destinadas à produção de forragem para animais, mesmo que os animais sejam consumidos pelo produtor e respectiva família, são registadas nos respectivos pontos. Uma horta familiar pode apresentar-se sob a forma de terras aráveis e de culturas permanentes.\n" +
                "5.\tExcluem-se: jardins de recreio (parques e relvados); superfícies cultivadas para as necessidades de agregados colectivos, como por exemplo, centros de investigação, comunidades religiosas, pensionatos, prisões etc., desde que essa exploração ligada a um agregado colectivo reúna os outros critérios de uma exploração agrícola. Essas superfícies contam como superfícies da exploração agrícola, repartidas segundo a natureza da sua utilização.\n",uri_padrao))
      //  palavraHViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"H", "","",uri_padrao))

    }

    private fun inserirPalavraI(palavraIViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Improdutivo","Ver Zona Improdutiva",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Instalação Pecuária","Construções/instalações destinadas ao abrigo e produção de animais propriedade da exploração agrícola ou criados sob contrato. \n\n Ver Exploração Agrícola",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação","Aplicação de água ao solo com a finalidade de repor o nível de humidade necessário ao adequado desenvolvimento das culturas, de assegurar a sua protecção contra as baixas temperaturas, de lhes fornecer os adubos diluídos na água de rega ou de promover a lavagem dos sais em excesso do perfil do solo.",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação de Pivô Central","Ver Irrigação por Aspersão\n",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação de Superfície","1.\tIrrigação de superfície (inundação, sulcos). O encaminhamento da água no solo, quer por inundação de toda a superfície quer por condução através de pequenos sulcos entre linhas de sementeira, recorrendo à gravidade como motor.\n" +
                "2.\tMétodo de rega em que a água é distribuída às parcelas, sem pressão, utilizando apenas o desnível existente e sem recurso a qualquer forma de energia.\n",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação Gota-a-Gota","Método de rega localizada em que a água é aplicada diretamente ao nível das raízes das plantas com débitos reduzidos (2 a 12 l/h) e baixa pressão, por intermédio de gotejadores.",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação Localizada","Método de rega que se caracteriza pela distribuição de pequenos débitos próximo do nível do solo, por intermédio de emissores (gotejadores, difusores, microaspersores) dispostos uniformemente ao longo de linhas de abastecimento, visando a economia de água dado que esta é aplicada directamente na zona radicular reduzindo assim as perdas. Este processo permite a incorporação e aplicação de fertilizantes às plantas através da água de rega.",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação por Aspersão","Método de rega no qual a água é distribuída uniformemente e com uma pressão apropriada sob a forma de chuva ao terreno através da utilização de diversos aparelhos (aspersores, canhões de rega).",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação por Escoamento","Método de rega em que a água escorre sobre o terreno sob a forma de lençol com espessura mais ou menos regular, infiltrando-se no solo enquanto dura o escorrimento. \n\n Ver Rega Tradicional",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação por Faixas","Método de rega por escorrimento em que a água avança lenta e uniformemente em parcelas de terreno retangulares.",uri_padrao))
        palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "Irrigação por Sulcos","Ver Irrigação de Superfície",uri_padrao))
        //palavraIViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"I", "","",uri_padrao))

    }

    private fun inserirPalavraL(palavraLViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraLViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"L", "Lameiro","Terreno fértil e regado, próprio para prado permanente. Existem lameiros de regadio (têm disponibilidade de água todo o ano), de regadio imperfeito (não têm disponibilidade de água suficiente para rega durante o Verão) e os de sequeiro ou \"secadal\" (não têm disponibilidade de água para rega), todos eles próprios para prados permanentes, tendo em vista o corte e/ou o pastoreio.",uri_padrao))
        palavraLViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"L", "Latada","Ver Ramada",uri_padrao))
        palavraLViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"L", "Leguminosa Seca para Grão","Ver Cultura de Leguminosa Seca para Grão",uri_padrao))
        palavraLViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"L", "Leguminosa seca para grão em cultura estreme para gado","Ver Cultura Estreme de Leguminosa Seca para Grão para Alimentação Animal",uri_padrao))
        //palavraLViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"L", "","",uri_padrao))

    }

    private fun inserirPalavraM(palavraMViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Massa de Água","Linha de água permanente ou albufeira.\n\n Ver Reservatório de Água",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mata ou Esteva","Ver Mato",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mata ou Floresta","Ver Povoamento Florestal",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mata ou Floresta sem Cultura ou Sob-Coberto","Ver Povoamento Florestal sem Cultura ou Sob-Coberto",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Matadouro","Estabelecimento aprovado e licenciado pelas entidades competentes para a execução de abates e preparação das carcaças das espécies (bovina, ovina, caprina, suína , equina, aves , leitões e espécies abrangidas na designação caça de criação) destinados ao consumo público ou destinados à indústria.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Matagal","Conjunto de arbustos arbóreos e arbustivos espontâneos presentes numa determinada área, que são geralmente ramosas desde a base e apresentam uma porção de caule lenhificada.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mato","Terras ocupadas com matos rasteiros, bouças, estevas e que de um modo geral são terras potencialmente cultiváveis.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mobilização do Solo","Passagem sobre o solo de máquinas automotrizes, rebocadas ou montadas na linha ou na entrelinha. Esta operação pode ter como objectivo a preparação do terreno para sementeiras, o combate a infestantes ou a criação de condições favoráveis à instalação e desenvolvimento das culturas.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mobilização do Solo Convencional","Sistema de mobilização do solo tradicional, que se baseia na utilização da charrua, à qual se sucedem, normalmente, passagens com outras alfaias como a grade discos, escarificador.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Mobilização do Solo Mínima","Sistema de Mobilização de conservação do solo que, embora intervindo em toda a superfície do terreno, mantém uma quantidade apreciável de resíduos da cultura anterior à superfície do solo. Este sistema baseia-se na utilização de alfaias de mobilização vertical, estando interdito o uso de alfaias que promovam o reviramento do solo ou levantamento do torrão.",uri_padrao))
        palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "Monda Mecânica","Processo utilizado para combater as infestantes das culturas ou ervas daninhas, através da utilização de alfaias agrícolas apropriadas, rebocadas ou montadas no trator, com mobilização do solo a maior ou menor profundidade.",uri_padrao))
        //palavraMViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"M", "","",uri_padrao))

    }

    private fun inserirPalavraO(palavraOViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Obra de Drenagem","Ver Sistema de Drenagem",uri_padrao))
        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Olival","Plantação de oliveiras (Olea europea L.) incluindo olivais de variedades normalmente cultivadas para produção de azeitona de mesa e olivais de variedades normalmente cultivadas para produção de azeite. Povoamento regular de oliveiras com densidade superior a 45 árvores/ha. Povoamentos de oliveiras com densidade superior a 60 árvores/ha. É identificada a variedade e o método de irrigação.",uri_padrao))
        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Outra Área Não Agrícola","As zonas com vegetação de protecção, dunas, áreas ribeirinhas, pântanos, sapais, etc.",uri_padrao))
        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Outra Cultura Arvense","Ver Outra Cultura Temporária",uri_padrao))
        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Outra Forragem Verde","Outras forragens sobretudo anuais (por exemplo, ervilhacas, milho forrageiro, cereais colhidos e consumidos em verde, leguminosas).\n\n1.\tMilho forrageiro: culturas de milho (Zea mays L.) cultivado para silagem. Inclui-se todas as formas de milho forrageiro que não sejam colhidas para grão (espiga inteira, parte ou totalidade da planta). Inclui-se o milho forrageiro consumido directamente pelos animais (sem silagem) e a espiga inteira (grão + ráquia + folhelho) colhida para alimentação ou silagem.\n" +
                "2.\tOutras culturas arvenses destinadas a forragem, colhidas em verde, diferentes das indicadas. Inclui-se as várias espécies de trevo anuais ou perenes como: trevo encarnado (Trifolium incarnatum), trevo violeta (T. pratense L.), trevo branco (T. repens L.), trevo-de-alexandria (T. alexandrinum), trevo da Pérsia (Trifolium resupinatum) e diferentes tipos de luzerna. Inclui-se neste ponto as misturas de culturas predominantemente leguminosas (normalmente > 80 %) para forragem e gramíneas, colhidas em verde ou enquanto feno. Inclui culturas anuais como os cereais, variedades anuais de azevém e de sorgo, certas gramíneas anuais como a poa-anual (Poa annua L.), plantas de outras famílias como as crucíferas, diferentes das já indicadas (colza, etc.), se forem colhidas em verde. Exclui-se o milho forrageiro.\n",uri_padrao))
        palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "Outras Superfícies","Incluem-se em \"outras superfícies\" a superfície agrícola não utilizada (superfícies agrícolas que deixarem de ser exploradas por razões económicas, sociais ou outras, e que não façam parte do sistema de rotação) e superfícies ocupadas com edifícios, pátios, caminhos, lagoas, pedreiras, terras não aráveis, rochedos, exclusivamente para fins de proteção do ambiente e recreio. \n\nVer Exploração Agrícola",uri_padrao))
        //palavraOViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"O", "","",uri_padrao))

    }

    private fun inserirPalavraP(palavraPViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente","1.\tTerra permanentemente ocupada (por um período igual ou superior a cinco anos) com culturas forrageiras herbáceas, quer cultivadas (semeadas) quer naturais (espontâneas), que não estejam incluídas no plano de rotação da exploração. Nota: A terra pode ser utilizada para pastagem ou ceifada para silagem ou feno. Inclui: Prados e pastagens, excluindo pastagens pobres.\n" +
                "2.\tTerras ocupadas por plantas, em geral herbáceas, destinadas a serem comidas pelo gado no local em que vegetam e que acessoriamente podem ser cortadas em determinados períodos do ano; podem ser semeadas ou espontâneas e permanentes porque não estão incluídas numa rotação e ocupam o solo por um período superior a 5 anos. Podem ser: a) em terra limpa; quando a pastagem não está associada ou sob-coberto de uma cultura permanente nem está sob-coberto de matas e florestas; b) sob-coberto de culturas permanentes; c) sob-coberto de matas e florestas.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente de Sequeiro","Terras ocupadas com erva ou outras forrageiras herbáceas espontâneas e não regadas, não incluídas no sistema de rotação da exploração por um período igual ou superior a cinco anos.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente em Terra Limpa","Terras ocupadas com erva ou outras forrageiras herbáceas, quer cultivadas (semeadas) quer naturais (espontâneas) não incluídas nos sistema de rotação da exploração por um período igual ou superior a cinco anos e que não estão associadas ou sob-coberto de nenhuma cultura permanente (pomares, olivais, vinhas), ou de matas e florestas.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente Espontânea Pobre","Pastagens permanentes de crescimento espontâneo utilizadas, periódica ou permanentemente, para alimentação de gado que não são melhoradas por adubações, cultivos, sementeiras ou drenagens; situam-se frequentemente em zonas acidentadas. Pastagem Permanente Espontânea, Melhorada ou Semeada\n" +
                "1.\tPrados e pastagens, excluindo pastagens pobres. Pasto permanente em solos de boa e média qualidade. Estas superfícies podem, normalmente, ser utilizadas para Exclui: a) as pastagens pobres, utilizadas periódica ou permanentemente, b) pastagens e prados não utilizados, i.e., sem actividade agrícolas.pastagem intensiva.\n" +
                "2.\tPastagens semeadas ou de crescimento espontâneo, que são melhoradas por adubações, cultivos, sementeiras ou drenagens.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente Espontânea, Melhorada ou Semeada","1.\tPrados e pastagens, excluindo pastagens pobres. Pasto permanente em solos de boa e média qualidade. Estas superfícies podem, normalmente, ser utilizadas para pastagem intensiva. Exclui: a) as pastagens pobres, utilizadas periódica ou permanentemente, b) pastagens e prados não utilizados, i.e., sem actividade agrícolas.\n" +
                "2.\tPastagens semeadas ou de crescimento espontâneo, que são melhoradas por adubações, cultivos, sementeiras ou drenagens.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente Natural de Sequeiro","Ver Pastagem Permanente de Sequeiro",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Permanente Regada","Pastagens permanentes regadas, pelo menos uma vez ao longo do ano, quer se encontrem em terra limpa, quer sob-coberto de matas e florestas. Por definição, só as pastagens espontâneas e semeadas se consideram como regadas.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Pobre","Ver Pastagem Permanente Espontânea Pobre",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pastagem Temporária","1.\tTerrenos com gramíneas para pastagem, feno ou silagem incluídas num sistema normal de rotação de culturas, que ocupem o solo durante pelo menos um período de menos de cinco anos, sendo a sementeira feita com gramíneas puras ou em mistura. Antes de nova sementeira, as superfícies são totalmente revolvidas, quer por lavoura, quer por outro método, podendo ainda a destruição das plantas efectuar-se através de outros meios, por exemplo herbicidas. Nota: Incluem-se neste ponto as misturas predominantemente de gramíneas e de outras culturas forrageiras, em geral leguminosas) para pastagem, colhidas em verde ou enquanto feno. Não se incluem as culturas anuais de gramíneas (que ocupem o solo durante menos de um ano agrícola).\n" +
                "2.\tPlantas herbáceas semeadas, destinadas a serem comidas pelo gado no local onde vegetam, integradas numa rotação, ocupando o solo por um período geralmente não superior a 5 anos. Acessoriamente podem ser cortados em determinados períodos do ano.\n" +
                "3.\tTodos os prados com duração inferior a 5 anos.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pivô ou Rampa Rotativa","Dispositivo de rega que roda em torno de um eixo passando por uma das suas extremidades.\n\nVer Irrigação por Aspersão",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Planta Industrial","Ver Cultura Industrial",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Plástico Rígido","Ver Cobertura de Plástico",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar","Povoamento regular de árvores de fruto, com uma densidade mínima de 100 árvores/ha. No caso do olival, figueiras e frutos secos, a densidade mínima é de 45 árvores/ha. Os povoamentos de pomoideas, prunoideas, soutos e de outras espécies “fruteiras”, estremes ou associadas, caso do amendoal e do figueiral, a densidade mínima é de 60 árvores/ha.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Amendoeiras","1.\tPovoamento regular de amendoeiras (Prunus dulcis) com densidade superior a 45 árvores/ha.\n" +
                "2.\tPovoamento de amendoeiras (Prunus dulcis) com densidade superior a 60 árvores/ha.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Árvores de Fruto ou Baga","Conjuntos de árvores, arbustos e de outras bagas perenes, que não morangos, destinados à produção de frutos. Os pomares incluem tanto as formas de plantação com compasso mínimo, como as formas de plantação de largos compassos em associação ou não com outras culturas. Incluem-se os castanheiros. Excluem-se os pomares de citrinos, os olivais e as vinhas.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Árvores de Fruto ou Baga de Espécies de Origem Subtropical","Pomares de árvores de frutos e bagas, tradicionalmente cultivadas em climas subtropicais para a produção de frutos ou bagas frescos. São considerados frutos e bagas de espécies subtropicais, por exemplo, as culturas seguintes: anona (Anona), ananás (Ananas spp.), abacate (Persea spp.), banana (Musa spp.), figo da Índia (Opuntia spp.), lechia (Litchi spp.), papaia ou mamão (Carica spp.), manga (Mangifera spp.), goiaba (Psidium spp.) e maracujá (Passiflora spp.).",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Árvores de Fruto ou Baga de Espécies de Origem Temperada","Pomares de árvores de frutos e bagas, tradicionalmente cultivadas em climas temperados para a produção de frutos ou bagas frescos.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Citrinos","Pomares de citrinos (Citrus spp.). Povoamento de uma ou mais espécies de citrinos cuja densidade seja superior a 40 árvores/ha",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Figueiras","1.\tPovoamentos de figueiras (Ficus carica) com densidade superior a 60 árvores/ha.\n" +
                "2.\tPovoamento regular de figueiras (Ficus carica) com densidade superior a 45 árvores/ha.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar de Frutos de Casca Rija","Ver Pomar de Árvores de Fruto ou Baga Exemplos: nozes (Juglans regia L.), avelãs (Corylus avelanna L.), amêndoas (Prunus dulcis (Mill.) D.A. Webb.) e castanhas (Castanea sativa Mill.).",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pomar Estreme","Pomar constituído por única espécie (ex: pomar de cerejeiras).",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Porta-Enxerto","Planta com raízes ou parte da planta enraizada (estaca) sobre a qual se procede a uma enxertia com um pedaço proveniente de outra planta de uma espécie ou variedade diferente (ex.: garfo, borbulha). O porta-enxerto pode ser designado também por cavalo. \n\nVer Propagação Vegetativa",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pousio","Ver Terra em Pousio \n\n 1.\tOs pousios não devem ser confundidos com as culturas secundárias sucessivas nem com a superfície agrícola utilizada. A característica essencial dos pousios é o facto de a terra ficar em recuperação, normalmente dura, todo um ano agrícola. Os pousios podem consistir em: a) Terra sem qualquer cultura. b) Terra com vegetação espontânea, que pode ser usada para forragens ou enterrada. c) Terra semeada exclusivamente para a produção de adubo verde.\n" +
                "2.\tTerras incluídas no afolhamento ou rotação, trabalhadas ou não, não fornecendo colheitas durante toda a campanha, tendo em vista o seu melhoramento. Podem apresentar-se sob as formas de: a) terras sem qualquer cultura; b) terras com uma vegetação espontânea, em certos casos utilizada pelos animais ou enterrada; c) terras semeadas tendo em vista a exclusiva produção de matéria verde para ser enterrada e aumentar a fertilidade do solo.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Pousio em Regime de Ajuda","Pousio em relação ao qual a exploração teve direito a uma ajuda financeira.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento de Quercíneas ou Alfarrobeiras","Os povoamentos de montado, carvalhal ou pomares de alfarroba com densidades entre 21 e 40 arvores/ha.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal","Superfícies cobertas com árvores ou arbustos florestais, incluindo choupais, quer no interior, que no exterior das florestas, viveiros florestais localizados no interior das florestas e que se destinem às necessidades de exploração, bem como recursos ou instalações florestais (caminhos florestais, depósitos para madeira, etc.). No caso de associação entre culturas agrícolas e silvícolas, a superfície registada reparte-se proporcionalmente a utilização do solo. Incluem-se igualmente os \"quebra-ventos\" e os limites florestados que se localizem na exploração e que se considere oportuno incluir na superfície com matas e florestas. Incluem-se árvores de Natal, bem como plantações de árvores e arbustos que serão utilizados na produção de energia, independentemente do local onde são semeados. Excluem-se:\n\n Ver Superfície Florestal \n\n1.\tas nogueiras e os castanheiros que se destinem principalmente à produção de fruto, as outras plantações não florestais (culturas permanentes) e os viveiros;\n" +
                "2.\tas áreas com árvores isoladas, pequenos grupos e renques de árvores;\n" +
                "3.\tos parques, jardins de recreio, pastagens permanentes e pastagens pobres não utilizadas;\n" +
                "4.\tas charnecas;\n" +
                "5.\tos viveiros florestais comerciais e outros viveiros fora da floresta.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal com Cultura Associada","Ver Povoamento Florestal",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal com Cultura Permanente","Povoamentos em que coexistem montado, souto, alfarrobal, carvalhal, amendoal, figueiral, olival, citrinos, e/ou outras fruteiras em densidades que variam entre as 21 e as 50 árvores/ha e em que para os 4 primeiros povoamentos o número de árvores não supere as 30 por hectare.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal Estreme","Ver Povoamento Florestal \n\n 1.\tOs povoamentos são considerados estremes sempre que uma dada espécie ocupa 75% ou mais, da área total.\n" +
                "2.\tConsideram-se nesta categoria as áreas ocupadas por um conjunto contínuo de árvores florestais (incluindo os viveiros florestais no interior da floresta), de uma só espécie, com e sem uso silvo-pastoril.\n",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal Misto","Consideram-se nesta categoria as áreas ocupadas por um conjunto contínuo de árvores florestais (incluindo viveiros florestais localizados no interior da floresta), de mais do que uma espécie, com e sem uso silvo-pastoril. \n\n Ver Povoamento Florestal com Cultura Permanente",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal sem Cultura Associada","Toda a área ocupada por mato, arbustos e/ou árvores (espécies florestais) sem fins agrícolas, cuja densidade é superior a 40 árvores/ha. Exclui: área de quercíneas e alfarrobeiras, povoamento misto.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Florestal sem Cultura Sob-coberto","Superfícies cobertas com árvores ou arbustos florestais, incluindo choupais, quer se trate de povoamentos puro (com uma só espécie), quer de povoamentos mistos (com espécies diversas) bem como os viveiros florestais localizados no interior das florestas e que se destinam às necessidades da exploração. Exclui: as áreas com árvores isoladas, pequenos grupos e linhas de árvores, as nogueiras e castanheiros que se destinam principalmente à produção de fruto, as plantas para entrançar (vime, cana, junco, etc.) e os viveiros florestais comerciais e outros viveiros fora da floresta (este grupo inclui-se em Viveiros). Inclui: os “quebra-ventos” e os limites florestados localizados na exploração, sempre que se considerem com alguma importância.",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Povoamento Misto","Ver Povoamento Florestal com Cultura Permanente",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Prado ou Pastagem Permanente","Ver Pastagem Permanente",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Prado ou Pastagem Temporária","Ver Pastagem Temporária",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Prado ou Pastagem, excluindo Pastagem Pobre","Ver Pastagem Permanente Espontânea, Melhorada ou Semeada",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Prado Permanente","Superfície ocupada por prados com duração superior a 5 anos. Normalmente os prados são declarados como forrageira.\n\nVer Pastagem Permanente e Cultura Forrageira",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Prado Temporário","Ver Pastagem Temporária",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Produto Hortícola","Ver Cultura Hortícola",uri_padrao))
        palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "Produto Hortícola Fresco, Melão ou Morango","Ver Cultura Hortícola",uri_padrao))
        //palavraPViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"P", "","",uri_padrao))

    }

    private fun inserirPalavraQ(palavraQViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraQViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Q", "Queimada","O uso do fogo para a renovação das pastagens.",uri_padrao))
        //palavraQViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Q", "","",uri_padrao))

    }

    private fun inserirPalavraR(palavraRViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Raça","Ver Variedade",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Ramada","As ramadas ou latadas consistem, em termos gerais, em estruturas horizontais, de ferro ou de madeira e arame, assentes sobre esteios, geralmente de granito. Estas estruturas vêem-se com frequência sobre caminhos, largos, logradouros públicos como tanques e fontes, ou na orla dos campos, podendo também aparecer, mais raramente, em sistema de vinha contínua (neste caso apresentam uma forma em dente de serra, isto é, oblíquas e não paralelas ao solo). No seu sentido mais comum, trata-se de um sistema que permite aproveitar produtivamente espaços improdutivos, ou sobrepor-se a outras culturas; é frequente, com efeito, cultivar batatas debaixo de ramadas quando na orla de campos ou em regime de vinha contínua.",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rede de Rega","Ver Sistema de Irrigação",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega","Aplicação de água ao solo com a finalidade de repor o nível de humidade necessário ao adequado desenvolvimento das culturas.\n\nVer Irrigação",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega de Lima","Método de rega instalado em terrenos mais ou menos acidentados nos quais a rega se faz por escorrimento superficial, segundo o processo de regadeira de nível.",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega em Faixas","Ver Irrigação por Faixas",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega Gota a Gota","Ver Irrigação Gota-a-Gota",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega Localizada","Ver Irrigação Localizada",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega por Aspersão","Ver Irrigação por Aspersão",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega por Aspersão com Ramais Fixos/Móveis","Método de rega em que todo o terreno é abrangido como uma chuva, podendo a instalação ser fixa (as tuba ficam dispostas no terreno ou enterradas durante todo o ciclo da cultura) ou móvel (as tubagens e os aspersores são mudados para outras posições de rega).\n\nVer Irrigação por Aspersão",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega por Escorrimento","Ver Irrigação por Escoamento",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega por Gravidade","Ver Irrigação de Superfície",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega por Microaspersão","Método de rega localizada em que a água é aplicada directamente ao nível das raízes das plantas com débito na ordem dos 20 a 150 l/h e baixa pressão por intermédio de microaspersores e difusores. \n\n Ver Irrigação Localizada eIrrigação por Aspersão",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Rega Tradicional","Aplicação de água ao solo através dos métodos tradicionais por gravidade, ou seja: escorrimento, alagamento e infiltração, os quais se podem ainda subdividir em: \n\n 1.\tEscorrimento - faixas, regadeiras de nível ou inclinadas, cavaletes e planos inclinados;\n" +
                "2.\tAlagamento: canteiros e caldeiras;\n" +
                "3.\tInfiltração: sulcos.\n",uri_padrao))
        palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "Regadeira de Nível","Método de rega por escorrimento em que se usam sulcos com uma pequena inclinação ao longo das curvas de nível, de onde a água transborda e escorre ao longo da superfície do terreno até à regadeira seguinte situada a altura inferior. \n\n Ver Rega de Lima",uri_padrao))
        //palavraRViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"R", "","",uri_padrao))

    }

    private fun inserirPalavraS(palavraSViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Semente ou Propágulo de Outras Culturas Não-lenhosas","Ver Viveiro ou Cultura para Produção de Semente de Plantas Não-lenhosas",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Semente ou Propágulo de Terras Aráveis","Ver Viveiro ou Cultura para Produção de Semente de Plantas Não-lenhosas",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Silo para Forragem","Instalações que se destinam exclusivamente à conservação de forragens verdes fermentadas por períodos longos para alimentação do gado. Excluem-se os armazéns e outras instalações para guardar fenos e palhas ou forragem que se destinem a ser consumidas nos dias imediatos aos da colheita.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema Antigeada para Aquecimento","Sistema de aquecimento instalado na estufa ou lote de estufas funcionando preventivamente, quando se receia a ocorrência de geadas.\n\n Ver Estufa",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema Antigeada por Rega por Aspersão","Aspersores Instalados Sobre a Cobertura da Estufa ou Lote de Estufas. \n\n Ver Estufa",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Condução de Vinha","Ver Vinha",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Drenagem","Sistema de valas, drenos subterrâneos, estações elevatórias ou obras similares, com que se assegura a evacuação das águas em excesso de uma determinada zona.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Irrigação","Sistema de canais e/ou condutas, caixas, acessórios e equipamentos, etc., que permitem distribuição de água por todos os pontos da zona a regar.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Rega Coletivo","Sistema destinado a servir várias explorações e constituído por infra-estruturas postas a funcionar por um organismo público ou por particulares agrupados numa organização, associação de agricultores, em que, em qualquer parte daquelas, há uma utilização colectiva do mesmo. Completam-se geralmente, por um conjunto de instalações e/ou equipamentos, que são propriedade exclusiva das explorações.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Rega de Distribuição Gravítica","Canais ou condutas e outras infra-estruturas inerentes para transporte gravítico de água, projectados e construídos por forma a garantir a distribuição dos caudais requeridos para a rega, solicitados por requisição prévia.\n\n Ver Sistema de Irrigação",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Rega de Distribuição sob Pressão","Redes de condutas pressurizadas e respectivos órgãos de segurança, projectadas e construídas por forma a garantir a distribuição de água para rega, à descrição, em condições equitativas de serviço (caudal e pressão).\n\n Ver Sistema de Irrigação",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Sistema de Rega Individual","Sistema de rega destinado a servir apenas uma exploração agrícola, não havendo utilização colectiva de nenhum troço do sistema.\n\n Ver Sistema de Irrigação",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Agrícola Não Utilizada","Superfície da exploração que já não é explorada, por razões económicas, sociais ou outras e que não entra no sistema de rotação, não se destinando assim a qualquer utilização agrícola.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Agrícola Utilizada","Superfície da exploração que inclui: terras aráveis (limpa e sob-coberto de matas e florestas), horta familiar, culturas permanentes e pastagens permanentes.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Beneficiada com Drenagem","Ver Zona Drenada",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Colhida","Superfície que foi objecto de colheita.\n\n Ver Superfície Agrícola Utilizada",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície com Problemas de Encharcamento","Ver Zona com Problemas de Encharcamento",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície de Base da Estufa","Superfície na qual se efectuam as culturas em estufa ou abrigo alto, incluindo passagens e eventual equipamento.\n\n Ver Estufa",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Drenada","Ver Zona Drenada",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Florestal","1.\tTerras cujo uso é dedicado à actividade florestal, independentemente de se tratarem de superfícies com povoamentos de uma só espécie ou mistos, podendo também incluir áreas ardidas ou áreas de corte raso.\n" +
                "2.\tSuperfícies cobertas com árvores ou arbustos florestais, incluindo choupais, quer se trate de povoamentos puros (com uma só espécie), quer se trate de povoamentos mistos (com espécies diversas) e ainda os viveiros florestais localizados no interior das florestas e que se destinam às necessidades da exploração. Exclui: as áreas com árvores isoladas, pequenos grupos e linhas de árvores, as nogueiras e castanheiros que se destinam principalmente à produção de frutos e as plantas para entrançar (vime, cana, junco, etc.).\n" +
                "3.\tTerras pertencendo à exploração agrícola, ocupadas por povoamentos florestais naturais ou artificiais e cujos produtos tem aproveitamento.\n",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Forrageira Temporária","Ver Cultura Forrageira",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Irrigada","Ver Cultura Irrigada",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Irrigável","Superfície máxima que, no decurso do ano de referência, poderia, se necessário, ser irrigada por meio de instalações técnicas e por uma quantidade de água normalmente disponível para a exploração.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Irrigável Total","Ver Superfície Irrigável",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Total da Exploração","Soma da superfície agrícola utilizada, da superfície das matas e florestas sem cultura sob-coberto, da superfíe agrícola não utilizada e das outras superfícies da exploração.",uri_padrao))
        palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "Superfície Vitícola","Ver Vinha",uri_padrao))
        //palavraSViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"S", "","",uri_padrao))

    }

    private fun inserirPalavraT(palavraTViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra Arável","Ver Zona Arável",uri_padrao))
        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra Arável Limpa","Ver Zona Arável Limpa",uri_padrao))
        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra com Matas e Florestas","Ver Povoamento Florestal",uri_padrao))
        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra Drenada","Ver Zona Drenada",uri_padrao))
        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra em Pousio","Ver Pousio",uri_padrao))
        palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "Terra Limpa","Ver Zona Arável Limpa",uri_padrao))
        //palavraTViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"T", "","",uri_padrao))

    }

    private fun inserirPalavraU(palavraUViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraUViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"U", "Uveira","Forma de instalação de vinha também conhecida por vinha de enforcado. Junto a uma árvore, um castanheiro, choupo ou um plátano plantam-se de uma a quatro videiras que se deixam crescer livremente, entrelaçando com os ramos da árvore de suporte (que são violentamente podadas para dar maior relevo à videira). Estas videiras podem atingir enormes proporções. Não exigem espaço nem adubação próprios, satisfazem-se muitas vezes com podas ano sim, ano não, e ainda por cima cada pé pode produzir vários cestos de uvas.",uri_padrao))
        //palavraUViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"U", "","",uri_padrao))

    }

    private fun inserirPalavraV(palavraVViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Variedade","Grupo de plantas ou animais que se distinguem de outras da mesma espécie por caracteres particulares que transmitem às gerações seguintes e que podem constituir uma casta ou cultivar (plantas) ou uma raça (animal).",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vegetação Arbustiva e Arbórea","Ver Matagal",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha","1.\tSuperfície plantada com videiras (Vitis vinifera L.). Inclui: Vinhas que produzam normalmente vinho de qualidade, i.e. culturas de variedades de uva de vinho, destinadas normalmente à produção de vinhos de qualidade produzidos em regiões determinadas (VQPRD) que correspondam às disposições do Regulamento (CE) n.o 1493/1999 do Conselho, de 17 de Maio de 1999, que estabelece a organização comum do mercado vitivinícola ou, se for caso disso, às disposições legais mais recentes e às disposições adoptadas na aplicação deste e definidas por regulamentações nacionais. Vinhas que produzam normalmente outros vinhos, i.e. culturas de variedades de uva de vinho destinadas à produção de vinhos, com excepção dos VQPRD. Vinhas que produzam normalmente uvas de mesa, i.e. culturas de variedades de uvas de vinho destinadas à produção de uvas frescas. Vinhas que produzam normalmente uvas para passas, i.e. culturas de variedades de uvas de vinho destinada à produção de uvas para passas.\n" +
                "2.\tSuperfície plantada com videiras cuja uva se destina ao consumo em natureza ou para vinificação e é produzida por castas especiais ou cultivadas com estes fins.\n" +
                "3.\tIncluem-se as áreas plantadas com vinha contínua e/ou descontínua (bordadura ou cordão), em cultura pura ou associada, em produção ou não (mas já enxertadas) destinadas à produção de vinho ou de uvas. Exclui: o número de pés de videira que não sejam considerados uma plantação regular ou vinha de bordadura de cordão, os quais são incluídos em número de pés dispersos de vinha para vinho. Os povoamentos de videiras quer para produção de uva quer para campos de pés-mães. É considerada a vinha plantada de forma ordenada, desordenada e na bordadura dos campos.\n",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha com Porta-Enxertos Ainda não Enxertados","Plantação de porta-enxertos (bacelos), em local definitivo, que em época oportuna serão submetido a enxertia de variedades de videiras para produção de uvas para vinho, de uvas de mesa e passa. \n\n Ver Vinha e Porta-Enxerto",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha de Enforcado","Ver Uveira",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha para Produção de Materiais de Propagação Vegetativa de Videira","Superfície plantada com vinhas-mãe para produção de porta-enxertos e as vinhas-mãe para produção de garfos.\n\n Ver Vinha e Viveiro de Cultura Lenhosa",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha para Uva de Mesa","Superfície plantada com videiras cuja uva se destina ao consumo em natureza e é produzida por castas especialmente cultivadas com este fim.\n\n Ver Vinha",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha para Vinho","Superfície plantada com videiras cuja uva se destina à vinificação.\n\n Ver Vinha",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Vinha-Mãe de Porta-Enxertos","Superfície plantada com videiras destinadas à produção de estacas para enraizar ou para enxertar.\n\n Ver Estaca e Porta-Enxerto",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro","Superfície onde se cultivam plantas ou partes de plantas que se destinam a serem transplantadas.\n\n Ver Viveiro de Cultura Lenhosa",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro de Cultura Lenhosa","Parcela onde se cultivam plantas ou parte de plantas de espécies lenhosas, com exceção das espécies florestais, que se destinam a serem transplantadas.",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro de Plantas Lenhosas não Florestais","Parcela onde se cultivam plantas ou parte de plantas de espécies lenhosas, com excepção das espécies flores que se destinam a serem transplantadas.\n\n Ver Viveiro de Cultura Lenhosa",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro de Plantas Não-Lenhosas","Parcela onde se cultivam plantas ou partes de plantas, excepto de culturas lenhosas, que se destinam a serem transplantadas.",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro Florestal","Superfície de plantas lenhosas jovens de espécies florestais, ao ar livre, destinadas a serem transplantadas. Incluem-se: os viveiros florestais comerciais localizados ou não na floresta; os viveiros florestais destinados às necessidades da exploração se localizados fora da floresta.\n\n Ver Viveiro de Cultura Lenhosa",uri_padrao))
        palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "Viveiro ou Cultura para Produção de Semente de Plantas Não-Lenhosas","1.\tSuperfícies para a produção de sementes e de propágulos destinados à venda, com exclusão do arroz, leguminosas secas, batatas e sementes oleaginosas. As sementes e propágulos para as necessidades da exploração (por exemplo, jovens propágulos de produtos hortícolas tais como propágulos de couves ou alfaces) incluem-se nas rubricas das respectivas culturas. Incluem-se as sementes das plantas forrageiras herbáceas.\n" +
                "2.\tSementes de beterraba sacarina, culturas industriais (com excepção de: colza, girassol, soja e outras oleaginosas, culturas hortícolas e flores e plantas ornamentais e os seguintes propágulos: partes de flores, folhas e caules, plantas em vasos ou sacos, bolbos, rizomas e tubérculos.\n\n Superfície plantada com videiras destinadas à produção de bacelos ou de bacelos enxertados.\n\n Superfície plantada com videiras destinadas à produção de bacelos ou de bacelos enxertados.",uri_padrao))
        //palavraVViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"V", "","",uri_padrao))

    }

    private fun inserirPalavraZ(palavraZViewModel: PalavraViewModel){

        val uri_padrao = "android.resource://com.example.rappdicionario/drawable/ine_logo"

        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Agrícola","Ver Zona Arável",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Arável","Ver Cultura Temporária, Pousio e Cultura em Estufa\n\n 1.\tTerras trabalhadas (lavradas, cultivadas) regularmente e que entram geralmente num sistema de rotação de culturas. Nota: O sistema de rotação de culturas implica que as culturas de uma determinada folha se seguem umas às outras, de acordo com um plano pré-definido. Normalmente, as culturas são alteradas anualmente mas também se pode optar por um intervalo plurianual. Para discriminar entre superfícies de terras aráveis e de terras destinadas a culturas permanentes ou de prados permanentes, é utilizado um limiar de cinco anos. Tal significa que uma área que seja utilizada para a mesma cultura durante um período igual ou superior a cinco anos, sem que, entretanto, seja removida a cultura anterior e estabelecida uma nova, não é considerada como terra arável. Inclui: certas culturas normalmente consideradas como produtos hortícolas, culturas de plantas ornamentais, plantas industriais (por exemplo, espargos, rosas, plantas ornamentais pela flor e/ou pela verdura e folhagem, morangos, lúpulo), mesmo que ocupem o solo por mais de cinco anos. Inclui: As terras aráveis compreendem as categorias de culturas temporárias, incluindo culturas em estufa, os pousios sem regime de ajuda e os pousios com regime de ajuda à retirada de terras sem uso económico. Muito embora se encontrem classificadas nas respectivas categorias, as superfícies de plantas industriais cultivadas em terras retiradas da produção são igualmente registadas numa categoria específica. Exclui: Hortas familiares; prados e pastagens permanentes; culturas permanentes; superfícies da exploração agrícola sem utilização agrícola (improdutivos, áreas sociais, jardins, superfícies florestais).\n" +
                "2.\tSuperfície que é frequentemente mobilizada com lavouras, cavas, sachas, etc. e que se destina a culturas de sementeira anual (ex. cereais, feijão, girassol, batata, etc.). Também se classificam como terras aráveis as que são ressemeadas com culturas que ocupam o solo por um período inferior a 5 anos (morangos, espargos e prados temporários), as terras em pousio e a horta familiar. São todas as terras que entram normalmente numa rotação. Inclui: cereais para grão, leguminosas secas para grão, prados temporários e culturas forrageiras, batata, beterraba sacarina, culturas industriais, culturas hortícolas extensivas, culturas hortícolas intensivas, flores e plantas ornamentais, sementes de culturas forrageiras, sementes e propágulos de outras culturas não lenhosas, outras culturas temporárias, pousio em regime de ajuda, pousio sem regime de ajuda e horta familiar.\n" +
                "3.\tCorresponde à soma das áreas de culturas temporárias principais (em terra limpa e em sob-coberto de mata e florestas) e de pousio.\n",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Arável Limpa","Terra com culturas temporárias principais e pousio em terra limpa, isto é, sem coberto de culturas permanentes, matas e florestas.\n\n Ver Zona Arável",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona com Problemas de Encharcamento","Superfície da exploração que normalmente apresenta problemas de excesso de água que prejudicam as culturas praticadas e as operações culturais.\n\n Ver Zona Drenada",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona de Montanha","Zonas que se caracterizam por uma considerável limitação das possibilidades de utilização da terra e por um considerável aumento do custo do trabalho, devido:\n\n 1.\tà existência de condições climatéricas muito difíceis resultantes da altitude, que se traduzam por um período vegetativo sensivelmente encurtado; ou\n" +
                "2.\ta altitudes inferiores, à presença na maior parte do território de fortes inclinações que impeçam a utilização de máquinas ou exijam a utilização de equipamento específico muito oneroso; ou\n" +
                "3.\tà combinação destes dois factores, quando a importância das desvantagens resultantes de cada um deles, considerando separadamente seja menos acentuada, desde que esta combinação dê lugar a uma desvantagem equivalente.\n",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Desfavorecida","Inclui:\n\n 1.\tZona de montanha;\n" +
                "2.\tZona afectada por desvantagens específicas;\n" +
                "3.\tZonas desfavorecidas ameaçadas de abandono da utilização das terras e nas quais seja necessária a manutenção do espaço natural, as zonas agrícolas homogéneas do ponto de vista das condições naturais de produção, que apresentem simultaneamente as seguintes características: presença de terras pouco produtivas, de difícil cultivo e com fracas potencialidades, que não possam ser melhoradas sem custos excessivos e que sejam sobretudo adequadas para a produção animal extensiva; uma produção sensivelmente inferior à média em termos dos principais índices de rendimento económico da agricultura, devido à fraca produtividade do meio natural; uma população escassa, ou com tendência para a diminuição, que dependa predominantemente da actividade agrícola e cujo declínio acelerado poria em causa a viabilidade e o povoamento da zona em causa.\n",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Drenada","1.\tSuperfície da exploração onde se encontram implantadas valas a céu aberto, ou tubos perfurados enterrados a profundidade variável, com vista a eliminar o excesso de humidade no solo. Inclui: os drenos antigos mas ainda eficientes. Exclui: os drenos obstruídos ou não operacionais e as valas e bordadura das parcelas que não tenham função de drenagem.\n" +
                "2.\tTerras em que foram efectuados melhoramentos (enxugo) de modo a evitar o encharcamento das terras.\n",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Florestal","Ver Povoamento Florestal",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Improdutiva","1.\tTerreno estéril do ponto de vista da existência de comunidades vegetais ou com capacidade de crescimento extremamente reduzido, quer em resultado de limitações naturais, quer em resultado de acções antropogénicas.\n" +
                "2.\tTodas as áreas que, do ponto de vista agrícola, não produzem ou em que os solos foram destruídos por qualquer razão (pedreiras, etc.).\n",uri_padrao))
        palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Social","Ver Exploração Agrícola\n\n 1.\tTerreno da exploração agrícola ocupado por edifício(s) destinado à habitação humana, e pelos terrenos que sirvam de logradouro.\n" +
                "2.\tZona urbana, industrial, edifícios e outras constuções.\n",uri_padrao))
        //palavraZViewModel.inserirPalavra(Palavra(UUID.randomUUID().toString(),"Z", "Zona Social","",uri_padrao))

    }
}