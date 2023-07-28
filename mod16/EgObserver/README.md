# Observer

![](https://refactoring.guru/images/patterns/content/observer/observer-2x.png?id=d5a83e115528e9fd633f04ad2650f1db)

<br>

**Observer** is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

Imagine an Instagram account you follow, every time  the person start a live video you and others followers are notified about it. In this case, the account you follow is the **publisher**(Subject), when the person change a status, you and the others followers, as  subscribers(Observers), will be notified.

But imagine that you also want to receive this notification by email, subscribing your e-mail address to this notification channel (other Observer).

[Run](https://replit.com/@MaxFideles/Observer-Java?v=1) the example.

#### Example

The UML class diagram for the example is shown below:
![](https://lucid.app/publicSegments/view/032eac08-8224-419b-a9ea-eb99c4f949ce/image.png)

The **Publisher** that have the content to be observable and triggers the notification to the others is an **InstaAccount** object , which one implements the interface **Subject**. This object can add and remove observers(Subscribers) in an ArrayList or any other Collection.

From the interface **Observer** is possible to implements classes to create different types of objects to receive the message from the **Publisher**. As in the example were created the classes InstaFollower and Email, and each one are in the ArrayList _followers_.

When the Publisher calls the method update( ), all the **Observers**  will receive the same message in your own way.

----
External resources:<br>
[Observer](https://springframework.guru/gang-of-four-design-patterns/observer-pattern/)<br>
[Observer - Refactoring Guru](https://refactoring.guru/design-patterns/observer)