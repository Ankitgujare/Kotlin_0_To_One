package ObjectOrientedPrograming05.delegation

import java.awt.print.PrinterIOException

/**
 * Here we will Cover all the Cases of the Delication's
 * Using By Keyword
 * I don't want this class/property to do this job itself
 * Let another object do it for me
 */

fun main() {
    /*val printer=Printer()
    val persion=Person(printer)
    persion.printerMessageFromPrinter()*/


    val printer=priterImp()
    val person1=Person1(printer)
    person1.printMessage()
}

class Printer{

    fun printmessage(){
        println("Hello World!")
    }
}
class Person(val printer:Printer){
    fun printerMessageFromPrinter() {
        printer.printmessage()
    }

}


interface printer1{
    fun printMessage()
}


class priterImp:printer1{
    override fun printMessage() {
        println("Printer printing the Logo")
    }

}

class Person1(
    val printer1: printer1
):printer1 by printer1
