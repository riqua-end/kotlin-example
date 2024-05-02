package org.example.ex11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    // run , apply 와 비슷한 구조이나 let 함수와 기능이 같다
    // 지역 scope

    val userDto = UserDto("").run {
        name = "홍길동"
        "empty" // 마지막 라인이 return
    }

    println("result $userDto")

    val x = 10

    val sum = run {
        val x = 2
        val y = 3
        x + y
    }

    println("result $sum")

    val now: LocalDateTime?=null

    val n = now ?: LocalDateTime.now()

    val d = n?.let{
        val minusTime = it.minusDays(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }?:run { // scope 우선 실행
        val now = LocalDateTime.now()
        val minusTime = now.minusDays(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }

    println("result $d")
}
