# Composition and Aggregation

### Aggregation

It's when an object need that other created object to exist.<br>
In the [example](https://github.com/maxfideles/tarefas-ebac-max/tree/main/mod13/ExampleCompositionandAgregationAula3/src/br/com/maxfideles/Agreggation) 
taken using the UML class diagram below, it's just possible to
create the object **_Venda_** (Check out an order) if already exists 
**_Produto_** (Product), **_Vendedor_** (Seller) and 
**_Comprador_** (Buyer) objects.

<img width="1201" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/e01112f7-4297-427f-b3af-530bfa912ae3">


### Composition

It's when the object does not need of other(s) to be created, but when 
it is deleted, it deletes all the others objects related.</br>
In the [example](https://github.com/maxfideles/tarefas-ebac-max/tree/main/mod13/ExampleCompositionandAgregationAula3/src/br/com/maxfideles/Composition) 
taken using the UML class diagram below, it's just possible to create 
the **_ContaCorrente_** (checkingAccount) and **_Poupanca_**(savingAccount) 
if the **_Banco_**(Bank) already exist. If the bank is deleted,
all the accounts related to that bank will be also excluded.

<img width="1201" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/4b55faf7-89b7-4085-aabe-bdca0816f770">

