public class LuxuryCar <T extends Car> extends Car{

    public LuxuryCar(String name) {
        super(name);
    }

    @Override
    void register(Car newCar) {
        super.cars.add(newCar);
        System.out.println("Luxury Car Registered!");
        //toString();
    }


}
