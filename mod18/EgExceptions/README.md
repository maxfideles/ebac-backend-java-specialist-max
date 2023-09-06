# Exceptions



In [[Java]], exceptions are objects that describe an exceptional (error) condition that has occurred in a piece of code. They are used to handle errors and other exceptional events in programs written in the Java programming language.

To catch an exception is needed to do a treatment before. One the ways to treat an exception in [[Java]]  is using the code below:

``` java 
try {
	//Code here
} catch (Exception e){
	// Error treatment here
}
```

And there is another way adding the *finally*:
``` java 
try {
	//Code here
} catch (Exception e){
	// Error treatment here
} finally{
	// This code will be always be executed 
}
```

There are two kinds of exceptions in Java: 

1. **Checked exceptions:** These are the exceptions that are checked by the compiler at compile time. If a method throws a checked exception, then the caller of the method must either handle the exception or declare it in the throws clause.

>Use when there is a recoverable error or an important business requirement.


2. **Unchecked exceptions:** These are the exceptions that are not checked by the compiler at compile time. They include runtime exceptions and errors.
>
>Use when is not possible to recover. For exemple, when the server memory is overused.

#### The exception class hierarchy in Java is as follows:

![](https://github.com/maxfideles/ebac-backend-java-specialist-max/assets/61297641/acc9ae3b-b36c-45e4-8a48-861db13bc3d6)


#### Throw and Throws

The throws keyword is used to declare which exceptions can be thrown from a method, while the throw keyword is used to explicitly throw an exception within a method or block of code.

![](https://github.com/maxfideles/ebac-backend-java-specialist-max/assets/61297641/d86c8095-1a31-4a2b-832e-b02dd81d24ad)

It can be understood as actions that spreads exceptions, some moments there are exceptions that can't be treated in the same method that generate the exception. In this case, is necessary to spread the the exception to a level above in the stack. 