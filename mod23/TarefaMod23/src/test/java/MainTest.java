import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;


public class MainTest {

    public static final String NAME   = "Alana";
    public static final String GENDER = "Feminino";
    private static final List<Person> personList   = new ArrayList<>();

    @BeforeEach
    void setup(){
        populateList();
    }

    @Test
    void whenListReturnGenderFeminine(){
        List<Person> response = populateList();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Person.class,response.get(0).getClass());
        Assertions.assertEquals(GENDER,response.get(0).getGender());

    }

    @Test
    void whenListReturnGenderFeminineFailed(){
        List<Person> response = populateList();

        Assertions.assertNotNull(response);
        Assertions.assertEquals(Person.class,response.get(0).getClass());
        Assertions.assertNotEquals(GENDER,response.get(0).getGender());

    }

    public List<Person> populateList(){

        personList.add(new Person(NAME,GENDER));
        return personList;
    }
}
