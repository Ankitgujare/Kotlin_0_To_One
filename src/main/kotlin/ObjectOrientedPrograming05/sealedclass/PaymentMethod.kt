package ObjectOrientedPrograming05.sealedclass

sealed class PaymentMethod {
    class Card(val cardNumber:Int):PaymentMethod()
    class Upi(val UpiId:Int):PaymentMethod()
    object Cash:PaymentMethod()
}