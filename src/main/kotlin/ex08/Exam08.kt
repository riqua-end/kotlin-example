package org.example.ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){

    Exam08(Store())

    var now = LocalDateTime.now()
    println(DateTimeUtil().localDateTimeToString(now))
}

data class Store(
    var registerAt: LocalDateTime?= null,
)

class Exam08(store: Store) {
    init { // constructor(store: Store)
        val strLocalDateTime = toLocalDateTimeString(store.registerAt)
        println(strLocalDateTime) // null 값이 들어오므로 LocalDateTime.now() 실행
        println(toLocalDateTimeString()) // 디폴트 값으로 2022,02,02 실행
    }

    fun toLocalDateTimeString(localDateTime: LocalDateTime? = LocalDateTime.of(2022,2,2,13,0,0)) : String {

        val temp = localDateTime ?: LocalDateTime.now() // if else 없이 한 문장으로

//        return localDateTime?.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil{

    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(localDateTime: LocalDateTime? = LocalDateTime.now(), pattern: String?= KST_FORMAT) : String {
        return (localDateTime?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(pattern))
    }
}