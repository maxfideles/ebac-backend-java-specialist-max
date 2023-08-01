# Facade


![](https://refactoring.guru/images/patterns/content/facade/facade-2x.png)

**Facade** is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

For example imagine a rent application, on the background there are tons of complex sets of classes and methods. Instead of call all of this methods, the facade simplify it thought an interface. It needed to call few methods (Or one), and the rest it's managed by the facade on the background.


[Run](https://replit.com/@MaxFideles/Facade-Java) the example.


#### Example

The UML for this example is shown below:
![](https://github.com/maxfideles/ebac-backend-java-specialist-max/assets/61297641/e7dc2d8b-218f-4ed0-8128-e127e01cea20)

The facade (the Rent class) will be on duty to implements the complexes classes and methods in the background, meanwhile on the main class is necessary to call one method only.

**Main Class**
``` java
public class Main {  
	public static void main(String[] args) {  
		IRent rent = new Rent();  
		rent.rent();  
	}  
}
```

For example the **Rent** class will check if the user is already registered, which type of habitation the user would like to rent and return to the console the detail about the renting.


----
External Resources:<br>
[Facade Pattern](https://springframework.guru/gang-of-four-design-patterns/facade-pattern/)<br>
[Facade](https://refactoring.guru/design-patterns/facade)