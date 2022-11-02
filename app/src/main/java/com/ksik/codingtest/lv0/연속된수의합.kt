package com.ksik.codingtest.lv0

//https://school.programmers.co.kr/learn/courses/30/lessons/120923
fun main() {
    val num =100
    val total = 1000
    val result = solution(num, total)
    println("result :: ${result.contentToString()}")
    println("result2 :: ${result.reduce { acc, i -> acc+i }}")
}

fun solution(num: Int, total: Int): IntArray {
    println("aa :: ${(total / num - (num - 1) / 2)}")
    return (total / num - (num - 1) / 2).let { t ->
        IntArray(num) { index ->
            println("cc :: ${index}")
            println("dd :: ${index + t}")
            index + t
        }
    }
}

/*fun solution(num: Int, total: Int): IntArray {
    val numRange = total.unaryMinus()..total
    val numArray = numRange.toCollection(mutableListOf<Int>())

    var answer: IntArray = IntArray(num)
    var pointer = 0
    while(true){
        var answerTotal = 0
        for(i in answer.indices){
            if(pointer+i < numArray.size){
                answer[i] = numArray[pointer+i]
            }
        }
        answerTotal = answer.reduce { acc, i ->acc+i}
        if (answerTotal== total) break
        else pointer++
    }

    return answer
}*/
