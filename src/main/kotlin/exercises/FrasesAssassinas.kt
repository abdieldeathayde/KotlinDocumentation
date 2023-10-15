package exercises

import java.util.*
//class FrasesAssassinas(val frase)

fun main() {
    val frasesAssassinas = ArrayList<String>()
    frasesAssassinas.add("Isto não vai dar certo")
    frasesAssassinas.add("Você nunca vai conseguir")
    frasesAssassinas.add("Você vai se estrepar")
    frasesAssassinas.add("Não vai dar em nada")
    frasesAssassinas.add("Está tudo errado!")


    for (frase in frasesAssassinas) {
        println(frase)
    }

}