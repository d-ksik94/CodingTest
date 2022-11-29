package com.ksik.codetest

fun main(){
    /*let ex*/
    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first().let { firstItem ->
        println("The first item of the list is '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()
    println("First item after modifications: '$modifiedFirstItem'")

    /*with ex*/
    with(numbers) {
        println("'with' is called with argument $this")
        println("It contains $size elements")
    }

    /*run ex 일반 함수처럼 실행가능. */
    val hexNumberRegex = run {
        val digits = "0-9"
        val hexDigits = "A-Fa-f"
        val sign = "+-"

        Regex("[$sign]?[$digits$hexDigits]+")
    }

    for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
        println(match.value)
    }

    /*apply ex*/
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)

    /*also ex*/
    val numbers2 = mutableListOf("one", "two", "three")
    numbers2
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    /*takeIf takeUnless ex*/
    displaySubstringPosition("010000011", "11")
    displaySubstringPosition("010000011", "12")
}
class Person(private val name:String){
    var age:Int = 0
    var city:String =""
}
fun displaySubstringPosition(input: String, sub: String) {
    input.indexOf(sub).takeIf { it >= 0 }?.let {
        println("The substring $sub is found in $input.")
        println("Its start position is $it.")
    }
}