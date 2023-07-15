import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<Pizza> list = new ArrayList<Pizza>();

        Pizza pizza = new Pizza("Margherita","Big",12.5f);
        Pizza pizza2 = new Pizza("Calabresa","Small",17.5f);

        list.add(pizza);
        list.add(pizza2);
        System.out.println(list);

    }

}
