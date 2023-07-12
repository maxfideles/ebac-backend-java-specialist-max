public class Main {
    public static void main (String [] args){
        Pizza pizza = new Pizza();

        pizza.setSize("Big");
        pizza.setName("Margherita");
        pizza.setPrice(15);
        pizza.setType("Homemade");
        float checkoutPrice = pizza.checkout(3);
       System.out.println("Order Summary");
       System.out.println("-------------");
       System.out.println("Pizza: " + pizza.getName());
       System.out.println("Size: " + pizza.getSize());
       System.out.println("Type: " + pizza.getType());
       System.out.println("Price: €" + pizza.getPrice()+ "\n" + "-------------") ;
       System.out.println("Total: €" + checkoutPrice+ "\n\n" + "Thanks for choosing us");

    }
}
