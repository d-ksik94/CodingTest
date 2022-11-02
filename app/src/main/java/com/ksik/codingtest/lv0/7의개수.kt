package com.ksik.codingtest.lv0

//https://school.programmers.co.kr/learn/courses/30/lessons/120912

fun main(){
    val array = intArrayOf(7, 77, 17)
    println("result :: ${sevensNumberSolution(array)}")
}
//7의개수
fun sevensNumberSolution(array: IntArray): Int {
    var answer: Int = 0
    answer = array.contentToString().count { it.toString() == "7" }
    return answer
}