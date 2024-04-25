package org.example.ex05

import java.util.function.Predicate

fun main(){

    var numberList = listOf<Int>(1,2,3,4,5)

    // kotlin 에서 익명클래스를 만들 때 object 키워드를 사용
    /*val pred = object : Predicate<Int> {
        override fun test(t: Int): Boolean {
            return t % 2 == 0
        }
    }*/
    // 람다식으로 표현
    val pred = Predicate<Int> { t -> t % 2 == 0 }


    //numberList.filter { it -> it % 2 == 0 }
    numberList.stream().filter(pred)

    val add = { x: Int, y: Int -> x+y }

    val _add = fun(x: Int, y: Int): Int{
        return x+y;
    }

    //println(add.invoke(2,3))
    println(add(2,3))
    println(_add(3,4))

    lambda(4,5, _add)
}

fun lambda(x:Int , y:Int, method: (Int, Int) -> Int){
    println(method(x,y))
}