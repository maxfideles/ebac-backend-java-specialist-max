# Composition and Aggregation

### Aggregation

It's when an object need that other created object to exist.<br>
In the [example](https://github.com/maxfideles/tarefas-ebac-max/tree/main/mod13/ExampleCompositionandAgregationAula3/src/br/com/maxfideles/Agreggation) 
taken using the UML class diagram below, it's just possible to
create the object **_Venda_** (Check out an order) if already exists 
**_Produto_** (Product), **_Vendedor_** (Seller) and 
**_Comprador_** (Buyer) objects.

![Composicao](https://lucid.app/publicSegments/view/c8ef4597-83df-440c-bc09-44dc29622c95/image.png)


### Composition

It's when the object does not need of other(s) to be created, but when 
it is deleted, it deletes all the others objects related.</br>
In the [example](https://github.com/maxfideles/tarefas-ebac-max/tree/main/mod13/ExampleCompositionandAgregationAula3/src/br/com/maxfideles/Composition) 
taken using the UML class diagram below, it's just possible to create 
the **_ContaCorrente_** (checkingAccount) and **_Poupanca_**(savingAccount) 
if the **_Banco_**(Bank) already exist. If the bank is deleted,
all the accounts related to that bank will be also excluded.


![Composicao](https://lucid.app/publicSegments/view/a200efb0-659e-4499-a995-f4151ea55fe8/image.png)
