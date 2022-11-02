package com.ksik.codingtest.lv0
//https://school.programmers.co.kr/learn/courses/30/lessons/120922
fun main(){
    val m = 1
    val n = 1

//    2	5
//    1	1
    println("result :: ${종이자르기solution(m,n)}")
}

fun 종이자르기solution(M: Int, N: Int): Int {
    //사각형의 넓이는 M*N
    //여기서 1,1은 자를필요가 없으므로 -1
    return (M*N-1)
}