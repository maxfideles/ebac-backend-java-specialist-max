import java.util.Scanner;

public class CarSedanFactory extends BaseCarFactory{
    @Override
    void setCarModel() {

        CarSedan carSedan = new CarSedan();
        System.out.println("\nWelcome to the Sedan Cars Factory ");
        System.out.println("Select your model: \n1- Toyota Camry \n2- Honda Civic \n3- Audi A4");
        String carModel = s.nextLine();
        carSedan.createCar(carModel);

    }
}
