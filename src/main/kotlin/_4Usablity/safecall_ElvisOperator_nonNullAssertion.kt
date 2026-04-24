package _4Usablity

fun main(){

    val n1= listOf(12,7,7,7,7)
    var result= n1.lastOrNull(){it%2==0}
    val n2= listOf<Int>()
    println(n2.isEmpty())
    println(result)

   var n3=listOf<Int>()
   result=n3.lastOrNull(){it%2==0}
    println(n3.isNullOrEmpty())
    println(result)



}

fun getname(name:String?){
    println(name?.isEmpty())
}



