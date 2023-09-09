import java.util.Comparator;
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


        //Intermediate operation - Sorted()
        Stream<Person> personAge = people.stream()
                .sorted(Comparator.comparing(Person::getAge));

        //having an ordination after applying a filter
        Stream<Person> personNatAge = people.stream()
                .filter(person -> person.getNationality().equals("Brazilian"))
                .sorted(Comparator.comparing(Person::getAge));

        //Intermediate operation - Distinct()
        Stream<Person> personDis= people.stream()
                .distinct();

        //Intermediate operation - Limit()
        Stream<Person> personLimit = people.stream()
                .limit(2);



    }
}
