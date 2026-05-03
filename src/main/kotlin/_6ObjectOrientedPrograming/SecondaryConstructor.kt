package _6ObjectOrientedPrograming


fun main() {

    //create an Obejct with primary constructor
    val p1=Person("Rohan")
    val p2=Person("Sahil",12)
    val p3=Person("Aniket",12,"Male")



}

class Person(val name:String){


    fun getname():String=name


    //secondary Constructor
    constructor(name:String,age:Int):this(name){
        println("Secondary Constructor #1")
        println("Name is $name")
        println("age is $age")
    }


    constructor(name:String,age:Int,gender:String):this(name){
        println("Secondary Constructor #2")
        println("Name is $name")
        println("age is $age")
        println("gender is $gender")
    }



}