package com.ksik.codingtest.lv0

/*
* 문제 설명
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

제한사항
2 < common의 길이 < 1,000
-1,000 < common의 원소 < 2,000
등차수열 혹은 등비수열이 아닌 경우는 없습니다.
공비가 0인 경우는 없습니다.
입출력 예
common	result
[1, 2, 3, 4]	5
[2, 4, 8]	16
입출력 예 설명
입출력 예 #1

[1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
입출력 예 #2

[2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.*/
//프로그래머스 다음에 올 숫자
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