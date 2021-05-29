# JavaDesignPattern
## Why Patterns ?
Why do we need patterns? The blunt answer is we don't want to reinvent the wheel! Problems that occur frequently enough in tech life usually have well-defined solutions, which are flexible, modular and more understandable. These solutions when abstracted away from the tactical details become design patterns. If you experienced a déjà vu feeling when designing a solution for a problem that felt eerily similar to the solution of a previous problem, albeit in a different domain, then you were probably using a pattern unknowingly.

Below is an image showing the relationship among the various design patterns as explained by the seminal design patterns work done by the gang of four.

<img src = "https://github.com/ravi26067/JavaDesignPattern/blob/master/source/design.png" height=1000 width="1200"/>

Example
Let's consider an example to understand what design patterns are and how do they get applied. The class constructor is one of the basic concepts in an object oriented language. The constructors help create objects of the class and can take in parameters. Let us take the following class as an example.

``` java
public class Aircraft {

    private String type;

    public Aircraft(String type) {
        this.type = type;
    }
}
```

In the above example, we have the default constructor for the class that takes in a single parameter the type of the aircraft. Now say after a few days, you realize you want to add additional properties to your Aircraft class. Say you want to add the color of the aircraft as a property, but you have already released a version of your library and can't modify the original constructor. The solution is to add another constructor with two parameters like so

``` java
public class Aircraft {

    private String type;
    private String color;

    public Aircraft(String type) {
        this.type = type;
    }

    public Aircraft(String type, String color) {
        this.type = type;
        this.color = color;
    }
}

```

If you continue this way you'll end up having a bunch of constructors with increasing number of arguments looking like a telescope:

``` text
Aircraft(String type)
Aircraft(String type, String color)
Aircraft(String type, String color, String prop3)
Aircraft(String type, String color, String prop3, String prop4)  

```
  
The telescoping pattern is called an anti-pattern: how NOT to do things! The way to approach a class with an increasing number of variables is to use the Builder Pattern that we'll discuss in depth in the following chapters.

Seasoned developers are expected to be well-versed in design patterns and applying them makes the code reusable and maintainable for future. Design patterns aren't limited to object oriented languages but also exist for other domains of Computer Science such as distributed systems, big data system or user interface.


## Suggestions for Object Oriented Design
* Whenever writing code in an object oriented language, sticking to the following list of suggestions will make your code amenable to changes with the least effort.

* Separate out parts of code that vary or change from those that remain the same.

* Always code to an interface and not against a concrete implementation.

* Encapsulate behaviors as much as possible.

* Favor composition over inheritance. Inheritance can result in explosion of classes and also sometimes the base class is fitted with new functionality that isn't applicable to some of its derived classes.

* Interacting components within a system should be as loosely coupled as possible.

* Ideally, class design should inhibit modification and encourage extension.

* Using patterns in your day to day work, allows exchanging entire implementation concepts with other developers via shared pattern vocabulary.

Some of the above suggestions are embodied in the patterns we'll be discussing in the upcoming lessons. However, remember that making one's design flexible and extensible correspondingly increases the complexity and understandability of the code base. One must walk a fine line between the two competing objectives when designing and writing software.

## Types of Design Patterns

### Introduction
Design patterns for object orientated programs are divided into three broad categories listed below. These are the same categories used by GoF in their seminal work on design patterns.

Creational
Structural
Behavioural
Each of these are explained below

### Creational
Creational design patterns relate to how objects are constructed from classes. New-ing up objects may sound trivial but unthoughtfully littering code with object instance creations can lead to headaches down the road. The creational design pattern come with powerful suggestions on how best to encapsulate the object creation process in a program.

Builder Pattern
Prototype Pattern
Singleton Pattern
Abstract Factory Pattern

### Structural
Structural patterns are concerned with the composition of classes i.e. how the classes are made up or constructed. These include:

Adapter Pattern
Bridge Pattern
Composite Pattern
Decorator Pattern
Facade Pattern
Flyweight Pattern
Proxy Pattern

### Behavioral
Behavioral design patterns dictate the interaction of classes and objects amongst eachother and the delegation of responsibility. These include:

Interpreter Pattern
Template Pattern
Chain of Responsibility Pattern
Command Pattern
Iterator Pattern
Mediator Pattern
Memento Pattern
Observer Pattern
State Pattern
Strategy Pattern
Visitor Pattern

### Examples
For most of the patterns, we borrow concepts from the aviation industry to create our examples. You'll find the course regularly talking about F-16s and Boeings to elaborate aspects of the pattern under discussion.

### For Interview Prep
For folks, who are rushing through the course for an upcoming interview, I would suggest going through all the creational design patterns, decorator, proxy, iterator, observer and visitor patterns. As you read through them, be sure to look at the Java framework's api examples pointed out in each lesson.
