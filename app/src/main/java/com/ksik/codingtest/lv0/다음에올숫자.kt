package com.ksik.codingtest.lv0

//프로그래머스 다음에 올 숫자 https://school.programmers.co.kr/learn/courses/30/lessons/120924
fun main(){
    val common = intArrayOf(2, 4, 8)
//    val common = intArrayOf(1, 2, 3, 4)
    println("result :: ${solution(common)}")
}
    fun solution(common: IntArray): Int {
        var answer: Int = 0
        if(common[0]-common[1] == common[1]- common[2]){//등차
            answer = common.last()+(common[1]-common[0])
        }else{
            answer = common.last() * (common[1]/common[0])
        }
        return answer
    }