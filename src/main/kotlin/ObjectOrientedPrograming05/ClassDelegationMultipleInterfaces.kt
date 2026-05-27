package ObjectOrientedPrograming05

import _4Usablity.Priority

interface Walker {
    fun walk()
}

interface Speaker {
    fun speak()
}

class HumanWalker : Walker {
    override fun walk() {
        println("Robot is walking")
    }
}

class HumanSpeaker : Speaker {
    override fun speak() {
        println("Robot says Hello!")
    }
}

class Robot(
    walker: Walker,
    speaker: Speaker
) : Walker by walker,
    Speaker by speaker

fun main() {

    val walker = HumanWalker()
    val speaker = HumanSpeaker()

    val robot = Robot(walker, speaker)

    robot.walk()
    robot.speak()


    val intern=newJoiner()
    intern.coding()
    intern.gettingPaid()
}

//todo You cannot delegate to two Diffrent classes that uses the same Interface


interface programer{

    fun coding()
    fun gettingPaid()

}


class JavaProgrammer(private val amount:Int=0) :programer{
    override fun coding() {
        println("Coding using Java")
    }

    override fun gettingPaid() {
        println("getting paid $$amount")
    }


}

class Kotlinprogrammer :programer{
    override fun coding() {
        println("Coding using Kotlin")
    }

    override fun gettingPaid() {
        TODO("Not yet implemented")
    }

}



class newJoiner:programer by JavaProgrammer(amount = 100)




/*class freelacer1:
    programer by Kotlinprogrammer(),
    programer by JavaProgrammer()*/




interface Teacher{

    fun work()
    fun getPaid()
}


interface Designer{
    fun work()
    fun getpaid()
}



class GraphicDesigner:Designer{
    override fun work() {
        println("Designer")
    }

    override fun getpaid() {
        println("Designer Getting Paid")
    }

}



class NewTeacher:Teacher{
    override fun work() {
        println("Teaching")
    }

    override fun getPaid() {
        println("Teacher is Getting Paid")
    }
}



/*
class MutliTask:
    Teacher by NewTeacher(),
    Designer by GraphicDesigner(){

    }
*/


class x:NetworkResult()


