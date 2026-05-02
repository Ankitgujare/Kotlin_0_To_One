package _5_Functional_Programing.List

import _5_Functional_Programing.sum

fun main() {

    //Two type of List
    //1. List->Read Only
    var num= listOf(1,2,3,4,5)


    //we cannot add,remove or update in a List ->Read Only
   // num[0]=100


    //Filter ->only Filtered Element
    var evenList=num.filter {number->
        number%2==0
    }

    var sumofEven=num.filter {number->
        number%2==0
    }.sum()
    println(evenList)
    println(sumofEven)


    //To get non filtered Element

    val oddNumebr=num.filterNot {it->
        it%2==0
    }
    println("List of Odd Numbers $oddNumebr")

    val sumofOdd=oddNumebr.sum()
    println(sumofOdd)



    println("---------FiterNotNull--------------")
    val list2= listOf(1,null,3,4,null,10)
    val list3= list2.filterNotNull()
    println(list3)


    println("---------Map------------------")
    //Map is used to transfrom an element into Something

   val newEvenList= evenList.map {
        it*2
    }
    println(newEvenList)

//    we can aslo Calculate the sum of it
    val newEvenSum= evenList.sumOf {
        it * 2
    }
    println(newEvenSum)

    //------- Find---------
    // return the first matching item

    val student= listOf(
        student("Alex",82),
        student("John",81),
        student("Pooja",78)
    )

    val sortlisted=student.find { it->
        it.cgpa>80
    }
    println(sortlisted)

    var n= listOf(10,20,30,50)
    n+50
    println(n)
}


data class student(
    val name:String,
    val cgpa:Int
)
