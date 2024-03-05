package com.example.myapplication

import java.util.Scanner

fun main() {

    println("İlk sayı kaç olsun")
    val inputFirstValue = Scanner(System.`in`)
    val firstValue = inputFirstValue.nextInt()

    println("Kaçar kaçar atlasın")
    val inputStep = Scanner(System.`in`)
    val step = inputStep.nextInt()

    println("Son sayı kaç olsun")
    val inputLastValue = Scanner(System.`in`)
    val lastValue = inputLastValue.nextInt()

    for (i in firstValue..lastValue step step) {

        if ( i == 5) { //döngü kırılır ve for'dan çıkılır
            break
        }
        if ( i == 6) { //bundan sonra herhangi bir işlem yapmadan döngünün başına döner
            continue
        }
        
        println(i)
    }
}