package com.example.myapplication

import java.util.Scanner

fun main() {
    println("Vize notunu gir:")
    val inputNote1 = Scanner(System.`in`)
    val note1 = inputNote1.nextInt()

    println("Final notunu gir")
    val inputNote2 = Scanner(System.`in`)
    val note2 = inputNote2.nextInt()

    val avarage:Double = note1*0.4 + note2*0.6

    if (avarage >= 0 && avarage < 50 || note2 < 50) {
        println("Dersi Geçemedin")
    }
    else if (avarage >= 50 && avarage < 60 && note2 >=50) {
        println("Şartlı Geçtin")
    }
    else if (avarage >= 60 && note2 >= 60) {
        println("Başarılı")
    }
    else {
        println("Hatalı giriş")
    }



}