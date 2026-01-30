package _5_Functional_Programing.HigherOrderFunction

import javax.xml.crypto.dsig.spec.TransformParameterSpec


fun createmultipler(multiplier:Int):(Int)->Int{
    return {x->x*multiplier}
}


fun createDivider(time:Int):(Int)->Int{
    return {t->t-time}
}




fun calsum(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}

fun calsub(n1:Int,n2:Int,operation: (Int, Int) -> Int):Int{
    return operation(n1,n2)
}

fun calavg(a:Int,b:Int,c:Int,operation: (Int, Int, Int) -> Int):Int{
    return operation(a,b,c)/3
}


private fun printresult(a:Int, x: (Int) -> Unit){
    x(a)
}

private fun printName(name:String,cap:(String)->Unit={it.capitalize()}){
    cap(name)
}

fun customFilter(
    list:List<Int>,
    condtion:(Int)->Boolean
):List<Int>{

    var updatedlist= mutableListOf<Int>()

    list.forEach{element->
        if (condtion(element)){
            updatedlist.add(element)
        }
    }

    if (updatedlist.isEmpty()){
        println("no Element found greater than 10")
        return updatedlist
    }
   return updatedlist

}


fun twoX(n:Int):(Int)->Int{
    return { value->n*value }
}



fun createRunningSum(){

}


fun processString(str:String,capi:(String)->String,caleng:(String)->Int):Int{
    return caleng(capi(str))
}

fun makeCapitalized(str:String,c:(String)->String):String{
    return c(str)
}

fun main() {

    println(calsum(10,20){x,y->x+y})
    println(calavg(20,12,26){ a, b, c->(a+b+c)/3})
    println(calsub(10,22){n1,n2->
        n2-n1
    })

    println(printresult(10){it->
        println("The values of n is $it")
    })

    var name="rohan"

    printName(name){
        println(it)
    }


    val Tripple= createmultipler(3)
    println(Tripple(4))


    val divider= createDivider(3)
    println(divider(20))

    val doubleIt= twoX(2)
    println(doubleIt(5))


    var list= listOf<Int>(1,22,10,11,9,8,17,12)
    println(customFilter(list,{it>10}))

    var list2= listOf(1,2,3,4,5,6,7,8,9,10)
    println(customFilter(list2,{it>10}))





    println(processString("ankit",{it.capitalize()},{it.length}))
    println(makeCapitalized("ankit"){it->
        it.capitalize()
    })











}