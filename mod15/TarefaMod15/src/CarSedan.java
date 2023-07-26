public class CarSedan implements ICar{
    @Override
    public void createCar(String carModel) {

        switch (carModel){
            case "1" -> System.out.println("Toyota Camry created successfully!");
            case "2" -> System.out.println("Honda Civic created successfully!");
            case "3" -> System.out.println("Audi A4 created successfully!");
            default -> throw new IllegalArgumentException("Sorry, We don't have this car model.");
        }

    }
}
