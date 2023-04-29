# Single Responsibility Principal 

A class should have only one reason to change. In other words, each class should do one thing and do it well.


### Bad Code example

```agsl
class UserManager {
    fun createUser(user: User) {
        // create user in database
    }

    fun sendEmail(user: User) {
        // send email to user
    }
}
```

In above example, the UserManager class is responsible for both creating a user in the database and sending a welcome email to the user. This violates the SRP because the class has more than one reason to change.


### Good Code Example

```agsl
class UserDatabase {
    fun createUser(user: User?) {
        // create user in database
    }
}


class EmailService {
    fun sendWelcomeEmail(user: User?) {
        // send welcome email to user
    }
}


class UserManager {
    private val userDatabase: UserDatabase? = null
    private val emailService: EmailService? = null
    fun createUser(user: User?) {
        userDatabase!!.createUser(user)
        emailService!!.sendWelcomeEmail(user)
    }
}
```

In the improved code, the responsibilities of creating a user and sending a welcome email have been separated into two separate classes (UserDatabase and EmailService). The UserManager class now delegates those responsibilities to the appropriate classes

