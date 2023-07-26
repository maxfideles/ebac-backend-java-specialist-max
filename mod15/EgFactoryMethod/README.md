# Factory Method
![](https://refactoring.guru/images/patterns/content/factory-method/factory-method-en-2x.png)

**Factory Method** is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

Imagine that you need to create UIComponents based on the user's Operational Systems.

[Run](https://replit.com/@MaxFideles/Factory-Method-Java) the example.

the UML diagram for this example is shown below:

<img width="897" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/f7406fbf-ee8f-4e05-8e58-5b300dae5c43">

<br>

The interface *UIComponents* set the methods that the **Concrete UIComponent**s classes (Android and IOS Components) will implement to create different final UI's.


The abstract class *BaseComponentsFactory* (Creator) will set the method to create the UIComponents based on the user's Operational System, and this method is implemented by the _ComponentsFactory_ (Concrete Creator).

In case to create a new UIComponents for an another OS, the main class doesn't need to be changed, the only changes to be done are, to implement a new **Concrete UIComponents** class, and add it to the **Concrete Creator**.



----
External Resources:<br>
[Factory Method](https://springframework.guru/gang-of-four-design-patterns/factory-method-design-pattern/)
