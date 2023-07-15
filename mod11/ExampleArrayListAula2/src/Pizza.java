public class Pizza implements Comparable <Pizza> {


    private String name;
    private String size;
    private float price;


    /**
     * Constructor
     * @param name Pizza's name
     * @param size Pizza's size
     * @param price Pizza's price
     */
    public  Pizza(String name, String size, float price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    /**
     * Convert the object to String
     * @return The value(s) as String
     */

    public String toString() {
        return "("+this.name+", "+this.size+", "+this.price+")";
    }

    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public float getPrice(){
        return price;
    }

    /**
     * Used to compare the objects and check if they are equal
     * @param pizza the object to be compared.
     *
     */

    public int compareTo(Pizza pizza) {
        return this.name.compareTo(pizza.getName());
    }


}
