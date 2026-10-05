package ObjectOrientedPrograming05.delegation


/**
 * Here we will Cover all the Cases of the Delication's
 * Using By Keyword
 * I don't want this class/property to do this job itself
 * Let another object do it for me
 */

fun main() {

    
    val printer=RealPrinter()
    val officePrinter=OfficePrinter(printer)
    officePrinter.print()


    val fileLogger=FileLogger()
    val newApp=NewApp(fileLogger)
    newApp.log("New Logger In App")
    val logger=Logger()
    val app=App(logger)
    app.logSomething("Hello Kotlin")

    val oldCalc=calculatorImp()
    val advCalculator=AdvCalculator(oldCalc)
    val result=advCalculator.calSum(10,20)
    println(result)


    val agent=Agent()
    val travelApplication=TravelApplication(agent)
    travelApplication.bookFight(100L)

    val aiAgent=AntiGravity()
    val p=Person(aiAgent)
    p.work()


    val employee=employee(aiAgent)
    employee.code()




}



class Logger{
    fun log(msg:String){
        print(msg)
    }
}


/*
this is Called as Manual Delegation
*/
class App(
    val logger:Logger
){
    fun logSomething(logMessage:String){
        logger.log(logMessage)
    }
}

/**
 *-----------------------But Kotlin can do this Delegation Automaticaly--------------------------
 */

interface newLogger{
    fun log(msg:String)
}

//implementation of the above Interface

class FileLogger:newLogger{
    override fun log(msg: String) {
       println("new Logger message $msg")
    }
}



class NewApp(
    logger:newLogger
):newLogger by logger





interface calculator{
    fun calSum(a:Int,b:Int):Int
}

class calculatorImp:calculator{
    override fun calSum(a: Int, b: Int):Int {
      return a+b
    }
}

class AdvCalculator(
    calculator: calculator
):calculator by calculator
fun doSomething(onclick:()->Unit){

    if (true){
        onclick
    }
}




interface flightBooking{
    fun bookFight(amount:Long)
}

class Agent:flightBooking{
    override fun bookFight(amount: Long) {
        println("Booking Flight for the Customer with $amount")
    }

}


class TravelApplication(
    agent: Agent
):flightBooking by agent




interface Printer{
    fun print()
}

class RealPrinter:Printer{
    override fun print() {
        println("Printed By Real Printer")
    }

}

class OfficePrinter(printer: Printer):Printer by printer




interface Ai{
    fun code()
}

class AntiGravity:Ai{
    override fun code() {
        println("Coding in AntiGravity")
    }

}
class Person(val ai:Ai){

    fun work(){
        ai.code()
    }
}




class employee(ai: Ai):Ai by ai


