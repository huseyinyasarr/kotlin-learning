package com.example.myapplication

fun main() {
    var number2 = 2
    var out2:Float = number2.toFloat()

    var number3 = 6.1
    var out3:Int = number3.toInt()

    val id = "61OF61"

    println("$number2,\n$number3")

    /*
    toDouble()
    toFloat()
    toLong()
    toInt()
    toShort()
    toByte()
    toChar()
    toString()
    */

    /*
    string'ten integer'e dönüştürürken arada char olabileceğinden hata almamak için aşağıdaki gibi bir yöntem kullanıyoruz

    var str = "48T"
    val number = str.toIntOrNull()

    if (number != null) {
        //hata yok, yapılacak işlemler yazılabilir
    }else {
        //hata
    }
    */

    val idControl = id.toIntOrNull()

    if (idControl != null) {
        println(idControl)
    }
    else {
        println("DÖNÜŞÜMDE HATA VAR")
    }


}