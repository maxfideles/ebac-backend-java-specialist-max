import java.util.*;

public class Main {



    public static void main(String[] args) {

        FirstPartExercise();
        SecondPartExercise();

    }


    public  static void FirstPartExercise() {
        Scanner s = new Scanner(System.in);
        List<String> namesList = new ArrayList<>();
        String names;

        System.out.println("Exercise First Part");
        System.out.println("\nEnter a list of names separated by comma: ");
        names = s.nextLine();
        String[] namesArray = names.split(",");

        namesList = Arrays.asList(namesArray);

        Collections.sort(namesList);
        System.out.println("Names added to the list:");
        for(String name: namesList) {
            System.out.println(name);
        }

        System.out.println("\n======================");
    }

    public static  void SecondPartExercise(){
        Scanner s = new Scanner(System.in);
        String names;

       // List<String> namesGenders = new ArrayList<>();
        List<String> females = new ArrayList<>();
        List<String> males = new ArrayList<>();

        System.out.println("Exercise Second Part");
        System.out.println("\nEnter a list of names with genders: (E.g: Ana-F,Alex-M)" );
        names = s.nextLine();
        String[] namesArray = names.split(",");

        for(int i=0; i < namesArray.length ;i++){
            if(namesArray[i].contains("F")){
                females.add(namesArray[i].replace("-F",""));
            }else{
                males.add(namesArray[i].replace("-M",""));
            }
        }


        Collections.sort(females);
        Collections.sort(males);

        System.out.println("\nThere are " + females.size() + " female names in the list:");
        System.out.println(females);
        System.out.println("\nThere are " + males.size() + " male names in the list:");
        System.out.println(males);
    }

    }

