import java.util.List;

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

    public List<Person> populatePerson(){

        Person person1 = new Person("1","Gabriel","Brazilian",22);
        Person person2 = new Person("2","Tuppy","British",25);
        Person person3 = new Person("3","Giusepe","Italian",34);


        return List.of(person1,person2,person3);
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
