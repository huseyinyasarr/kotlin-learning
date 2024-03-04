package com.example.myapplication

import java.util.Scanner

fun main() {
    println("Yapacağınız işlemi seçiniz: \n1. Toplama \n2. Çıkarma \n3. Çarpma \n4. Bölme")
    val selectId = Scanner(System.`in`)
    val select = selectId.nextInt()

    when (select) {
        1 -> {
            println("Sayı 1= ")
            val number1In = Scanner(System.`in`)
            val number1 = number1In.nextDouble()

            println("Sayı 2= ")
            val number2In = Scanner(System.`in`)
            val number2 = number2In.nextDouble()

            val sum = number2 + number1
            println("Sonuç= $sum")
        }

        2 -> {
            println("Sayı 1= ")
            val number1In = Scanner(System.`in`)
            val number1 = number1In.nextDouble()

            println("Sayı 2= ")
            val number2In = Scanner(System.`in`)
            val number2 = number2In.nextDouble()

            val sum = number1 - number2
            println("Sonuç= $sum")
        }

        3 -> {
            println("Sayı 1= ")
            val number1In = Scanner(System.`in`)
            val number1 = number1In.nextDouble()

            println("Sayı 2= ")
            val number2In = Scanner(System.`in`)
            val number2 = number2In.nextDouble()

            val sum = number2 * number1
            println("Sonuç= $sum")
        }

        4 -> {
            println("Sayı 1= ")
            val number1In = Scanner(System.`in`)
            val number1 = number1In.nextDouble()

            println("Sayı 2= ")
            val number2In = Scanner(System.`in`)
            val number2 = number2In.nextDouble()

            if (number2 == 0.0) {
                println("Payda sıfır olamaz.")
            }

            else {
                val sum = number1 / number2
                println("Sonuç= $sum")
            }
        }

        else -> println("Yanlış Seçim Yaptınız")
    }
}