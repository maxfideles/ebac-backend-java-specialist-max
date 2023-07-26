public class CarLuxuryFactory extends BaseCarFactory{


    @Override
    void setCarModel() {
        CarLuxury carLuxury = new CarLuxury();
        System.out.println("\nWelcome to the Luxury Cars Factory ");
        System.out.println("Select your model: \n1- BMW i7 \n2- Mercedes-Benz EQS \n3- Audi Q8 ");
        String carModel = s.nextLine();

        carLuxury.createCar(carModel);

    }
}
