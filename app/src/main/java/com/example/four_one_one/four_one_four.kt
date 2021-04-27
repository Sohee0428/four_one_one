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