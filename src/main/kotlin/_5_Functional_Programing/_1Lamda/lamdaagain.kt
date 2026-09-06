package _5_Functional_Programing._1Lamda

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