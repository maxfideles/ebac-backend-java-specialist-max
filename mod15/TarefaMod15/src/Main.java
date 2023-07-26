import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BaseCarFactory carFactory;


        System.out.println("Select your type of car: \n1- Luxury \n2- Sedan \n3- Sport");
        String carType = s.nextLine();


        switch (carType){
            case "1" ->  carFactory = new CarLuxuryFactory();
            case "2" -> carFactory = new CarSedanFactory();
            case "3" -> carFactory = new CarSportFactory();
            default -> throw new IllegalArgumentException("Error! Please, select among the car types presented to you!");

        }

        carFactory.setCarModel();


    }
}
