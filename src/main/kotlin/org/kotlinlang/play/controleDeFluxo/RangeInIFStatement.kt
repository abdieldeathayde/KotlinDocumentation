package org.kotlinlang.play.controleDeFluxo

fun  main() {
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not range from 6 to 10")
    }
}