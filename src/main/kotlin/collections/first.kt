package collections

import _5_Functional_Programing.name

fun main(){


    //immutable List
    val names= listOf("Ankit","Pranay","Prasanta")
    println("This is Immutable List")
    println(names[1])
    println(names)
    //muttableLists
    val names2= mutableListOf("Ankit","Pranay","Prasanna",1,2,3)
    println("mutable version of List")
    println(names2)
    println(names2.last())




    val app= listOf("Youtube","Instagram","Facebook")
    val isPresent= app.contains("Youtube")
    println(isPresent)

    for (apps in app){
        println(apps)
    }



    val users= listOf<User>(
        User(22,"Ankit"),
        User(12,"pranay"),
        User(9,"sonu")
    )

   val users2= users.sortedBy {
        it.age
    }
    println("Sorted Users By Names :: $users2")
    


    val employees= listOf(
        employees("Ankit","Java"),
        employees("Aman","Android"),
        employees("Mahesh","Python"),
        employees("Anil","Android")
    )

   val groupedByDept= employees.groupBy {
        it.department
    }

    println(groupedByDept)
    val uniqueSet= setOf(1,1,2,2,3,4,5,6)
    uniqueSet.asSequence()
    println("unique set $uniqueSet")

    val marks= mapOf(
        90 to "English",
        55 to "Physics",
        68 to "Java",
        )
    
    println(marks)

}


data class User(
    val age:Int,
    val name:String
)


data class employees(
    val name:String,
    val department:String
)