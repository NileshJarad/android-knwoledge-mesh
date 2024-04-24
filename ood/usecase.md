# Use case UML representation

## Component of Usecase Diagram

### Actor

User are called actors. They interact with system. Actor can be humans, system, machine/hardware or other external
system.

- **Primary actor** - These are the humans or external system that interact with system
- **Secondary actor** - These are used by system to assist the primary actor. They need primary actor to initiate
  usecase

### Usecase

These are the actions performed on system by actor.

## Relationships in use case diagrams

- **Association**: This shows the relationship between and among actor(s) and use case(s). It represents how an actor
  can perform certain functions. It is denoted by a solid line without arrows. All the actors in a use case diagram must
  have at least one association with any use case. More than one actor can be associated with the same use case, and a
  single actor can be associated with more than one use case.

- **Generalization**: This relationship is also known as inheritance. In a use case diagram, we have parent and child
  use cases. The child use case has generalization
  with the parent use case. Each child inherits the behavior of its parent. It is denoted by a solid line with an arrow
  on only one side (toward the parent use case).

- **Include**: We use this to show the relationship between two use cases. It shows that one use case includes the
  behavior of another use case. The included use case will execute only after the execution of the base use case. We can
  also say that the base use case requires an included use case in order to be completed. It is represented by a dashed
  line with an arrow on only one side (toward the included use case), and we write **<< include >>** above the line.

- **Extend**: We use this to show the relationship between two use cases. It shows that one use case extends the
  behaviors of another use case. The extended use case does not execute every time. It always depends on certain
  conditions. It is used to extend the functionality of the base use case. It is represented by a dashed line with an
  arrow on only one side (toward the base use case), and we write **<< extend >>** above the line.

