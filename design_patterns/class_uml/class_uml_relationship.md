# Class UML representation

### Association -------> Has A


Kotlin code 

```agsl
class OwnedClass{ 
// class body
}


class OwnerClass{
    private val ownedClass : OwnedClass
    private val ownerClass : OwnerClass
}
```

UML representation

![Alt text](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuV8lpqijSiv9B2vMiD7LrLK0yLCWV2i5NOLyE1UhoY8abN0k5rSoY49I01D06EQGcfS2j1u0)


---


### Extend  -------> Is A

```agsl
class Parent{
    private var data = 0
    fun method(){
        //body
    }
}


class Child : Parent{
    override fun method(){
        // overriden method
    }
}
```

UML representation

![Alt text](http://www.plantuml.com/plantuml/png/POx12i9034Jl-Oevwc71iwobu0_u2y54MjYkagH5gFwxPSMJns4URwRtO8jvAdHXqnh8hvGIpiDO14T0dw5L74JNmkxuKZctr7Kh0S33neL3iR11E1Wd75fncoicZU4kkpszwITfzfN-WNxRshvy0000)

---
### Implements  -------> Is A

```agsl
interface Parent{
    fun method()
}


class Child : Parent{
    override fun method(){
        // overriden method
    }
}
```

UML representation

![Alt text](http://www.plantuml.com/plantuml/png/POwn3i8m44Ft-mgFi4JCA5IL-05-uTHSrKX9g2xNBeL_9o9iUBIVR8_LM6tBYHwiKWp-vPp3VOafN86OroIv-HL4K-9QqJdlOp7HcISPXeFGj6hSsGGxAm8RuuRBDvYtWYosFCFfJ6_w5VMDW_w1KKfeZpu0)
