# Class UML representation

### Association -------> Has A

1. Association is a relation between two separate classes which establishes through their Objects.
2. Association can be one-to-one, one-to-many, many-to-one, many-to-many.
3. In Object-Oriented programming, an Object communicates to another object to use functionality and services provided by that object.
4. Composition and Aggregation are the two forms of association.


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

#### Aggregation ----> has a

In Aggregation, both entries can survive individually which means ending one entity will not affect the other entity.

UML representation

![Alt text](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuGekAKr9pIjHqDNLKd19BG2AveAuLWgEwUb5gUc99Qd5N0wfUIb0jG00)


--- 

#### Composition ----> has a (part of )

It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity


UML representation

![Alt text](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBDIy_CIrNGrTLIS4uiKh1IA01AAEIdSJcavgK05G00)

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


---

### Dependency  -------> 

UML representation

![Alt text](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuNBAJrBGqzEpKt3CoKnELR1II4ajICrBALR8prFWSW2oW8e0)
