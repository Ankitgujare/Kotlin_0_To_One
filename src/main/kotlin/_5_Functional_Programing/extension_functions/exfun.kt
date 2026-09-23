package _5_Functional_Programing.extension_functions

fun main(){
    val name="ankit gujare"
    name.calLength()
    println(name.isEmpty())
    println(name.toUppercase())
    name.toFirstUppercase()
    name.toFirstUppercasenew()
    val str="";
    println(str.isEmpty())
}

fun String.calLength(){
    println(this.length)
}

fun String.isEmpty():Boolean{
   return this.isBlank()
}

fun String.toUppercase():String{
    return this.uppercase()
}

fun String.toFirstUppercase(){
    val newStr= this[0].uppercase()+this.substring(1)
    println(newStr)
}

fun String.toFirstUppercasenew(){
    println(this.replaceFirstChar { it.uppercase() })
    println("toFirstUppercasenew")

}
