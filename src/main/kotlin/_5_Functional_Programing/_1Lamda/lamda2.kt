package _5_Functional_Programing._1Lamda

fun main(){
    println(add(10,20))
    println(square(12))
    println(square1(2))
    greet()

//    here we will call the calcualtion
    var result=calculation(10,20,{x,y->x+y})
    println(result)

    //If the Ladma is the Last parameter of the you can use it Like
    result= calculation(2,4){a,b->a*b}
    println(result)


    var Ans=demo{it->
        it*2
    }

    Button{
        println("Good Morning")
    }



}


fun add(a:Int,b:Int):Int{
    return a+b
}
//how we defind the Lamda function
    val add={a:Int,b:Int->a+b}
    val add1:(Int,Int)->Int={a,b->a+b}
    val square:(Int)->Int={it->it*it}
    val square1={a:Int->a*a}



//Lamda with No Parameter

val greet={ println("Good Morning!")}

//we can aslo pass lamda as a parameter to Other function

fun calculation(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}


//CallBack Example

fun demo(callback:(Int)->Int){
    println("Doing Work")
    val x= callback(2)
    println(x)

}

fun Button(onclick:()->Unit){
    println("Doing some work.... In Button")
    onclick()
}