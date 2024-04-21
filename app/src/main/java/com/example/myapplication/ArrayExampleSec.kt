package com.example.myapplication

import java.util.Scanner

fun main() {
    val names = Array<String>(size = 5){""}
    val input = Scanner(System.`in`)

    for (i in 0 until names.count()) {
        println("${i+1}. İsmi gir: ")
        val inputName = input.next()
        names[i] = inputName
    }



    for (i in 0 until names.count()) {
        println("${i+1}. İsim: ${names[i]}")
    }

}