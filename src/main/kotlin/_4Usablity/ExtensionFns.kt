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














fun List<Int>.calAvg(){

}








class student{





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

    var str3="Android"
   var y= str3.getLast()
    println(y)


}