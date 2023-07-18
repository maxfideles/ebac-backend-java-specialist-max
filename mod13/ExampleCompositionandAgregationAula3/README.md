# Composition and Aggregation

### Composition

When an object need that other created object to exist.<br>
In the [example]() below using the UML diagram, it's just possible to
create the object **_Venda_** (Check out an order) if already exists 
**_Produto_** (Product), **_Vendedor_** (Seller) and 
**_Comprador_** (Buyer) objects.

<img width="738" alt="image" src="https://github.com/maxfideles/tarefas-ebac-max/assets/61297641/cede0110-bfff-4f9a-b177-9d77ed2ff0f8"> <br>

The object **_Venda_** is a composition of (**_Produto_**, **_Vendedor_** and **_Comprador_**)
but not the opposite. It means that, if the object **_Venda_** is deleted for any reason, the others
objects will continue existing.