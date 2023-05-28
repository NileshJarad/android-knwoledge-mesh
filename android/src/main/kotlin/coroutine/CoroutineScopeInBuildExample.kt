package coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main coroutine starts")

    coroutineScope {
        launch {
            delay(500)
            println("Coroutine 1 executed")
        }

        launch {
            delay(1000)
            throw Exception("Coroutine 2 failed")
        }

        launch {
            delay(1500)
            throw Exception("Coroutine 3 executing")
        }
    }

    println("Main coroutine ends")
}
