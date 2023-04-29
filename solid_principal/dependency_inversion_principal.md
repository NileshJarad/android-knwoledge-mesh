# Dependency Inversion Principal

High-level modules should not depend on low-level modules. Both should depend on abstractions. This means that you should depend on abstractions (interfaces, abstract classes, etc.) rather than concrete implementations, which allows for greater flexibility and easier testing.



### Bad Code

```agsl
class DatabaseService {
    fun connect() { ... }
    fun disconnect() { ... }
    fun executeQuery(query: String): List<Any> { ... }
}

class UserService {
    private val db = DatabaseService()

    fun getUsers(): List<User> {
        val query = "SELECT * FROM users"
        val results = db.executeQuery(query)
        return results.map { row -> User(row) }
    }
}

```

In above example, the `UserService` depends on the `DatabaseService` implementation. If we want to switch to a different database implementation, we would need to modify the `UserService` class, which violates the **DIP**.

### Good Code Example

```agsl
interface Database {
    fun connect()
    fun disconnect()
    fun executeQuery(query: String): List<Any>
}

class DatabaseService : Database {
    override fun connect() { ... }
    override fun disconnect() { ... }
    override fun executeQuery(query: String): List<Any> { ... }
}

class UserService(private val db: Database) {
    fun getUsers(): List<User> {
        val query = "SELECT * FROM users"
        val results = db.executeQuery(query)
        return results.map { row -> User(row) }
    }
}

```