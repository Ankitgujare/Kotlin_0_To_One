package ObjectOrientedPrograming05


fun main() {

    val plane=Airport.Plane(null)
    plane.fly()
    println(plane.location())




    val airport=Airport("Pune")
    val plane2= Airport.Plane(airport)
    println(plane2.location())


    //todo intilizing Priavte Plane

   // val privatePlane=Airport.PrivatePlane()
    //Cant Create Object of Private Plane because its Private class
    airport.test()

    val ticket= Ticket("John", Ticket.Seat.ECO)
    ticket.ticketDetails()
    ticket.upgrade()
    ticket.ticketDetails()

}



class Airport(val city:String){

   open class Plane(val airport: Airport?){
        fun location()=airport?.city;
        fun fly(){
            println("Plane Flying...")
        }
    }

    //todo Private class Inside a Outer class


    open class PublicPlane{

     }
    private class PrivatePlane():PublicPlane(){
      fun flying(){
          println("Flying in PrivatePlane")
      }
    }



    private fun getPrivatePlane(privatePlane: PrivatePlane){
        privatePlane.flying()
    }

    fun test(){
        getPrivatePlane(PrivatePlane())
    }





}


class Ticket(
    private val name:String,
    private var seat:Seat
){

    enum class Seat{
        ECO,
        PREMIUM,
        BUSINESS,
        FIRST
    }


    fun upgrade(){
        seat=Seat.values()[seat.ordinal+1]
    }

    fun ticketDetails(){
        println("Name $name and Seat is $seat")
    }
}




