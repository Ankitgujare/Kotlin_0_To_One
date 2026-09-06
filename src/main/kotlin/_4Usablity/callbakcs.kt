package _4Usablity


fun main(){
    doWork(0){
        println("Doing some Work")
    }
}



fun doWork(flag:Int,callback:()->Unit){
    if (flag==1){
        callback()
    }else{
        println("Not calling the Callbacks")
    }

}