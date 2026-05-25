package ObjectOrientedPrograming05



class IndianChef : chef {

    private var _name=""
    override var name: String
        get() = _name
        set(value) {
            _name=value
        }

    override fun cookFood() {
        println("coocking the Delicious Indian food..")
    }
}


fun main(){
    val freelancer=freelancer()
    freelancer.code()

    val intern=intern()
    intern.code()

    val freelancer1=freelancer1()
    freelancer1.code()

    val fullstackDev=fullstackDev()
    fullstackDev.code()
    fullstackDev.codebackend()


    val chef1=IndianChef()

    chef1.name="John"
    println(chef1)
    println(chef1.name)

    chef1.cookFood()

    val a1=Aman()
    a1.cookFood()



}


interface programmer{
    fun code()
}

class KotlinProg(val laptop:String):programmer{
    override fun code() {
        println("Programing in Kotlin in $laptop")
    }

}





class freelancer:programmer by KotlinProg("Hp")

//we can aslo Override an implementation of Delegated class Like

class intern(
    private val kotlinProg: KotlinProg = KotlinProg("Mac")
) : programmer by kotlinProg {

    override fun code() {
        println("Intern coding in Kotlin using ${kotlinProg.laptop}")
    }
}
//we can aslo pass the parameters Like
class freelancer1:programmer by KotlinProg("Desktop")


//You cannot delegate to two Diffrent classes that uses same Interface

class JavaProgramer:programmer{
    override fun code() {
        println("Coding in Java")
    }

}
/*
class freelancer4:programmer by KotlinProg("mac"),
        programmer by JavaProgramer()*/



//Instead we can do
//create an Another interface

interface backEndDeveloper{
    fun codebackend()
}

class intern2:backEndDeveloper{
    override fun codebackend() {
        println("Coding in Java developing backend")
    }
}


class fullstackDev:programmer by JavaProgramer(),
        backEndDeveloper by intern2()



interface chef{


    var name: String;
     fun cookFood(){
        println("Coocking delicous Food")
    }


}





class Aman : chef by IndianChef(){
    override fun cookFood() {
        println("Aman is coocking the Delicious Food")
    }
}





