

## Adapter Pattern

* This patterns helps as a connection between two different types of interfaces. 
  * Most famous example of US and UK sockets is taken here, as the adapter is the one which helps to connect your specific US plug into UK socket(Adaptee).
    * Example, existing system(Client) might need a function from an older library(Adaptee), here with no code changes from client and adaptee, adapter helps to perform client request by converting it into the available adaptee options
    * Existing system(No code changes) --> Adapter(Medium) --> Old Code(No Code Changes) 
  
    * Usually, there are two types of Adapters

* Object Adapters
  * Adapts the Adaptee by the process of composition.
  * **Composition** :  Is basically having has-A relationship between two classes. 
    * House has-A Bathroom, Car has-A Engine
    * **Class diagram** for Object Adapter
    * ![Unable to load image](https://www.plantuml.com/plantuml/dpng/TSv12W8n38NXVKxHfIvoWrcCU0Fn0c7cAOMqr2HTgNSNeGCgkCxtVZ9xY4KlIekAUpfgHeqx9SEjmsEtfoTHhW6xo89q5hiYqWyOuyCgBO3trHkMB7hwH5_AKYvDKL33_rMttlHWtcP40q_CFDwb6NNjHLy0) 
* Class Adapters
  * Adapts the Adaptee by the process of multiple Inheritance
  * **Multiple Inheritance**: having multiple is-A relations - [Ref](MultipleInheritance.kt)
  * not applicable in JAVA
  **Class diagram** for class Adapter
  * ![Unable to load image](https://www.plantuml.com/plantuml/dpng/SoWkIImgAStDuKhEIImkLd3EoKpDAwdcKYXABInDBIxHqEIgvOBAXIGMfQUMA62NT4n9B2X9JGN95XUa9cScvWGXAK9LLQIGMb6IcfU2qqYOOJOrkhemFLnSKCKska11Y3kv782c01qF0000)
  
More info on Composition vs Inheritance -  [Ref](https://www.adservio.fr/post/composition-vs-inheritance#el1)