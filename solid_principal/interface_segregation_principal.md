# Interface Segregation Principal


Clients should not be forced to depend on interfaces they do not use. This means that you should break up interfaces into smaller, more focused interfaces so that clients only need to implement the methods they care about.


### Bad Code Example

```agsl
interface Vehicle {
    fun start()
    fun stop()
    fun accelerate()
    fun brake()
    fun turn()
}

class Car : Vehicle {
    override fun start() { ... }
    override fun stop() { ... }
    override fun accelerate() { ... }
    override fun brake() { ... }
    override fun turn() { ... }
}

class Bicycle : Vehicle {
    override fun start() { ... }
    override fun stop() { ... }
    override fun accelerate() { ... } // does not apply to a bicycle
    override fun brake() { ... }
    override fun turn() { ... }
}

```
In above example, the `Vehicle` interface is too generic, and it forces all implementing classes to provide implementations for all of its methods, even if they are not applicable. In this case, the `accelerate()` method is not applicable to a `Bicycle`.

### Good Code Example

```agsl
interface Startable {
    fun start()
    fun stop()
}

interface Acceleratable {
    fun accelerate()
    fun brake()
}

interface Turnable {
    fun turn()
}

class Car : Startable, Acceleratable, Turnable {
    override fun start() { ... }
    override fun stop() { ... }
    override fun accelerate() { ... }
    override fun brake() { ... }
    override fun turn() { ... }
}

class Bicycle : Startable, Turnable {
    override fun start() { ... }
    override fun stop() { ... }
    override fun turn() { ... }
}

```

n the improved code, the `Vehicle` interface has been broken down into smaller, more specific interfaces, such as `Startable`, `Acceleratable`, and `Turnable`. This allows implementing classes to only implement the methods they need. In this case, the `Bicycle` class only needs to implement `Startable` and `Turnable`, and does not need to implement `Acceleratable` and `brake()`.