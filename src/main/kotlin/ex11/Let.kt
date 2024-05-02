package org.example.ex11

import java.time.LocalDateTime

fun main() {

    // let 함수 , null 방지
    val now = LocalDateTime.now()

    val localDateTime: LocalDateTime?=null

    val kst = now?.let { localDateTime: LocalDateTime->
        println("let scope $localDateTime")
        "let scope" // 가장 마지막 라인이 return
    }?: LocalDateTime.now()

    println("result $kst")

    UserDto(name = "홍길동").let {
        logic(it)
    }

    val userDtoList = listOf(UserDto("홍길동"), UserDto("유관순"))

    val responseList = userDtoList.stream()
        .map { it ->
            UserResponse(
                userName = it.name
            )
        }.toList()

    println(responseList)
}

// let 은 모든 객체에서 사용가능 , map 은 컬렉션에서 사용
fun logic(userDto: UserDto?) : UserResponse? {

    val response = userDto?.let {userDto ->
        println("dto $userDto")

        UserEntity(
            name = userDto.name
        )
    }?.let {
        println("entity $it")

        UserResponse(
            userName = it.name
        )
    }

    return response
}

data class UserDto(
    var name: String?=null,
)

data class UserEntity(
    var name: String?=null,
)

data class UserResponse(
    var userName: String?=null,
)