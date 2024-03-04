package com.example.myapplication

import java.util.Scanner

fun main() {

    println("Alan Hesaplama\nDikdörtgen için 1'e basınız.\nDaire için 2'ye basınız.")
    val selectIn = Scanner(System.`in`)
    val select = selectIn.nextInt()

    if (select == 1) {
        println("Kısa kenarı giriniz:")
        val shortEdgeInput = Scanner(System.`in`)
        val shortEdge = shortEdgeInput.nextDouble()

        println("Uzun kenarı giriniz:")
        val longEdgeInput = Scanner(System.`in`)
        val longEdge = longEdgeInput.nextDouble()

        val area = longEdge * shortEdge

        println("Karenin alanı $area")
    }

    else if (select == 2) {
        println("Yarıçapı giriniz")
        val radiusInput = Scanner(System.`in`)
        val radius = radiusInput.nextDouble()

        val area = 3.14 * radius * radius

        println("Dairenin alanı $area")
    }

    else println("Hatalı Giriş")

}