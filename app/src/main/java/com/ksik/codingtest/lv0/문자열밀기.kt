package com.ksik.codingtest.lv0

//https://school.programmers.co.kr/learn/courses/30/lessons/120921
fun main(){
    val a = "hello"
    val b = "ohell"
    println("result :: ${문자열밀기solution(a,b)}")
}
fun 문자열밀기solution(A: String, B: String): Int{
//    ohellohell
    return (B+B).indexOf(A) // 문자열이 시작되는 char위치를 반환한다. 없으면 -1
}