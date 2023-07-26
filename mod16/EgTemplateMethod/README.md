# Template Method

**Template Method** is a behavioral design pattern that allows you to defines a skeleton of an algorithm in a base class and let subclasses override the steps without changing the overall algorithm’s structure.

Template Method is used prominently in frameworks. Each framework implements the invariant pieces of a domain's architecture, and defines "placeholders" for all necessary or interesting client customization options. In so doing, the framework becomes the "center of the universe", and the client customizations are simply "the third rock from the sun". This inverted control structure has been affectionately labelled "the Hollywood principle" - "don't call us, we'll call you".

I have an abstract with many methods following  steps to implement them, however, I have sub-classes that are similar between them, but one or more steps(methods) are different. See [[Template Method#Example| Exemple]] .

[Run](https://replit.com/@MaxFideles/Template-Method-Java) the example.

#### Structure
<br>
<div>
<img hight=500 src="https://sourcemaking.com/files/v2/content/patterns/Template_Method-2x.png"/>
</div>


#### Example

In the abstract Class worker have some steps about a worker daily routine.


<div>
<img height= 500 src="https://sourcemaking.com/files/v2/content/patterns/Template_method_example-2x.png" />
</div>

Note that the only method that they may be different it's their profession. Using this design pattern it's possible to define a subclass to override the methods in interest only.






----
External Resources:
[Template Method](https://springframework.guru/gang-of-four-design-patterns/template-method-pattern/ "Template Method Design Pattern")
[Source Making - Template Method](https://sourcemaking.com/design_patterns/template_method)