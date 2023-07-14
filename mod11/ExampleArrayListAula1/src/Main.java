import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author maxvictor
 */
public class Main {

    public static void main (String [] args){
        String aux="";
        Scanner s = new Scanner(System.in);
        Lista list = new Lista();

        do{
            System.out.println("Insert a name to the list:");
            String name = s.nextLine();
            list.setListNames(name);

            System.out.println(name+" added!");
            System.out.println("Would you like to add another name to the list?");
            aux = s.nextLine();

        }while(aux.equalsIgnoreCase("y"));

        System.out.println("My I sort your list?");
        aux = s.nextLine();

        if (aux.equalsIgnoreCase("y")){
            list.sortList();
            System.out.println("Here is your list sorted!");
            System.out.println(list.getListNames());
        }else{
            System.out.println("Ok, here is your list!");
            System.out.println(list.getListNames());
        }


    }


}
