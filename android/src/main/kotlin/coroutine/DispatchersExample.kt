package coroutine

import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    runBlocking {
        launch {
            println("Main Run Blocking => Working on ${Thread.currentThread().name}")
        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined => Working on ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default => Working on ${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext => Working on ${Thread.currentThread().name}")
        }
    }
}