package _4Usablity

import ObjectOrientedPrograming05.intern
import _5_Functional_Programing._1Lamda.multi

fun main() {


   val sum= calculate(10,20){a,b->
        a+b
    }
    println(sum )


    val multi:(Int,Int)->Int={a,b->
        a*b
    }

    val ans= calculate(10,20,multi)
    println("Ans of Multiply is $ans")






    val n1= greet("Good Morning"){msg->
        msg
    }


    println(n1)

    val result4= calculate(30,30,::add)
    println("result 4 $result4")

    val result5= calculate(100,20,::sub)
    println("result5 $result5")


}






fun greet(
    msg:String,
    action:(String)->String
):String{
    return action(msg)
}




fun calculate(
    a:Int,b:Int,
    operation:(Int,Int)->Int      //Operation=add(Int,Int)
):Int{
    return operation(a,b)
}


fun add(a:Int,b:Int):Int{
    return a+b
}


fun sub(a:Int,b:Int):Int{
    return a-b
}