package coroutine

import kotlinx.coroutines.runBlocking

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Main coroutine starts")

        /***
         * Create a new coroutine scope
         * We pass a Job and a Dispatcher as parameters.
         * The Job represents the lifecycle of the scope, and the Dispatcher determines the execution context for
         * the coroutines within the scope (in this case, Dispatchers.Default).
         */
        val scope = CoroutineScope(Job() + Dispatchers.Default)


        // Launch coroutines within the scope
        scope.launch {
            delay(1000)
            println("Coroutine 1 executed")
        }

        // Launch coroutines within the scope
        scope.async {
            delay(2000)
            println("Coroutine 2 executed")
            "Coroutine 2 result"
        }.await()

        println("Main coroutine ends")
    }
}
