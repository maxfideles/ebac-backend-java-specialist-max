# Stream and Optional

## Stream
The designers of the **Java** API interface have incorporated into the update a new abstraction called [Stream](https://github.com/maxfideles/ebac-backend-java-specialist-max/tree/main/mod22/EgStreams), which allows you to process data in a declarative way. Even more, **streams allow you to take advantage of multi-core architectures without having to program lines of multiprocess code**.

A flow is a sequence of objects that supports several methods that can be channeled to produce the desired result. The method provided by the stream is broadly categorized as:

- [Intermediate Operations](https://github.com/maxfideles/ebac-backend-java-specialist-max/tree/main/mod22/EgStreams2) 
- [Terminal Operations](https://github.com/maxfideles/ebac-backend-java-specialist-max/tree/main/mod22/EgStreams3)

## Optional
[Optionals](https://github.com/maxfideles/ebac-backend-java-specialist-max/tree/main/mod22/EgOptional) are created to avoid the *nullPointerExceptions* and before to get something, we can validate if it exist. 

```java
// .max get the maximum and .min get the minimum value  
people.stream()  
	.max(Comparator.comparing(Person::getAge))  
	.ifPresent(System.out::println);  
  
people.stream()  
	.min(Comparator.comparing(Person::getAge))  
	.ifPresent(System.out::println);  
  
//another way  
Optional<Person> personOpt = people.stream()  
	.max(Comparator.comparing(Person::getAge));  

personOpt.ifPresent(System.out::println);
```
