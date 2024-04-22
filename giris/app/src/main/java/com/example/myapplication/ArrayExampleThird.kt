package com.example.myapplication

import java.util.Scanner

fun main() {
    val lessonSize = 3
    val lessons = Array<String>(size = lessonSize){""}
    val notes = Array<Int>(size = lessonSize){0}

    val input = Scanner(System.`in`)
    //val inputNotes = Scanner(System.`in`)
    var sum = 0

    for (i in 0 until lessons.count()) {
        println("${i+1}. Dersin adını giriniz: ")
        val inputLessons = input.next()
        lessons[i] = inputLessons

        for (j in 0 until 1) {
            println("${lessons[i]} dersinin notunu giriniz: ")
            val inputNotes = input.nextInt()
            notes[i] = inputNotes
        }
    }

    for (i in 0 until notes.count())
        sum += notes[i]


    for (i in 0 until lessons.count()) {
        println("${lessons[i]}: ${notes[i]}")
    }

    val avvarage = sum * 1.0 / lessonSize
    println("Ders notu ortalaman= $avvarage")

    if (avvarage < 50)
        println("Kaldınız")

    else
        println("Geçtiniz")
}