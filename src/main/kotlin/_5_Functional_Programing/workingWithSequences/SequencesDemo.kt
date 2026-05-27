package _5_Functional_Programing.workingWithSequences


//Sequences are used to Process the Collection of Data Lazily

fun main() {

    val num= listOf(1,2,3,4,5)
        .asSequence()
        .filter { it%2==0 }
        .map { it*10 }
        .toList()   

    println(num)

}