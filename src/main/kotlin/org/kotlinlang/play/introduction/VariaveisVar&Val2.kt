package org.kotlinlang.play.introduction

fun someCondition() = true
fun main() {
    val d: Int

    if (someCondition()) {
        d = 7
    } else {
        d = 2
    }

    println(d)
}
