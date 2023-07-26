public class CarSportFactory extends BaseCarFactory{
    @Override
    void setCarModel() {
        CarSport carSport = new CarSport();
        System.out.println("\nWelcome to the Sport Cars Factory ");
        System.out.println("Select your model: \n1- Porsche 718 Cayman \n2- Ford Mustang \n3- Mercedes-AMG GT");
        String carModel = s.nextLine();
        carSport.createCar(carModel);

    }
}
