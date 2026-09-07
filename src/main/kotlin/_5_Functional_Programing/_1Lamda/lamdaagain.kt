package _5_Functional_Programing._1Lamda

import javax.print.DocFlavor.STRING

fun main(){
    greet()
    say()
    greet("Good Morning")
    lamdaGreet("Good Evening")
    add1(10,20)
    add2(1,2)
    var result=sub(10,20)
    println("Result of the Subtractions $result")
    result= sub2(100,20)
    println("sub2 :: $result")
    doSomething()
    sayHelloTo("Rahul")
    val aman=takeCofee("Medium")
    println(aman)
    val largest= findThelargest(100,20)
    println("The largest element is $largest")
    val avgTwo= calAvg(10,20)
    println(avgTwo)
}


//here we have a normal function which has a name
fun greet(){
    print("Good Morning...")
}

//we aslo have a function which dosent have any Name

val say ={ //this is called as Lamda with No parameter
    println("Good Morning From Lamda")
}



fun greet(msg:String){
    println("$msg :: from named greet Function")
}


//Lamda version of the above
val lamdaGreet={msg:String->
    println("$msg from lamdaGreet")
}

//Lamda function with 2 paramert no return type


fun add1(a:Int,b:Int){
    println(a+b)
}


val add2={a:Int,b:Int->
    println(a+b)
}


val sub={a:Int,b:Int->
    b-a
}

//we can aslo explic mention its Type Like

val sub2:(a:Int,b:Int)->Int={x,y->
    x-y
}


//Revised Version

val doSomething={
    println("Doing something")
}

val sayHelloTo={name:String->
    println("Hey $name")
}


val takeCofee={qty:String->
    println("Printing some Random Words")
    "Here is Your $qty Coffee"
}


val findThelargest={a:Int,b:Int->
    a.coerceAtLeast(b)
}

//we can Aslo specify the types Explicitely Like
//which is very imp to Understand for Hgher order fun



val calAvg:(Int,Int)->Int={a,b->
    a+b/2
}



val multi={a:Int,b:Int->
    a+b*0.3
}


val multi2:(Int,Int)->Int={a,b->
    a*b
}