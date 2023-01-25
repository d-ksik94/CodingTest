package com.ksik.codetest

/**
 * CodingTest
 * Created by ksik(river.h)
 * Date: 2023.01.25
 * Comment :
 * 기본적으로 Array<T> = 불변성 = invariance - 관계없음
 * Producers = covariance(공변) = out = ? extends E - 부모클래스 안에 자식클래스 대입가능
 * Consumers = contravariance(반공변) = in = ? super E - 자식클래스 안에 부모클래스 대입가능
 */

fun main(){
    invarianceTest()
    covarianceTest()
}

/**
 * 코틀린의 모든 제네릭은 기본적으로 불변이다.
 * 제네릭에서 형식인자들 끼리는 서브타입을 만족하더라도 에러가 발생한다.
 */
fun invarianceTest(){
    var river = Invariance<Int>()
    river.addAge(20)
//    var test : Invariance<Any> = river //error Type mismatch
    println("(불변성)invarianceTest.var test : Invariance<Any> = river >> error Type mismatch ")

    val a = "A"
    val b:Any = a
}
fun covarianceTest(){
    var river = River<Int>()
    river.addAge(30)
    var test : River<Any> = river // ok
    println("(공변) 부모에 자식 대입 covarianceTest : ${test.age}")

    var test4 = River<Any>()
    test4.addAge(40)
//    var river2 : River<Int> = test4  //error Type mismatch
    println("(공변) 자식에 부모 대입 > covarianceTest.var river2 : River<Int> = test4 >> error Type mismatch ")

    var bruce = Bruce<Int>()
//    var test2 : Bruce<Any> = bruce //error Type mismatch
    println("(반공변) 부모에 자식 대입 > contravariance.var test2 : Bruce<Any> = bruce >> error Type mismatch ")

    var test3 = Bruce<Any>()
    test3.addAge(35)
    var bruce2 : Bruce<Int> = test3
    println("(반공변) 자식에 부모 대입 >contravariance  :: ${bruce2.age}")
}
class Invariance<T>{
    var age =0
    fun addAge( age:Int){
        this.age = age
    }
}
class River<out T> {
    var age =0
    fun addAge( age:Int){
        this.age = age
    }
}
class Bruce<in T>{
    var age =0
    fun addAge( age:Int){
        this.age = age
    }
}
