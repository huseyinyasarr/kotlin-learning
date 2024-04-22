package com.example.myapplication

import java.util.Scanner

fun main() {
    var fruits = arrayOf("Muz", "Elma", "Armut", "Mandalina", "Portakal")

    for (i in 0 until  fruits.count()) {
        println("${i+1}. Meyve: ${fruits[i]}")
    }


}