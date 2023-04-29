# Open Closed Principal

Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. This means that you should be able to add new functionality without changing existing code.


### Bad Code Example

```agsl
class Shape(private val type: String) {
    fun area(): Double {
        if (type == "rectangle") {
            // calculate area of rectangle
        } else if (type == "circle") {
            // calculate area of circle
        }
        // more if/else statements for other types of shapes
    }
}
```

In above example, the Shape class is not closed for modification because if a new type of shape is added, the area() method will need to be modified.


### Good Code Example


```agsl
abstract class Shape {
    abstract fun area(): Double
}

class Rectangle(private val width: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
}

class Circle(private val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

```


In the improved code, the Shape class has been made abstract and an abstract `area()` method has been added. Concrete classes for each type of shape have been created, and each class implements the `area()` method. This allows new types of shapes to be added without modifying existing code.