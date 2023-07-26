public class CarLuxury implements ICar{
    @Override
    public void createCar(String carModel) {

        switch (carModel){
            case "1" -> System.out.println("BMW i7 created successfully!");
            case "2" -> System.out.println("Mercedes-Benz EQS created successfully!");
            case "3" -> System.out.println("Audi Q8 created successfully!");
            default -> throw new IllegalArgumentException("We don't have this car model.");
        }

    }
}
