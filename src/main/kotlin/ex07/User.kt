package org.example.ex07

data class User( // data 키워드를 붙여주면 toString,hashcode,equals 까지 만들어줌
    var name: String?=null,
    var age: Int?=null,
    var email: String?=null,
) {
    /*override fun toString(): String {
        return "User(name=$name, age=$age, email=$email)"
    }*/
}