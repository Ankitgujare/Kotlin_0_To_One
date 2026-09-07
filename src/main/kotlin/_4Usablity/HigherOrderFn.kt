package _4Usablity

import _5_Functional_Programing._1Lamda.multi

fun main() {

    val sum= calculate(10,20){x,y->
        x+y
    }

    println("Sum of two Number is $sum")


    val sub= calculate(20,10){a,b->
        a-b
    }
    println("Substraction of two Number is $sub")


    val div= calculate(10,2){a,b->
        a/b
    }
    println("Div of two Number os $div")


    val mutli= calculate(5,4){a,b->
        a*b
    }
    println("Multiplication of Two number $mutli")


    val largest= calculate(100,20){a,b->
        Math.max(a,b)
    }

    println("Largest is $largest")


    val n1= greet("Good Morning"){msg->
        msg
    }


    println(n1)
}



fun calculate(
    a:Int,b:Int,
    operation:(Int,Int)->Int
):Int{
   return operation(a,b)
}



fun greet(
    msg:String,
    action:(String)->String
):String{
    return action(msg)
}



val operation:(Int,Int)->Int={x,y->
    x+y
}
