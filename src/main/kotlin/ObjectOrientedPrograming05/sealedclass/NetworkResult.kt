package ObjectOrientedPrograming05.sealedclass

sealed class NetworkResult

data class Success(val data:String):NetworkResult()
data class Failure(val error:String):NetworkResult()
object Loading:NetworkResult()