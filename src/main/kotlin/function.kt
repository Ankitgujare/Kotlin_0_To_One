import java.awt.desktop.PrintFilesEvent
import java.lang.reflect.GenericDeclaration

fun greet(msg:String){
    println(msg)
}


fun Prininfo(age:Int,name:String,gender:String){
    println("Name is $name age is $age Gender $gender")

}

fun MakeTea(sugar:String,Milk:String,NTea:Int=1){
    println("Tea is Served with Quantity $NTea")
}



//Function with return type

fun Add(n1:Int,n2:Int):Int{
    return n1+n2;
}



fun Evencheck(n:Int):String{
    if (n%2==0){
        return "Even";
    }
    return "Not even"
}


fun greet(){
    println("Doc kd jasil Khokla yet ahe")
}

fun say():String{
    return "Hi"
}




fun sub(n1:Int,n2:Int):Int{
    return n1-n2;
}

fun sub2(n1:Int,n2:Int):Int=n1-n2
fun avg(n1:Int,n2:Int):Int=(n1+n2)/2





fun main() {


//    //normal Agrument
//   Prininfo(19,"Tanushri","Female")
//    //Named Agrument
//   Prininfo(gender = "Male", age = 25, name = "Ankit")


  greet()

}