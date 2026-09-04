package _4Usablity



fun main(){

    /**
     *Safe call Operator
     */
    var newName:String="Ankit"
    var name: String? ="Rohan"

   // newName=name this will gives us an erros
    /**
     * Even if we wanted to do that
     * we will do a type check
     */

    if (name!=null){
        newName=name
    }

    name?.let {
        newName=it
    }
    val charecterLenght1=greeting("Hello Good Morning")
    println("$charecterLenght1")
    val charecterLenght2=greeting(null)
    println("$charecterLenght2")

    getName()
    safeCast()


}


fun greeting(calLenght:String?):Int{
   return calLenght?.length?:0
}

fun getName(){
    val name:String?=null
    var newName=name?.length?:"Unknown"
    println("newName is $newName")
}


fun safeCast(){
    val v1:Any="Ankit"      //it will cast into String
    val name1=v1 as String
    println("name is $name1")
    /*val v2:Any=10L   //not a compatible Type throw an Exception
    val name2=v2 as String
    println("name is $name2")*/

    /**
     *we aslo have something as?
     * Safe cast Operator
     */
    val v3:Any=10L   //not a compatible Type throw an Exception
    val name3=v3 as? String
    println("name is $name3")

}