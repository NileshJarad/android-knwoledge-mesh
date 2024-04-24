package coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() = runBlocking {
    withContext(Dispatchers.Unconfined) {
        println(1)
        launch(Dispatchers.Unconfined) {
            println(2)
        }
        println(3)
    }
    println("Done")
}