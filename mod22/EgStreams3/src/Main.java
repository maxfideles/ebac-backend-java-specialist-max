import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new Person().populatePerson();

        //Terminal Operation - forEach()
        //adding an Intermediate Stream Operation
        Stream<Person> personName = people.stream()
                //Filtering Brazilians only
                .filter(person -> person.getNationality().equals("Brazilian"));
        //Using a Terminal Stream Operation
                //Printing out all of them
                personName.forEach(person -> System.out.println(person.getName()));
        //Another way
            people.stream()
                    //Sorting by Name
                    .sorted(Comparator.comparing(Person::getName))
                    //Printing out all of them
                    .forEach(person -> System.out.println(person.getName()));

        //Terminal Operation - count()
        //Counting the total elements in the list
        long count = people.stream()
                .count();
        System.out.println(count);

        //Counting the number of elements with name starting with "G"
        long count2 = people.stream()
                .filter(person -> person.getName().startsWith("G"))
                .count();
        System.out.println("Number of elements with name starting with G: " + count2);

        //Terminal Operation - allMatch()
        Boolean boll = people.stream()
                .allMatch(person -> person.getNationality().equals("Brazilian"));
        System.out.println(boll);

        //Terminal Operation - collect()
        List<Person> personWT = people.stream()
                .filter(p -> p.getName().startsWith("H"))
                //Creating a new List from the Stream
                .toList(); // or .collect(Collectors.toList())

        personWT.forEach(i->System.out.println(i.getName()));

        ArrayList<Person> personArrayList = people.stream()
                .filter(person -> person.getNationality().equals("Brazilian"))
                //Creating a new ArrayList from the Stream
                .collect(Collectors.toCollection(ArrayList::new));
        personArrayList.forEach(i->System.out.println(i.getName()));

        Map<String,Person> personMap = people.stream()
                //Creating a new Map from the Stream
                .collect(Collectors.toMap(Person::getName,Person::new));
        personMap.forEach((k,v) -> System.out.println(v.getName()));

        Map<String, List<Person>> natGroup = people.stream()
                //Creating a new Map and grouping by Nationality
                .collect(Collectors.groupingBy(Person::getNationality));
        natGroup.forEach((k,v) -> System.out.println(k + v));

    }
}
