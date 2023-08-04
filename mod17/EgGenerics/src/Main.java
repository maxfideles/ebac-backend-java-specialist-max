import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        names.add("Max");
        names.add("Silva");
        //It's possible use a function with a List String type
        print(names);

        nums.add(4);
        nums.add(98);
        //As well as it's possible the same function with a List Integer type
        print(nums);

        //Then it's possible do the same through a Generic Method
        String firstName = catchFirst(names); //Returning a String
        System.out.println(firstName);

        Integer firstNumber = catchFirst(nums); // Returning an Integer
        System.out.println(firstNumber);


        // USing Generic Classes
        GenericClass<String,Integer> genClass = new GenericClass<>("Max",5);
        GenericClass<Double,String> genClass2 = new GenericClass<>(20.4d,"New York");
        System.out.println("\n=== Generic Classes ===");
        System.out.println("First Generic Class -  data: " + genClass.getData()+ " id: " +genClass.getId());
        System.out.println("Second Generic Class -  data: " + genClass2.getData()+ " id: " +genClass2.getId());


    }

    /**
     * The <b>< T ></b> is a Generic Type that receives
     * any type of list object.
     *
     * @param list  List of Objects to be printed out
     *
     */
    private static <T> void print(List<T> list){
        for(T obj: list){
            System.out.println(obj);
        }
    }


    /**
     * The <b>< T ></b> is a Generic Type that receives
     * any type of list object.
     *
     * @param list  List of Objects to be printed out
     * @return The first object in the list in accordance to the list object type received.
     */

    private static <T> T catchFirst(List <T> list){
        return list.get(0);

    }

}
