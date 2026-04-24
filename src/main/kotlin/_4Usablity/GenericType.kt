package _4Usablity

fun main() {
    val box=Box("Apple")
    println(box.getItemsInside())
    val box1=Box(123)
    box1.getItemsInside()
    println(box1.getItemsInside())

    //we can aslo pass another class as a paramter
    //because class is aslo a type
    val phone=phone("Nokia")
    val box4=Box(phone)
    println(box4.getItemsInside())
    box4.getItemsInside()

}


class Box<T>(private val items:T) {
    fun getItemsInside():T=items
}

data class phone(val brand:String)
