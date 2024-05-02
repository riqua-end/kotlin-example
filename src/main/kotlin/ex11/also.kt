package org.example.ex11

fun main() {
    // also / 또한
    // let 하고 차이점은 also 는 내가 넘겨 받은 객체가 그대로 리턴됨

    val userDto = UserDto(
        name = "홍길동"
    ).also { dto: UserDto ->    // 내가 받았던 파라미터 자체가 return
        println(dto)

        /*UserDto( // 외부에는 리턴되지 않음
            name = "유관순"
        )*/
        dto.name="유관순" // 이렇게 setter 를 통해 return 값을 변경
    }

    println("result $userDto")

}