import java.util.List;
import java.util.Objects;

public class Person {

    private String id;
    private String name;
    private String nationality;
    private int age;

    public Person() {

    }

    public Person(String id, String name, String nationality, int age){
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public Person(Person person) {
        this(person.getId(),person.name,person.getNationality(),person.getAge());
    }


    public List<Person> populatePerson(){

        Person person1 = new Person("1","Gabriel","Brazilian",22);
        Person person2 = new Person("2","Tuppy","British",25);
        Person person3 = new Person("3","Giusepe","Italian",34);
        Person person4 = new Person("4","Helena","Brazilian",0);
        Person person5 = new Person("5", "Giovane","Italian",25);

        return List.of(person1,person2,person3,person4,person5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return  id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
