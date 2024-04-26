package org.example.ex06

fun main(){
    val dog = Dog("해피") // new 없이 생성자 호출

    println(dog.age) // 초기값 0

    dog.age = 20

    println(dog.age) // 20

    dog.bark()
    dog.eat()
    dog.hi()
}

interface Bark {
    fun bark()
}

interface Temp{
    fun hi()
}

abstract class Animal(private val name:String?="") : Bark{
    // body
    fun eat(){
        println("$name 식사 시작 합니다.")
    }
}

class Dog(private val name: String?=null,var age:Int?=0) : Animal(name),Temp{ // 다중 상속

    /*  Default get , set

    *   var age: Int?=0
    *       get() = field
    *       set(value) {field = value}
    * */
    override fun bark() {
        println("$name : 멍멍")
    }

    override fun hi() {
        println("hi")
    }
}