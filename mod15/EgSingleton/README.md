


![](https://refactoring.guru/images/patterns/content/singleton/singleton-2x.png)

_Singleton_ is a creational _design pattern_ that lets you ensure that **a class has only one instance**, while providing a global access point to this instance. Below, shows some aspects that need be careful when create this pattern:

- The class constructor needs to be as **private**, and cannot the instanced to outside of the class;
- The **class** is _final_, because it doesn't allow to create subclasses from itself;
- The access is allowed **_throughout the method_** thats returns the unique instance from the **class**, or create a new instance if it wasn't created before.


## Applications

-  The process to print. It's necessary just to create one printer object and then receive the instance of this object from outside. There's one printer for many users to print;
- The process to connect to a data base. Create a unique object to make the connection to the data base, and the users will not instance other object to do the connection, all of them will use the same connection.



## Code

### Class

The class will be created following the pattern  mentioned above.

#### Class Constructor
``` java
//Class as final
public final class Singleton {  
  
	private static Singleton singleton;  
  
	//private constructor  
	private Singleton(){  
  
	} 
  
} 
```

#### Method
``` java
//Creating the mothod

	public static Singleton getInstance(){  
		if (singleton==null){  
			singleton = new Singleton();  
		}  
		return singleton;  
	}
```

#### Full Code
``` java
public final class Singleton {  
  
	private static Singleton singleton;  
  
	//private constructor  
	private Singleton(){  
  
	}  
  
	//creating the method  
	public static Singleton getInstance(){  
		if (singleton==null){  
			singleton = new Singleton();  
		}  
		return singleton;  
	}  
}

```

### Main

Here the application will try to instance twice the object. But notice that when printed it out on the console, the two variables (_singleton_ and _singleton1_) have the same address in memory.

``` java

public class DemoSingleton {  
  
public static void main (String [] args){  
  
Singleton singleton = Singleton.getInstance();  
Singleton singleton1 = Singleton.getInstance();  
  
System.out.println(singleton);  
System.out.println(singleton1);  
  
}  
  
}

```

_Output_:<br>
<img width="658" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/cc7af353-9638-4751-98a9-68a099065ace">


---- 

External Resources:<br>
[Singleton Design Pattern](https://springframework.guru/gang-of-four-design-patterns/singleton-design-pattern/)

[Singleton - Refactoring](https://refactoring.guru/design-patterns/singleton)
