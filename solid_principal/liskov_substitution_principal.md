# Liskov Substitution Principal

Subtypes must be substitutable for their base types. In simpler terms, any instance of a parent class should be able to be replaced by an instance of one of its child classes without affecting the correctness of the program.


### Bad Code Example

```agsl
class Bird {
    fun fly() {
        // implement flying behavior for birds
    }
}

class Penguin : Bird() { 
// penguins cannot fly, so we do not implement the fly() method
}

```

In above example, the `Penguin` class violates the **LSP** because it inherits the `fly()` method from the `Bird` class, but penguins cannot fly.

### Good Code Example

```agsl
interface Flyable {
    fun fly()
}

class Bird : Flyable {
    override fun fly() {
        // implement flying behavior for birds
    }
}

class Penguin { 
// penguins cannot fly, so we do not implement the fly() method
}

```


In the improved code, the Flyable interface has been added, and the Bird class now implements the Flyable interface