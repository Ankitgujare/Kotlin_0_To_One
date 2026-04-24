package _4Usablity

fun main(){
    letdemo(null)
    rundemo("Ankit")
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