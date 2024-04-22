package com.example.myapplication

import java.util.Scanner

fun main() {
    val i = 1
    while (i ==1) {
        print("Sayı gir: ")
        var inputNumber = Scanner(System.`in`)
        var number = inputNumber.nextInt()

        if (number % 2 == 0) {
            println("Girilen Sayı Çifttir")
        } else {
            println("Girilen Sayı Tektir")
        }

        println("\n")
        println("Tekrar Değer Girmek için 1'e basınız \nÇıkmak için 2'ye basınız")
        val inputİ = Scanner(System.`in`)
        val i = inputİ.nextInt()

        if (i==1) {
            continue
        }
        else break

    }

}