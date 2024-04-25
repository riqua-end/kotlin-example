package org.example.ex01

fun main(){

    // var = mutable (가변) , val = final,immutable (불변)

    // : [타입]
    val name: String = "홍길동"
    var _name: String = "홍길동"

    val result = "사용자의 이름은 : $name"
    println(result)

    val n = "홍길동" // 타입 추론으로 생략 가능

    // 코틀린은 레퍼런스 타입, 프리미티브 타입이 없음 따라서 int , Integer 구분이 없음
    // 모든것은 객체로 관리
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0
    var _d: Double

    var f:Float = 10f

    var b:Boolean = true

}