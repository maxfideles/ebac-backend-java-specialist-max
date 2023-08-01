import java.util.Scanner;

public class Rent implements IRent{


    @Override
    public void rent() {
        rentProcess();
    }

    private void rentProcess() {
       Habitation choice = checkType();
       checkUser();
       choice.summary();
    }

    private void checkUser() {
        System.out.println("\nNew User. Welcome to renting!");
    }

    private Habitation checkType() {
        Scanner s = new Scanner(System.in);
        Habitation choice;
        System.out.println("Choose what you would like to rent: \n1- Apartment \n2- Home");
        String opt = s.nextLine();
        switch (opt) {
            case "1" ->  choice = new Apartment();
            case "2" -> choice  = new Home();
            default -> throw new IllegalArgumentException("Option not Valid!");
        }

        return choice;

    }
}
