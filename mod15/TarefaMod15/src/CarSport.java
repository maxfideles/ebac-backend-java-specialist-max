public class CarSport implements ICar{

    @Override
    public void createCar(String carModel) {
        switch (carModel){
            case "1" -> System.out.println("Porsche 718 Cayman created successfully!");
            case "2" -> System.out.println("Ford Mustang created successfully!");
            case "3" -> System.out.println("Mercedes-AMG GT created successfully!");
            default -> throw new IllegalArgumentException("Sorry, We don't have this car model.");
        }

    }
}
