package com.example.four_one_one

var myBool = false
val myVal: String = "hello"
    get() {
        if (myBool)
            return field
        else
            return field.toUpperCase()
    }

fun main() {
    print(myVal)
    myBool = true
    print(myVal)
}



//const이용

const val myConst: Int = 10
const var myConst2: Int = 10

class MyClass {
    const val myConst3 = 30
}
fun some(){
    const val myConst4 = 40
}