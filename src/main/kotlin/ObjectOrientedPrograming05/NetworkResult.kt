package ObjectOrientedPrograming05

sealed class NetworkResult {

    data class Success(val data: String) : NetworkResult()

    data class Failure(val error: String) : NetworkResult()

    object Loading : NetworkResult()
}

fun handleResult(result: NetworkResult) {

    when (result) {

        is NetworkResult.Success -> {
            println("Success: ${result.data}")
        }

        is NetworkResult.Failure -> {
            println("Failure: ${result.error}")
        }

        is NetworkResult.Loading -> {
            println("Loading...")
        }
    }
}

fun main() {

    val success = NetworkResult.Success("Data Received")

    val failure = NetworkResult.Failure("Server Error")

    val loading = NetworkResult.Loading

    handleResult(success)

    handleResult(failure)

    handleResult(loading)
}

class demo:NetworkResult()