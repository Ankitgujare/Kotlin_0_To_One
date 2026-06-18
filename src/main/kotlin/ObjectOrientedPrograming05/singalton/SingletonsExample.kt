package ObjectOrientedPrograming05.singalton

import _5_Functional_Programing._1Lamda.calculation

fun main(){
    Counter.increment()
    Counter.getCurrentCount()
    Counter.increment()
    Counter.getCurrentCount()
    Counter.decrement()
    Counter.getCurrentCount()
    Counter.reset()
    Counter.getCurrentCount()


    val x=Calculator()
    Calculator.demo.test()


    Dog.eat()
    Dog.sound()

    Cat.eat()
    Cat.sound()
}

object Counter{
    var count:Int=0
    fun increment()=++count

    fun  decrement()=--count

    fun getCurrentCount(){
        println("Current Count is $count")
    }

    fun reset(){
        println("Counter is reset Successfuly")
        count=0
    }
}


class Calculator{

    object demo{
        fun test(){
            println("in Singleton")
        }
    }


}

//todo You cannot have Singleton inside a function
/*
fun check(){
    object demo(){

    }

}*/


//todo you can aslo do inheritance via singletons

    interface Animal{
        fun eat()
        fun sound()
    }



object Dog:Animal{
    override fun eat() {
        println("Dog is Eating food")
    }

    override fun sound() {
        println("Bhooowww")
    }

}

val Cat=object:Animal{
    override fun eat() {
        println("Cat is eating Fish")
    }

    override fun sound() {
        println("Cat is Playing with Mouse")
    }
}




fun demo(){


var roll=101
var name="Ankit"


var n=100
}








