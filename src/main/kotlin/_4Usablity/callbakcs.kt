package _4Usablity

import ObjectOrientedPrograming05.sealedclass.DownloadState
import ObjectOrientedPrograming05.sealedclass.downloadFile
import kotlin.math.sign


fun main(){
  greet()
    dosomething(::greet)
    calculate(10,20,::printnumber)
    executeTwice(
        ::greet
    )

    val ans=checkNumber(12){isEven->
        println("$isEven")
    }
    println(ans)

    login("Ankit@123","Ankit@123"){status->
        if (status){
            println("Login successful")
            return@login
        }
        println("Invalid Username and Password")
    }

    downloadFile("Death_Note_epi1"){it->
        println("$it")
    }

    calculate(10,20,::add){
        println("Result of Add is $it")
    }

    registerUser("Aman",20){
        println(it)
    }

    fetchData(100){status,error->
        println("$status ... $error")
    }

}


//normaly we create a function and then Call it from Main Like
fun greet(){
    println("Good Morning")
}

//but what if Another fun will be responsible for Deciding when to call that function

fun dosomething(callback:()->Unit){
    println("Doing something")
    callback()

}



fun calculate(
    a:Int,b:Int,
    printNumber:(Int)->Unit
){
    val ans=a+b
    printNumber(ans)
}


fun printnumber(n:Int){
    println("outPut is $n")
}


fun executeTwice(callback:()->Unit){

    callback()
    callback()
}



fun checkNumber(
    n:Int,
    callback:(Boolean)->Unit
){

    callback(n%2==0)

}



fun login(username:String,
          password:String,
          callback:(Boolean)->Unit){

    val USERNAME="Ankit@123"
    val PASS="Ankit@123"

    if (username.equals(USERNAME, ignoreCase = false)
        && password.equals(PASS, ignoreCase = false)){
        callback(true)
    }else{
        callback(false)
    }


}
fun downloadFile(filename:String,callback:(String)->Unit){
    Thread.sleep(1000)// simulating file download
    callback("$filename is Downloaded...")

}



fun calculate(a:Int,b:Int,operation:(Int,Int)->Int,callback:(Int)->Unit){
   val ans= operation(a,b)
   callback(ans)
}

fun registerUser(name:String,age:Int,callback:(String)->Unit){
    if (age>18){
        callback("Registration Successfully")
    }else{
        callback("Registration Failed:: Underage")
    }
}

fun fetchData(userId:Int,callback:(String?,String?)->Unit){

    if (userId==101){
        callback("Success",null)
    }else{
        callback("Failed","User not Found")

    }
}