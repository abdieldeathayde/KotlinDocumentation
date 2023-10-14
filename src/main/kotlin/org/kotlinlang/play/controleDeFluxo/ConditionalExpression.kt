package org.kotlinlang.play.controleDeFluxo

fun main() {

    // no Kotlin não temos if ternario mas tempos o Conditional Expression

    fun maxOld(a: Int, b: Int) : Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    fun max(a: Int, b: Int) = if (a > b) a else b      //1

    println(max(99, -42))
    println(maxOld(99, -42))
}