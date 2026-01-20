

fun demo(x:Int){
    if(x !is Int){
        println("x is 1")
        return

    }else{
        println("Not One")
    }
}







class Yellow{



}
class Red{


}

class Green{


}


fun a1(x:Any){



  when(x){

    }




}






fun test(x:Any){
    //Manuly cast
    if(x is Red){ //x is Automaticaly cast to Red
        println("Stop")
    } else if(x is Green){
        println("Goo")
    }else if(x is Yellow){
        println("Get Ready")
    }
}



fun GetGrades(score:Int):String{

   return when{
       score>=35->"C"
       score>=50->"B"
       score>=70->"A"
       else->"Failed"
   }




}








fun main() {

//    //Normal
//    for (i in 1..10 step 2){
//        println(i)
//    }

    //reverse
    var Count:Int=0
    for (i in 10 downTo 1){
       Count+=i;
    }
    println(Count)

    //Assignment
    // 10 to 1
    // Even
    //odd
    //sum of even 1 to 10
    //sum of odd 1 to 10







// * * * *
// * * * *
// * * * *




    //*
    //* *
    //* * *
    //* * * *

    //Inverted
    // * * * *
    // * * *
    // * *
    // *


//            *
//          * * *
//        * * * * *
//      * * * * * * *
//
//



    //Outer Nrows
for (i in 4 downTo 1){

    for ( j in 1..i){
        print("*")
    }
    println()
}




//while loop

    var i:Int=1

    while (i<=10){
        println(i)
        i++
    }

    //kaam
    var j:Int =1
    do {
        println("Hellow world")
        j++;
    }while (j<=10)


























}