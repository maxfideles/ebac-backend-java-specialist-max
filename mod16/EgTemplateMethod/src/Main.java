import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Worker profession;
        System.out.println("Select a profession to see its routine: \n1- FireFighter \n2- Lumberjack \n3- Manager \n4- Postman");
        String opt = s.nextLine();

        switch (opt){
            case "1" -> profession = new FireFighter();
            case "2" -> profession = new Lumberjack();
            case "3" -> profession = new Manager();
            case "4" -> profession = new Postman();
            default -> throw new IllegalArgumentException("Select an option from the list");
        }

      profession.executeRoutine();

    }
}
