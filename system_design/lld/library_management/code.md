# Library Management System - Code


```agsl
package system_design.library_management

import java.util.Date


data class Library(private val name: String, private val location: Location, private val books: List<Book>)

class Location(
    private val address: String,
    private val city: String,
    private val state: String,
    private val pinCode: Int,
)

class RackLocation(private val number: Int, location: String)
class BookItem(
    private val id: Int,
    private val title: String,
    private val authors: List<Author>,
    private val type: BookType,
    private val barcode: String,
    private val rack: RackLocation,
    private val bookStatus: BookStatus,
    private val issueDate: Date
) : Book(id, title, authors, type)

enum class BookType {
    SCI_FI, ROMANTIC, HORROR, DRAMA, FANTASY
}

enum class BookStatus {
    AVAILABLE, LOST, RESERVED, ISSUED
}


open class Book(
    private val id: Int,
    private val title: String,
    private val authors: List<Author>,
    private val type: BookType
)

open class User {
    private val firstName: String = ""
    private val middleName: String = ""
    private val lastName: String = ""
}

class Author(private val publishedBooks: List<Book>) : User()

open class SystemUser : User() {
    private val email: String = ""
    private val phoneNumber: String = ""
    private val id: String = ""
    private val password: String = ""
}


class Member() : SystemUser() {
    private var totalNumberOfBooksCheckout: Int = 0
    private val searchService: SearchService? = null
    private val bookIssueService: BookIssueService? = null
}

class Librarian : SystemUser() {
    private val searchService: SearchService? = null
    private val bookIssueService: BookIssueService? = null
    fun addBook(item: BookItem): Boolean {

    }

    fun deleteBook(item: BookItem): Boolean {

    }

    fun editBook(item: BookItem): BookItem {

    }
}

class SearchService {
    fun getBookByTitle(title: String) {

    }

    fun getBookByAuthor(author: Author) {

    }

    fun getBookByType(type: BookType) {

    }
}

class BookIssueService {
    fun reserveBook(book: BookItem, user: SystemUser) {

    }

    fun getReservationDetails(book: BookItem): BookReservationDetails {

    }

    fun issueBook(book: BookItem, user: SystemUser): BookIssueDetails {

    }

    fun renewBook(book: BookItem, user: SystemUser): BookIssueDetails {

    }

    fun returnBook(book: BookItem, user: SystemUser){
        
    }
}

```