
The designers of the [[Java]] API interface have incorporated into the update a new abstraction called Stream, which allows you to process data in a declarative way. Even more, **streams allow you to take advantage of multi-core architectures without having to program lines of multiprocess code**.

A flow is a sequence of objects that supports several methods that can be channeled to produce the desired result. The method provided by the stream is broadly categorized as:

- [[Streams#Intermediate Operations|Intermediate Operations]] 
- [[Streams#Terminal Operations|Terminal Operations]]

### Intermediate Operations

Here, we will be discussing the intermediate methods of the Stream API. All these methods are in java.util.stream.Stream . Intermediate operators are not executed until a terminal operation is invoked, that is, they are not executed until a processing result is really necessary. One of the most used intermediate operations are:
- [[Streams#Filter|#Filter]]
- [[Streams#Map|#Map]]
- [[Streams#Sorted|#Sorted]]
- [[Streams#Limit|Limit]]
- [[Streams#Distinct|Distinct]]

#### Filter

It returns a new flow that consists of the elements of the flow from which it is called, which are in accordance with the predicate (condition). To do it, it receive as parameter an object that implements he Predicate <T;> (ignore ';') interface and return a new stream containing the elements that satisfy this condition only.
``` java
Stream<Person> personNat = people.stream()  
	.filter(person -> person.getNationality().equals("Brazilian"));
```

#### Map

In some situations is needed to make transformations in a data list. The map() method allows to make this changes without the need to use intermediate variables, just using as argumenta function java.util.function type. Function, as the Predicate<T;> , is a functional interface.
This function takes each element in a stream as parameter and return the processed element as the answer. The result is a new stream containing the mapped elements from the original stream. 

``` java
Stream<String> personAge = people.stream()  
	.filter(person -> person.getNationality().equals("British"))  
	.map(Person::getName);
```
#### Sorted

Returns a stream consisting of the elements of the passed stream, sorted according to the natural order. If the elements of this stream are not comparable, a java.lang.ClassCastException can be thrown when the terminal operation is performed.
```java
Stream<Person> personAge = people.stream()    
	.sorted(Comparator.comparing(Person::getAge));  
  
//having an ordination after applying a filter  
Stream<Person> personNatAge = people.stream()  
	.filter(person -> person.getNationality().equals("Brazilian"))  
	.sorted(Comparator.comparing(Person::getAge));
```

#### Distinct

The distinct() method returns a stream containing the exclusive elements only. The elements that are unique, in accordance to the equals() method implementation.
It requests the implementation of "Equals and HasCode" in the class.

```java 
Stream<Person> personDis= people.stream()  
	.distinct();
```

#### Limit
It is used to limit the number of elements in a stream. It's an operation known as *short-circuit* due to the fact that it doesn't need to process all the elements. For example, the following code demonstrate how to return the two first elements only.

```java
Stream<Person> personLimit = people.stream()  
	.limit(2);
```
### Terminal Operations

The terminal operations of the Java Stream interface typically return a single value. Terminal operations can not be chained together. Intermediate operations return another stream as a result, they can be chained together to form a pipeline of operations.
Some of Terminal Stream Operations:

- anyMatch()
- allMatch()
- noneMatch()
- collect()
- count()
- findAny()
- findFirst()
- [[Streams#forEach|forEach()]]
- min()
- max()
- reduce()
- toArray()

#### forEach

Using forEach() is possible to have a looping over all the elements in a stream and execute any kind of process.
