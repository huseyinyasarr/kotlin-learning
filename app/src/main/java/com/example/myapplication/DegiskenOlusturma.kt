package com.example.myapplication

fun main() {
    println("Merhaba Dünya")

    println("Merhaba Dünya Nasılsın")

    var yas = 25 //var = değişken atamak için belirteçtir. int, char gibi anlamlara gelir
    var yasim : Int = 25 // tür belirterek de değişken oluşturabiliyoruz.
    var isim = "Hüseyin"
    var harf = "a"
    println(isim)
    println(harf)
    println(yas)
    println(yasim)

    println("Benim adım $isim. $yasim yaşındayım.") //dolar işareti ile değişken kullanabiliyorum
    /*
    *Double = 64 bit
    * Float = 32
    * Long = 64
    * int = 32
    * Short = 16
    * Byte = 8
    */
    var yil = 2024
    var dogumYili = 1999

    var sayac = 0 //bir değişken oluşturduğun zaman içine değer vermek zorundasın

    println("Benim yaşım ${yil-dogumYili}'tir")

    var d = Deneme()
    d.topla()

    /*
    string'lerde
          \ işareti bırabilmek için \\ iki sefer yazmamız gerekmektedir.
          \t tab kadar boşluk bırakır
          \n new line
          \" çift tırnak kullanımı için
          \' tek tırnak kullanımı için
     */

    println("Bu işaretin / tersini \\ \n tab boşluğu \t ve çift tırnak \" tek tırnak \'")

    /*
    a +=3   a = a + 3
    a -=3   a = a - 3
    a *=3    a = a * 3
    a /=3

     */
}