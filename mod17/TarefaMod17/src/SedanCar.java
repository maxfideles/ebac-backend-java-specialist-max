public class SedanCar extends Car{


    public SedanCar(String name) {
        super(name);
    }

    @Override
    void register(Car newCar) {
        super.cars.add(newCar);
        System.out.println("Sedan Car Registered!");
    }

}
