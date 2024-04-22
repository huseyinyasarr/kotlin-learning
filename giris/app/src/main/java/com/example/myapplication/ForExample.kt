package com.example.myapplication

import java.util.Scanner

fun main() {
    println("Adınızı Giriniz")
    val inputName = Scanner(System.`in`)
    val name = inputName.next()

    println("Tekrar sayısı giriniz")
    val inputRepeat = Scanner(System.`in`)
    val repeat = inputRepeat.nextInt()

    for (i in 0 until repeat) {
        println("${i+1}. $name")
    }

    println("İlk Sayı:")
    val inputFirstValue = Scanner(System.`in`)
    val firstValue = inputFirstValue.nextInt()

    println("Son Sayı:")
    val inputLastValue = Scanner(System.`in`)
    val lastValue = inputLastValue.nextInt()

    println("Kaçar Kaçar Saysın?")
    val inputStep = Scanner(System.`in`)
    val step = inputStep.nextInt()
    println("\n")

    for (i in firstValue..lastValue step step) {
        println(i)
    }

}