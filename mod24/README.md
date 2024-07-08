
# MOCK 

[Mocks](https://github.com/maxfideles/ebac-backend-java-specialist-max/tree/main/mod24/Mock) are fake objects that simulates real objects.


It's needed to do unit tests in isolated componets, and in some cases there are dependency among classes. For example a service that depends of a repository to access that data in a database. In this case is needed to test the service and the repository isolated, without one depending of each other.


On these situation Mock objects are used.


# TDD

TDD stands for Test Driven Development, and it is a software development practice where the coding of functionalities begins from the writing of unit tests. This technique was created by Kent Beck and is one of the pillars of XP (Extreme Programming).

TDD consists of a cycle nicknamed Red, Green, Refactor. Which works as follows:

 - We wrote a test for a functionality that we want to implement. When running this test it should fail, because we do not yet have the implementation and so we went through the step red.

 - After our test fails we implement the functionality and run our test again, but this time the test passes successfully, with this we went through the green step of the TDD.

 - With the tests working we get to the step refactor. As the name itself says, at this moment we must refactor our code looking for points to improve and applying good programming practices.


The main benefits of TDD are:

 - Greater coverage of unit tests

 - Tests are performed more frequently

 - The code becomes cleaner
