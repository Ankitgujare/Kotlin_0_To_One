package ObjectOrientedPrograming05

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
}