package _5_Functional_Programing.Maps

fun main(){

    //Map is a part of collection
    //Which store the Data in Key and Value Pair

    val student= mapOf(
        101 to "Aman",
        102 to "Pooja",
        103 to "Raj",
        104 to "Aniket"
        )

    println(student)

    //The above map we have created is immutable map
    //we cant change its Values

    //student[101]="Ishwari"

    //We aslo have Another way to create a map which is
    // Immutable map

    val stu1= mutableMapOf<Int,String>(
        1 to "a",
        2 to "b",
        3 to "c",
        4 to "d",
        5 to "e"
    )

    println(stu1)

    //we can add
    stu1[6]="f"
    println(stu1)

    //we can  remove
    stu1.remove(6)
    println(stu1)

    //replace
    stu1.replace(4,"Four")
    println(stu1)

    //iterate Over map
    stu1.forEach{a,b->
        println(a)
        println(b)
    }


    //Access the values
    //from key

    println(stu1[1])
    println(stu1.get(1))

}