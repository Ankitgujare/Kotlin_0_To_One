package _4Usablity

fun main() {
   /* val state=Signal.RED
    println(state)
*/

    println(Priority.HIGH.color)
    println(Priority.Low.color)
    println(Priority.MEDIUM .color)


    println("_________________________________________________")

    for (pri in Priority.values()){
        println("${pri.name},${pri.color}")
    }

    println("_________________________________________________")
    println("We can aslo have functions and Properties in an Enum class")

    println(Priority.MEDIUM.number)


    println("_________________________________________________")
    println("We can aslo have regualar functions and Properties in an Enum class")
    Dirrection.EAST.currentDirrec()

    println("_________________________________________________")
    println("We can aslo have abstract functions in an Enum class")
    var Ans=Operation.ADD.Apply(10,20)
    println(Ans)

    Ans=Operation.SUBSTRACT.Apply(20,18)
    println(Ans)




}




enum class Signal{
    RED,GREEN,YELLOW
}


//Named constants inside an Enum class
//present an Objects of that enum class
//and enum class can aslo have a contructor



enum class Priority(val color:String){
    Low("GREEN"),MEDIUM("ORGANGE"),HIGH("RED");


    val number:Int
    get() =  when(this){
        Low->1
        MEDIUM->2
        HIGH ->3
    }

}


enum class Dirrection{
    EAST,WEST,NORTH,SOUTH;

    fun currentDirrec(){
        println("current Dirrection is $this")
    }
}

enum class Operation{
    ADD{
        override fun Apply(a: Int, b: Int): Int {
           return a+b
        }

    },
    SUBSTRACT {
        override fun Apply(a: Int, b: Int): Int {
            return a-b
        }
    };



    abstract fun Apply(a:Int,b:Int):Int
}

