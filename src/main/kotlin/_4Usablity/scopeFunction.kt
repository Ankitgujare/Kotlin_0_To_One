package _4Usablity

fun main(){
   /* letdemo(null)
    rundemo("Ankit")*/
    rundemo1("Mahesh")
    withdemo()
    applydemo()
    aslodemo()
    letdemo("Ankit")
    withdemo2()
    runexample3()
    withexaple()
    applyexample()


}


fun applyexample(){
    val p=person()
    p.apply {
        name="Ankit"
        roll=121
    }

    println(p.name)
    println(p.roll)
    List

}


fun withexaple(){
    val p=person1("Ankit",22)

    with(p){
        println(name)
        println(age)
    }
}
//let

fun letdemo(name:String?){
    val x= name?.let {
        println("${name.length}")
    }?:0
    println(x)


    println("Converting the name Into UpperCase")
    val capitalName=name.let {
        it?.uppercase()
    }

    println("Capital name is $capitalName")


}


//run ->when you compute Something
fun rundemo(name:String?) {
   val x= name?.run {
        println(name)
        name.length * 2
    }
    println(x)

    val p=person()
    p.name="Ankit"
    p.roll=121

    p.run {
        println(name)
        println(roll)
    }

}

fun runexample2(){
    val p=person()
    p.name="Ankit"
    p.roll=121

   val size= p.run {
        println(name)
        println(roll)
        name?.length
    }
    println("size of the name is $size")
}


fun runexample3(){
    val p=person1("Ankit",12)

    val ageafter5year=p.run {
        age+5
    }
    println("age after 5 year $ageafter5year")
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

fun withdemo2(){
    val p=person()
    with(p){
        name="Ankit"
        roll=121

        println(name)
        println(roll)
    }
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



fun rundemo1(name:String?){
   val x = name?.run {
        println(this)
        length+2
    }
    println(x)

}


class person{
    var name:String?=null
    var roll:Int?=null

    fun getname()=name
    fun getrollNo()=roll
}

data class person1(
    val name:String,
    val age:Int
)