import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new Person().populatePerson();

        // .max get the maximum and .min get the minimum value
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //another way
        Optional<Person> personOpt = people.stream()
                .max(Comparator.comparing(Person::getAge));
        personOpt.ifPresent(System.out::println);


    }
}
