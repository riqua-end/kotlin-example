package org.example.ex02

import java.util.Optional

fun main(){

    val a: Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d)
    callFunction() // 코틀린은 자바랑 다르게 null 값이 넘어 올 수 있음
}
// ? = 엘비스 연산자, null 이 올수도 있다
fun callFunction(i:Int? = 100){ // 이런식으로 디폴트 값을 줄 수 있음
    // 변수? << 변수가 null?
    // 변수?. << 변수가 null 이 아닐때
    // 변수?: << 변수가 null 일 때

    //val temp = if (i == null) "null 값 입니다." else i
    //val temp = i?: "null 값 입니다."
    val temp = i?.let { it * 20 } ?: "null 값 입니다."
    println(temp)

    /*i?.let {
        println(it)
    } ?: run {
        println("null 값 입니다.")
    }*/

}
