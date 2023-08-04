# Generics


**Generics** means **parameterized types**. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible **to create classes that work with different data types**. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

Generics **enable the use of stronger type-checking, the elimination of casts, and the ability to develop generic algorithms**. Without generics, many of the features that we use in Java today would not be possible.

Before Generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.

The Generics is delimited by the characters _< >_ , when there is a par of these character, it means that Generics it's been used.

### Advantage of Java Generics

There are mainly 3 advantages of generics. They are as follows:

1. **Type-safety:** We can hold only a single type of objects in generics. It doesn't allow to store other objects.
2. **Type casting is not required:** There is no need to typecast the object. Before Generics, we need to type cast.
3. **Compile-Time Checking:** It is checked at compile time so problem will not occur at runtime. The good programming strategy says it is far better to handle the problem at compile time than runtime.

### Why Generics?

The **Object** is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. Generics add that type of safety feature.

Generics in Java are similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well. There are some fundamental differences between the two approaches to generic types. 

### Type Parameters in Java Generics

The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

- T – Type
- E – Element
- K – Key
- N – Number
- V – Value

### Types of Java Generics

- **Generic Method:** Generic Java method takes a parameter and returns some value after performing a task. It is exactly like a normal function, however, a generic method has type parameters that are cited by actual type. This allows the generic method to be used in a more general way. The compiler takes care of the type of safety which enables programmers to code easily since they do not have to perform long, individual type castings.

 ``` java
/**  
* The <b>< T ></b> is a Generic Type that receives  
* any type of list object.  
*  
* @param list List of Objects to be printed out  
* @return T  The first object in the list in accordance to the list object type received.  
*/  
  
private static <T> T catchFirst(List <T> list){  
return list.get(0);    
}
```

- **Generic Classes:** A generic class is implemented exactly like a non-generic class. The only difference is that it contains a type parameter section. There can be more than one type of parameter, separated by a comma. The classes, which accept one or more parameters, ​are known as parameterized classes or parameterized types.
``` java
public class GenericClass<T,E> {  
	private T data;  
	private E id;  
  
	//Constructor Generic  
	public GenericClass(T data, E id){  
		this.data = data;  
		this.id = id;  
	}
}
```


-  **Generic Functions**: We can also write generic functions that can be called with different types of arguments based on the type of arguments passed to the generic method. The compiler handles each method.
 ``` java
 /**  
* The <b>< T ></b> is a Generic Type that receives  
* any type of list object.  
*  
* @param list List of Objects to be printed out  
*  
*/
private static <T> void print(List<T> list){  
	for(T obj: list){  
		System.out.println(obj);  
	}  
}
```



----
External Resources:<br>
[Generics in Java](https://www.geeksforgeeks.org/generics-in-java/)<br>
[Generics: How They Work and Why They Are Important](https://www.oracle.com/technical-resources/articles/java/juneau-generics.html#:~:text=Generics%20enable%20the%20use%20of,today%20would%20not%20be%20possible.)