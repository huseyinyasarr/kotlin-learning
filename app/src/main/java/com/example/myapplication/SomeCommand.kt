package com.example.myapplication

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(0,10) // 0 (dahil) ile 10 arasında (dahil değil) sayı oluşturur
    println("Rastgele rakam: $randomNumber")

    val roundUp = ceil(6.5) // yukarı yuvarlamak
    println("Yukarı yuvarlanan sayı: $roundUp")

    val roundDown = floor(6.5) // aşağı yuvarlamak
    println("Aşağı yuvarlanan sayı: $roundDown")

    val square = sqrt(16.0)
    println("Karekökü: $square")

    val absoluteValue = abs(-61)
    println("Mutlak değer: $absoluteValue")

    val maximumValue = max(100, 200) //girilen değerler arasındaki en yüksek değeri bulur
    val minimumValue = min(100, 200) //girilen değerler arasındaki en düşük değeri bulur
    println("Maximum Değer: $maximumValue\nMinimum Değer: $minimumValue")

    val exponentialNumber = 3.0.pow(2.0) //3 üzeri 2
    println("Üslü sayı: $exponentialNumber")

}