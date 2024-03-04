package com.example.myapplication

import java.util.Scanner

fun main() {
    println("Hangi Ders?")
    val selectLession = Scanner(System.`in`)
    val lession = selectLession.nextInt()

    when(lession) {
        1 -> println("Günün 1. dersi Yapay Zeka'dır")
        2 -> println("Günün 2. dersi Sistem Programlama'dır")
        3 -> println("Günün 3. dersi Proje Yönetimi'dir")
        else -> println("Bugün yalnızca 3 dersin bulunmaktadır.")
    }
}