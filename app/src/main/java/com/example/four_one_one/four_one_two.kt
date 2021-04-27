package com.example.four_one_one


// 최상위 레벨
val topData1: Int
var topData2: Int


// 클래스의 멤버 변수
class User {
    val objData1: String
    var objData2: String


//    함수 내부의 지역 변수
    fun some() {
        val localData1: Int
        var localData2: String

        println(lacalData1)

        localData2 = "hello"
        println(localData2)
    }
}