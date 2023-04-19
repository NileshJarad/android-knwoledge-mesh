# Builder

1. **Builder is creational design pattern**
2. **It allows to create complex object step by step**
3. **This pattern allows to create the different object from same construction code**


### Steps to create builder pattern

1. Declare interface(it can be abstract class or interface) as **Builder**
2. Make concrete builder follows the Builder
3. Define product 
4. Client



### Pros
1. You can create object step by step
2. You can reuse the same code construction code for various representation of product



### Cons
1. Overall complexity increases as it needs extra classes




### UML

[PlantUML for Factory Pattern](http://www.plantuml.com/plantuml/uml/TP312eCm44Jl-nLxr4C2hJSHaVe3fNyGuhOLqWZPpKdzzwOqpK7ePPYyC3Em0ui94byEBd5s4mNiDgrnNBmD99GXm3KiausIVfN2J5jy6aO3CBgPlA1IMtzCjXYP663sGk5kBFt2NLTGtw_WJrKD_loH9ic3v4OSdLHrYtaRTW2mpZ0Naf-7pM_RghNUKsLnJNR_oWVoKph46m00)

![Alt text](http://www.plantuml.com/plantuml/png/TP312eCm44Jl-nLxr4C2hJSHaVe3fNyGuhOLqWZPpKdzzwOqpK7ePPYyC3Em0ui94byEBd5s4mNiDgrnNBmD99GXm3KiausIVfN2J5jy6aO3CBgPlA1IMtzCjXYP663sGk5kBFt2NLTGtw_WJrKD_loH9ic3v4OSdLHrYtaRTW2mpZ0Naf-7pM_RghNUKsLnJNR_oWVoKph46m00)









### kotlin code

Builder interface
```agsl
interface HouseBuilder {
    fun buildWalls(numWalls: Int)
    fun buildDoor(numDoors: Int)
    fun buildWindows(numWindows: Int)
    fun buildGarden()
    fun buildGarage()
    fun buildSteps(numSteps: Int)
    fun getResult(): House
}
```


Concrete builder

```agsl
class MyHouseBuilder : HouseBuilder {

    private var walls = 0
    private var doors = 0
    private var windows = 0
    private var garden = false
    private var garage = false
    private var steps = 0
    override fun buildWalls(numWalls: Int) {
        this.walls = numWalls
    }

    override fun buildDoor(numDoors: Int) {
        this.doors = numDoors
    }

    override fun buildWindows(numWindows: Int) {
        this.windows = numWindows
    }

    override fun buildGarden() {
        this.garden = true
    }

    override fun buildGarage() {
        this.garage = true
    }

    override fun buildSteps(numSteps: Int) {
        this.steps = numSteps
    }

    override fun getResult(): House {
        return House(walls, doors, windows, garden, garage, steps)
    }


}
```

Product 

```agsl
data class House(
    private val walls: Int = 0,
    private val doors: Int = 0,
    private val windows: Int = 0,
    private val garden: Boolean = false,
    private val garage: Boolean = false,
    private val steps: Int = 0
)
```

client

```agsl
    val gardenHouseBuilder = MyHouseBuilder().apply {
        this.buildDoor(2)
        this.buildGarden()
        this.buildWalls(4)
        this.buildSteps(9)
        this.buildWindows(4)
    }


    val gardenHouse = gardenHouseBuilder.getResult()
    println("Garden House  = $gardenHouse")

    val gardenWithGarageHouseBuilder = MyHouseBuilder().apply {
        this.buildDoor(2)
        this.buildGarden()
        this.buildGarage()
        this.buildWalls(4)
        this.buildSteps(25)
        this.buildWindows(4)
    }


    val gardenWithGardenHouse = gardenWithGarageHouseBuilder.getResult()
    println("Garden with garage House  = $gardenWithGardenHouse")
```