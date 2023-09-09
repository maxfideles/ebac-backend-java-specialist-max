import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        //Intermediate operation - Filter()
        List<Person> people = new Person().populatePerson();

        Predicate<Person> pred = person -> person.getNationality().equals("Brazilian");
        Stream<Person> personNat1 = people.stream().filter(pred);

        //Another way shorter (Recommended)
        Stream<Person> personNat = people.stream()
                .filter(person -> person.getNationality().equals("Brazilian"));


        //Intermediate operation - Map()
        Stream<String> personName = people.stream()
                .filter(person -> person.getNationality().equals("British"))
                .map(Person::getName);

    }
}
