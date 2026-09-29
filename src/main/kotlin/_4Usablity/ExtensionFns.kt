package _4Usablity

fun Int.isEven(){
    if (this%2==0){
        println("Even ,can have More logic here")
    }else{
        println("Odd can have more Logic here")
    }
}


fun Int.sqr()=this*2

fun String.capitalizeFirstLetter():String{
    if (this.isBlank() || this.isEmpty()){
        return this
    }

  return this[0].uppercase()+this.substring(1)
}








fun String.validPassword()=this.length>=5

fun String.safeStr():Int{
    if (this.isNullOrBlank() || this.isNullOrEmpty()){
        return 0
    }

    return this.length


}

//-----------------------------------------------------
//                  Intermediate Questions
//-----------------------------------------------------

fun List<Int>.sum():Int{

    var sum=0
    for (i in this){
        sum+=i
    }

    return sum

}



fun String.getLast():Char{
   return this[this.length-1]
}


fun List<Int>.findsecondlargest():Int?{
    return this.sortedDescending()
        .getOrNull(1)

}












fun List<Int>.calAvg(){

}








class student{





}





fun List<Int>.process(operation: (Int) -> Int): List<Int>{
    return this.map{element->
        operation(element)
    }
}


fun List<Int>.findmax():Int?{
    return this.maxOrNull()
}

fun List<Int>.findmaxmanualy():Int?{
  return this.maxOf{
        it
    }.toInt()
}


fun List<Int>.findeven():List<Int>{
    return this.filter {
        it%2==0
    }
}


fun List<Int>.removeduplicates():List<Int>{
    return this.toSet().toList()
}



fun main() {
    var n = 17
    n.isEven()


    var str = "jddbbbbnd"
    println(str.validPassword())



    var n1=2
    println(n1.sqr())

    var name="Ankit"
    name= name.capitalizeFirstLetter()
    println(name)

    var str2:String?=null
    var result=str2?.safeStr()
    println(result)




    var n2= listOf(1,2,3,4,5)
    val ans= n2.sum()
    println(ans)

    val str3="Android"
    val y= str3.getLast()
    println(y)

    val numbers= listOf(1,2,3,4)
    val doubleNumbers=numbers.process {
        it*2
    }
    println("Doubled the List $doubleNumbers")
    println("max element from the List ${doubleNumbers.findmax()}")
    println("max element from the List manualy ${doubleNumbers.findmaxmanualy()}")

    val n3= listOf(1,1,2,3,4,5,5,6,7)
    println("List of even Number from random List ${n3.findeven()}")
    println("removed Duplicate elements from List ${n3.removeduplicates()}")

    val n4= listOf(11,22,1199,1122)
    println("Second Largest element fron the List n4 ${n4.findsecondlargest()}")
    println("first Largest element from the List n4 ${n4.firstlargest()}")
    println("second Largest element from the List n4 ${n4.findsecondlargest2()}")

}


fun List<Int>.firstlargest():Int?{

    var max=this[0]

    for (element in this){
        if (element>max){
            max=element
        }
    }

    return max
}

fun List<Int>.findsecondlargest2():Int?{


    var fmax=this[0]

    //find first laregst
    for (element in this){
        if (element>fmax){
            fmax=element
        }
    }

    var smax=0
    for (element in this){
       if (element>smax && element<fmax){
           smax=element
       }
    }



    return smax
}

