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

    devide(10,0,::success){error->
        println("$error")
    }
    fetchUser(
        1,
        onSuccess = {
            println(it)
        },
        onFailture = {
            println(it)
        })

    fetchUser(
        101,
        onSuccess = {
            println(it)
        },
        onFailture = {
            println(it)
        })

    processOrder(
        2,
        onSuccess = {
            println(it)
        },
        onFailure = {
            println(it)
        })
    processOrder(
        0,
        onSuccess = {
            println(it)
        },
        onFailure = {
            println(it)
        })

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

fun devide(
    a:Int,b:Int,
    success:(Int)->Unit,
    error:(String)->Unit
){
    if (b==0){
        error("Cannot div By 0")
        return
    }
    val result=a/b;
    success(result)

}

fun success(result:Int){
    println("Result is Cal Successfuly $result")
}



fun fetchUser(
    userId:Int,
    onSuccess:(String)->Unit,
    onFailture:(String)->Unit
){
    if (userId==1){
        onSuccess("User Found Ankit with $userId")
        return
    }
    onFailture("no User Found for the Provided UserId")
}

fun processOrder(
    orderId:Int,
    onSuccess:(String)->Unit,
    onFailure:(String)->Unit
){
    if (orderId!=0){
        onSuccess("Order is Successfuly")
        return
    }
    onFailure("Error")
}