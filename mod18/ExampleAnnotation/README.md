# Annotation

In the Java computer programming language, an annotation is a form of syntactic metadata that can be added to Java source code. Classes, methods, variables, parameters and Java packages may be annotated. Like Javadoc tags, Java annotations can be read from source files.

Some common examples of annotations are **@Override and @SuppressWarnings** . These are built-in annotations provided by Java through the java. lang package. We can further extend the core functionality to provide our custom annotations.

There are 3 types of annotation:
- Markdown Annotation
  Are that ones that don't have member. Are identified only for its name, without additional data:
```java
	@Override
```


- Unique Value Annotation;
  Are similar to the listed before, however, this one has one unique member (value) that you pass between parenthesis:
  ```java
  @Target (value = ElementType.ANNOTATION_TYPE)
  ```
- Complete Annotation;
	Igual to the last one, however, the complete annotation needs to pass more than one value:
	```java
	@Deprecated (forRemoval = true, since = "1.2")
   ``` 

#### Meta Annotation

Are used to create annotations. They are in the **java.lang.annotation** package
- [[Annotations#@Retention |@Retention]];
- @Documented : Indicates that all the annotations marked using @Documented will be added to the Javadoc documentation;
- [[Annotations#@Target|@Target]]
- @Inherited : Indicates that all annotations using it, the subclasses will inherit the annotations from the parent class.

##### @Retention

The annotations may be only on the source code or on the binary class or interfaces. There are 3 values:
- **Source:** The annotations won't be in the source code;
- **Class:** To write the annotation in the .class file, but it won't be available on the runtime (Tempo de execução);
- **Runtime:** To indicate that the annotations will be available on the runtime.
  ```java
  @Retention (RetentionPolicy.RUNTIME)
  public @interface ExemploAnotacao{
  
  }
  ```

##### @Target

It is possible to define which elements of a class can be annotated with it:
- TYPE: Classes or interfaces;
- FIELD: Class properties;
- METHOD: Methods;
- PARAMETER: Parameters;
- CONSTRUCTOR: Constructors;
- LOCAL_VARIABLE: Local Variables;

```java 
    @Retention (ElementType.TYPE)
```
