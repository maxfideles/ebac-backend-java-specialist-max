# Project 1 - CRUD

### About
This project is a CRUD(Create, Read, Update and delete) application.<br>
Was used the collection Map to save the data in memory and 
the GUI was developed using Java Swing.

#### Run the [project](https://replit.com/@MaxFideles/Project1) online.


###  Pattern used
Data Access Object (or DAO) pattern:
- separates a data resource's client interface from its data access mechanisms
- adapts a specific data resource's access API to a generic client interface

### Class Diagram

<img width="800" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/53dcbe1a-79d3-406a-bf8d-04ee5aa7c2ca">

<br>

The DAO Design Pattern is used to separate the data persistence
logic in a separate layer. This way, the service remains 
completely in dark about how the low-level operations to
access the database is done. This is known as the principle 
of Separation of Logic.<br>
On this project the data persistence logic was defined in
**ClienteMapDAO** class.
