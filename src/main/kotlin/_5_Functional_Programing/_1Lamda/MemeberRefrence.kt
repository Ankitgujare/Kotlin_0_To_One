package _5_Functional_Programing._1Lamda


fun main(){

    val users= listOf(
        Person("Aman",32, male = true),
        Person("Alex",23, male = true),
        Person("Sneha",22,false),
        Person("Pooja",25,false)
    )

//    without property Refrence
    users.filter { it.age>22 }
        .forEach{ println(it.name)}

//    with Property refrence
    users.filter(Person::male)
        .forEach{
            println(it.name)
        }



    //Function refrence
    println(Person::showinfo)

    println(dog::config)

    //Function Refrence of the Top Level Function
    val people=Person("Aman",22,true)


}




data class Person(
    val name:String,
    val age:Int,
    val male:Boolean
)

fun Person.showinfo():String{
    return "Hello from show"
}

class dog{
    fun config()="In Dog class"
}