package org.example.ex11

fun main() {
    // apply , 생성자 패턴에서 많이 쓰임

    val userDto = UserDto().apply { // 이름 지정 불가
        /*this.name="홍길동"
        name="홍길동"*/
        name = "홍길동"
        /*this.myUserDto()*/
    }

    UserDto(
        name = null
    )

    println(userDto)

}

/*
fun UserDto.myUserDto(){
    println(this.name)
}*/
