package com.ksik.codingtest.lv0

import kotlin.math.ceil

/*
https://school.programmers.co.kr/learn/courses/30/lessons/120913
* */

fun main(){
    val myStr = "abc1Addfggg4556babc1Addfggg4556babc1Addfggg4556babc1Addfggg4556babc1Addfggg4556babc1Addfggg4556b"
    val n = 5
    println("result :: ${잘라서배열로저장하기solution(myStr,n).contentToString()}")
}
//임포트안받고
fun 잘라서배열로저장하기solution(my_str: String, n: Int): Array<String> {
    val strLength = my_str.length
    val arrSize :Int = if(strLength % n ==0)strLength / n else strLength / n+1
    var answer: Array<String> = Array(arrSize){""}
    for ((cnt, i) in (0 until strLength step (n)).withIndex()){
        if(i+n<=strLength-1) answer[cnt] = my_str.substring(i,i+n)
        else answer[cnt] = my_str.substring(i,strLength)
    }
    return answer
}
/* // 임포트받고함.
fun 잘라서배열로저장하기solution(my_str: String, n: Int): Array<String> {
    val arrSize :Int = ceil(my_str.length / n.toFloat()).toInt()
    var answer: Array<String> = Array(arrSize){
        if(it*n+n<my_str.length) {
            my_str.substring(it * n, it * n + n)
        }else my_str.substring(it * n,my_str.length)
    }
    return answer
}*/
