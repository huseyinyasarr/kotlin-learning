package com.example.myapplication

import java.util.Scanner


fun main() {
    var title:String=""

    println("Ad:")
    val inputName = Scanner(System.`in`) //kullanıcıdan girdi alınması sağlanır. Sadece girilen ilk kelimeyi alır.
    val name = inputName.next() //girilen string değerin kaydedilmesi için bu kısımda bekler. Enter'a basıldığı zaman girilen değer isim'e eklenir

    println("Yaş")
    val inputAge = Scanner(System.`in`)
    val age = inputAge.nextInt()

    if (age > 24) {
        title = "Abi"
    }
    else {
        title = "Kardeşim"
    }

    println("Hoşgeldin $name $title")
}