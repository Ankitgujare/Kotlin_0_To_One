package ObjectOrientedPrograming05


fun main(){
    val c1=Car()
    c1.startTheKey()
}

class Car{

    //Tight coupling
    val engine=Engine()

    fun startTheKey(){
        engine.start()
    }
}

class Engine{
    fun start(){
        println("Engine started")
    }
}