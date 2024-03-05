package com.example.myapplication

import androidx.core.content.contentValuesOf

fun main() {
    val fruits = arrayOf("Elma", "Armut", "Muz") //dizi oluşturur
    val fruits2 = arrayOf <String>("Kiraz", "Vişne", "Mandalina") //türünü belirterek de dizi oluşturabiliriz

    val numbers = arrayOf(61, 16, 5)
    val numbersAndString = arrayOf(1, "Deneme") // farklı tiplerdeki değerler aynı dizilerde tutulabilir

    println(numbers.contentToString())
    println(fruits.contentToString()) //array'leri yazdırmak için kullanılır

    println(fruits[2]) //index'i 2 olanı yazdırır
    println(fruits2.get(1)) //üstteki ile aynı sadece farklı bir yöntem

    fruits2[2] = "Karpuz"
    println(fruits2[2])

    fruits2.set(1,"Portakal") //farklı yöntem
    println(fruits2[1])

    println(numbers.isEmpty()) //numbers dizisi boş mu? sorusunun cevabını döner

    println(fruits.count()) //dizi eleman sayısını söyler

    println(fruits.first()) //ilk elemanı yazdırır

    println(fruits.last()) //son elemanı yazdırır

    println(fruits.indexOf("Elma")) //elma kaçıncı index'te

    println(fruits.contains("Muz")) //içinde muz var mı? sorusunun cevabı

    println(fruits.max()) //en büyük elemanı yazdırır

    println(fruits2.min()) //en küçük elemanı yazdırır

    println(fruits.sort()) //sıralama yapar ancak yazdırmaz
    println(fruits.contentToString()) //sıralanmış halini yazar

    println(fruits2.reverse()) //ters çevirir ancak yazdırmaz
    println(fruits2.contentToString())

    


    println()



}