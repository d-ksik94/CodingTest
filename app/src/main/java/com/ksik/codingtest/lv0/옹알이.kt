package com.ksik.codingtest.lv0

// https://school.programmers.co.kr/learn/courses/30/lessons/120956
fun main(){
    val babbling = arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
    println("result :: ${Solution().solution(babbling)}")
}
class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        val word = arrayOf("aya","ye","woo","ma")
        for(i in babbling){
            var temp = i
            var cnt = 1
            while (cnt <= 4){
                for (n in word){
                    if(i.contains(n)) temp = temp.replace(n,".")
                }
                cnt ++
            }
            if(temp == "." || temp == ".." ||temp == "..." ||temp == "....") answer ++
        }
        return answer
    }
}