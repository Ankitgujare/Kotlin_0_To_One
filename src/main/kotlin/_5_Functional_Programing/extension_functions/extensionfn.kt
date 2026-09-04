package _5_Functional_Programing.extension_functions


fun main(){
        var name:String="Ankit"
    println(name.count())
    println(name.lastChar())
    var n1=121
    println(n1.isEven())
    println("Reversed Name ${name.reversString()}")
    print("Number of Vowels in Name ${name.countVowels()}")
}

/**
 *Create an extension function Int.isEven() that returns true if the number is even.
 Create an extension function String.reverseString() that returns the reversed string.
 Create an extension function String.isPalindrome() that checks whether a string is a palindrome.
 */

fun String.count():Int{
    return this.length
}

fun String.lastChar():Int{
    return this.length-1;
}

fun Int.isEven():Boolean{
  return this%2==0
}

fun String.reversString():String{
   return this.reversed()
}


fun String.countVowels():Int{

    return this.count {
        it.lowercaseChar() in "aeiou"
    }
}