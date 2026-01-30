package _5_Functional_Programing

/*
 Here we will Dicuss About the Lamda functions
 1.Lamda Functions are aslo Known as One liner Functions
 2.which can we treated as an Exprssion (Output we store in variable)
 3.Pass as an Argument to Another function and aslo can be Returned


*/


/*
----------------------------------------------------------
Lets start with basic Questions
-------------------------------------------------------
 */


//Write a Lamda that Print Hellow world

fun main() {

    println(sum(10,20))
    println(s1(1,2))
    println(square(2))
    println(sb(10,2))
    println("Multiplication"+ multiply(2,3))
    println("Avg is "+ calAvg(10,2,5))
    println(greet1("Good Evening"))
    var name ="John"
    println(name)

}

val sum={a:Int,b:Int->a+b}
val s1: (a:Int,b:Int) -> Int = { a, b ->a+b }
var square:(a:Int) -> Int={it*it}
//Basic Arithmatic Operations
var sb:(Int,Int)->Int={a,b->a-b}
var div: (Int, Int) -> Int ={ x, y->x/y}
var multiply:(Int,Int)->Int={x,y->x*y}
var calAvg:(Int,Int,Int)->Int={a,b,c->(a+b+c)/3}

var x_2:(a:Int)->Int={it-2}

//with type defind
var greet={name:String->"Good Morning"}

var greet1:(String)->String={"greet is $it"}















var name={ print("John") }








