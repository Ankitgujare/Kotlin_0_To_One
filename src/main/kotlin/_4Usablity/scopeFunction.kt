package _4Usablity

fun main(){
   /* letdemo(null)
    rundemo("Ankit")*/
    withdemo()
    applydemo()
    aslodemo()

}



//let

fun letdemo(name:String?){
    val x= name?.let {
        println("${name.length}")
    }?:0
    println(x)
}


//run ->when you compute Something
fun rundemo(name:String?) {
   val x= name?.run {
        println(name)
        name.length * 2
    }
    println(x)
}


//with
//chain multiple Operations on an Object

fun withdemo(){
    val user=User()

   with(user){
        name="Ankit"
        age=12
        gender="Male"
    }

    println(user.age)
    println(user.name)
    println(user.gender)
}


//used to config an Object
fun applydemo(){
    val user=User().apply {
        name="Alex"
        age=22
        gender="Male"
    }

    println("${user.age} ${user.gender} ${user.name}")
}


class User{
    var name=""
    var age=1
    var gender=""
}


fun aslodemo(){
    val list=mutableListOf(1,2,3).also {
        println("Before: $it")
        it.add(4)
        println("After: $it")
    }
}


