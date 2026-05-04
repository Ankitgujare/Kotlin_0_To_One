package ObjectOrientedPrograming05

fun main() {
    val animal:Animal=Dog()
    animal.eat()
    animal.sound()


    //DownCasting ->Automaticaly
    if (animal is Dog){
        animal.play()
    }

    when(animal){
        is Dog-> println("Dog.")
        else-> println("Cat")
    }

    downcast(animal)
    downcast(null)


    val d1=Dog()
    val c1=Cat()
    //to filter the Particular instamnce from List

    val animals= listOf<Animal>(d1,c1)
    val x1= animals.filterIsInstance<Dog>()

    x1.forEach {
        it.play()
    }


}
//when the childClassType is Assign to the ParentType is called as Upcasting
//lets take an Example of that

interface Animal{
    fun eat()
    fun sound()
}


class Dog():Animal{
    override fun eat() {
        println("Dog is Eating..")
    }

    override fun sound() {
        println("bhooo bhoo")
    }

    fun play(){
        println("Playing with Balls")
    }

}


class Cat():Animal{
    override fun eat() {
        println("Cat is Eating..")
    }

    override fun sound() {
        println("Meeow")
    }

    fun play(){
        println("Playing with mouse")
    }

}
fun downcast(animal: Animal?){
    val cat=animal as Cat
    cat.play()
    cat.play()
    cat.sound()
}