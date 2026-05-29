package ObjectOrientedPrograming05.sealedclass

import Red

fun main(){
    val response=Success("name:Ankit/roll:101/branch:ME")
    test(response)

    NewSignal(SignalState.RED)


    val Validate=Authstate.Login("Ankit","ankit@123")
    handleAuth(Validate)


    var i=0
    var status:DownloadState=DownloadState.downloadstarted
    while (i in 1..100 step 1){
        if (i in 3..5){
            downloadFile(status)
        }
        if (i in 10..20){
             status= DownloadState.downloading("Download started")
        }

        if (i in 30..50){
            status= DownloadState.Finished("File is ready c:document/academicDocs")
        }
        i++
    }
}


//network result Example
fun test(networkResult: NetworkResult){

    when(networkResult){
        is Success-> println("recieved Data ${networkResult.data}")
        is Failure-> println("Failed to get the Data")
        is Loading-> println("Please wait ...")
    }
}



//traffic Light state


fun trafficLight(trafficSignal: TrafficSignal){
    when(trafficSignal){
        TrafficSignal.Red("Red")-> println("Stop")
        TrafficSignal.Green("Green")-> println("Goo!")
        TrafficSignal.Orange("Orange")-> println("Get ready")
        else-> println("Not a valid state")
    }
}



//we can replicate the same with enum class


fun NewSignal(signalstate:SignalState){
    when(signalstate){
        SignalState.RED-> println("STOP!!")
        SignalState.GREEN-> println("GOO!!")
        SignalState.ORANGE-> println("SLOW DOWN ..")
    }
}






fun handleAuth(state:Authstate){


    //todo when we have a data class we compare it like below
    // and bad practice to pass the parameter to class within the when block

    //You use if for classes and Data classes Only
    when(state){
       is Authstate.Login ->{
           println("${state.username}  is Correct")
           println("${state.password} is Correct")
       }

       //todo when we have Object we do this
       Authstate.Loading-> println("Please Wait Loading")
       Authstate.Logout-> println("LogOut Successfuly")

       is Authstate.Error->{
           println(state.error)
       }
    }
}




fun doPayment(paymentMethod: PaymentMethod){


    when(paymentMethod){
         PaymentMethod.Cash-> println("Payment is done via Cash")
        is PaymentMethod.Card->{
            println("card number ${paymentMethod.cardNumber} Payment Done... ")
        }

        is PaymentMethod.Upi->{
            println("Payment is done By ${paymentMethod.UpiId} Payment is Succesfull")
        }

    }


}



fun doPayment2(paymentMethod: PaymentMethod){

    when (paymentMethod) {
        PaymentMethod.Cash -> {
            println("Payment is done via Cash")
        }
        is PaymentMethod.Card -> {
            println("Card Number ${paymentMethod.cardNumber} Payment Done...")
        }
        is PaymentMethod.Upi -> {
            println("Payment is done By ${paymentMethod.UpiId} Payment is Successful")
        }
    }
}




//todo Sealed class with Generic Types:





















//todo dowloading progress Example

fun downloadFile(downloading: DownloadState){
    when(downloading){






    }

}



