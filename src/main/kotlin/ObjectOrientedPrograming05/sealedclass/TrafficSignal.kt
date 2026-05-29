package ObjectOrientedPrograming05.sealedclass


sealed class TrafficSignal {
    data class Red(val color:String):TrafficSignal()
    data class Orange(val color:String):TrafficSignal()
    data class Green(val color:String):TrafficSignal()

}


enum class SignalState{
    RED,
    GREEN,
    ORANGE
}