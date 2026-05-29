package ObjectOrientedPrograming05.sealedclass

sealed class NetworkResult2<out T>
data class success<T>(val data:T):NetworkResult2<T>()
data class failure(val errorMessage:String):NetworkResult2<Nothing>()
object loading:NetworkResult2<Nothing>()