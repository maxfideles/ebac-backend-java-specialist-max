public class Main {

    public static void main(String[] args) {
        Car car1 = new LuxuryCar("Civic");
        Car car2 = new SedanCar("Corola");

        car1.register(car1);
        car2.register(car2);

    }



}
