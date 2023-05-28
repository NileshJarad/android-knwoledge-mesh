package coroutine

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main coroutine starts")

    supervisorScope {
        launch {
            delay(1000)
            println("Coroutine 1 executed")
        }

        launch {
            delay(1500)
            throw Exception("Coroutine 2 failed")
        }

        launch {
            delay(2000)
            println("Coroutine 3 executed")
        }
    }

    println("Main coroutine ends")
}
