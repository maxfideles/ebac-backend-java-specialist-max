/**
 * @author maxvictor
 */
public class Pizza {

    //Pizza's size
    private String size;
    //Pizza's Price
    private float price;
    //Pizza's name
    private String name;
    //Pizza's Type. Can be homemade or frozen
    private  String type;



    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }

    public float getPrice(){
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    /**
     *
     * @param quant Receive the quantity the pizzas ordered
     * @return  The checkout price (float)
     */
    public float checkout(int quant){

        float finalPrice = quant * price;
        return finalPrice;
    }


}
