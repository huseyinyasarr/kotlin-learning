package com.example.myapplication

fun main() {

    for (i in 3..5) {
        println("$i")
    }
    println("\n")

    val value = 2
    val startValue = 10
    val finishValue = 40

    for (i in startValue..finishValue step value) {
        println(i)
    }

    println("\n")

    for (i in 10 downTo 2 step 2) {
        println(i)
    }

    println("\n")

    for (i in 2 until 5) { // until = son karakteri dahil etmemek için kullanılır
        println(i)
    }

    println("\n")

    var i = 0
    while (i <= 10) { //her şekilde bir sefer çalışmayı sağlar
        println("while= $i")
        i +=2
    }
}