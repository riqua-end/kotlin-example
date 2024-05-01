package org.example.ex07

fun main(){

    val user = User()

    user.name="홍길동"
    user.age=10
    user.email="gmail"

    val user2 = user.copy(name = "이순신") // named arguments

    val user3 = User( // kotlin fill class plugin 사용해서 에러 줄이기
        name = "유관순",
        age = 30,
        email = "gmail.com"
    )

    println(user)
    println(user2)
}
