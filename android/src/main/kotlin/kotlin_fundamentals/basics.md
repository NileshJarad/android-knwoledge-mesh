# Basics

## Variables

- `val` is used to declare read-only (immutable) variables. Once initialized, the value of a `val` cannot be changed.
- `var` is used to declare mutable variables. The value of a `var` can be changed after it is initialized. 
- `const val`: This keyword is used to declare compile-time constants. Constants declared with` const val` must be top-level or member of an object declaration or a companion object. These constants are replaced by their actual values at compile time wherever they are referenced.
```kotlin
val x: Int = 5
x = 10 // This will cause a compilation error because x is immutable

var y: Int = 5
y = 10 // This is valid because y is mutable
```



- `lateinit` is used for properties that are initialized later, after the object creation. It is mainly used with non-null properties of classes that cannot be initialized in constructors.
- `lazy` is a function that takes a lambda and returns an instance of Lazy<T> which can be used to access the lazily computed value.

    > Remember, lateinit should be used with caution, as accessing an uninitialized lateinit property will throw an exception. lazy is thread-safe by default and will compute the value only once, on the first access, making it suitable for lazy initialization.

    > lateinit and lazy are features used for lazy initialization in Kotlin:
   
```kotlin
class MyClass {
    lateinit var lateInitVar: String

    val lazyVar: String by lazy {
        "Lazy initialized value"
    }
}

fun main() {
    val obj = MyClass()
    
    // Accessing lateinit variable before initialization will throw an exception
    // obj.lateInitVar // This will throw UninitializedPropertyAccessException
    
    obj.lateInitVar = "Initialized late"
    println(obj.lateInitVar) // Prints: Initialized late
    
    // Accessing lazy variable will initialize it on first access
    println(obj.lazyVar) // Prints: Lazy initialized value
}

```

Checking whether a lateinit var is initialized
```kotlin
if (foo::bar.isInitialized) {
    println(foo.bar)
}
```

## Backing field


- The **field** identifier can only be used in the accessors of the property.
- A backing field will be generated for a property if usage of the `field` keyword is required.

```kotlin
var counter = 0 // the initializer assigns the backing field directly
    set(value) {
        if (value >= 0)
            field = value
            // counter = value // ERROR StackOverflow: Using actual name 'counter' would make setter recursive
    }

var name : String = "" // no backing field will be generated

var isCountSet: Boolean // no backing field will be genrated
  get() = counter != 0

```



## Range Operator
```kotlin
1..5  //1,2,3,4,5
```

```kotlin
1.rangeTo(5)  // 1,2,3,4,5
```

```kotlin
5 downTo 1  // 5,4,3,2,1
```

```kotlin
1..5 step 2 // 1,3,5
```

```kotlin
1..5 downTo 1 step 2 // 5,3,1
```

```kotlin
1 until 4 // 1,2,3 
```

```kotlin
1..<4 // 1,2,3 
```