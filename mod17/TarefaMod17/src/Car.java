import java.util.ArrayList;
import java.util.List;

public abstract class Car <T>{

    private String name;
    private String carManufacturer;
    private int year;
    List<T> cars;

    public  Car(String name){

        this.cars = new ArrayList<>();
        this.name = name;
    }

    abstract void register(Car newCar);


    void print(){

       // for (T obj: this.cars){
            System.out.println(this.cars.toString());
        //}
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carManufacturer='" + carManufacturer + '\'' +
                ", year=" + year +
                ", cars=" + cars +
                '}';
    }

    public List<T> getCars() {
        return cars;
    }

    public void setCars(List<T> cars) {
        this.cars = cars;
    }
}
