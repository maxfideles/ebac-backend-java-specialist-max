import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p><b>Set</b> it's an interface that doesn't allow elements duplicated.</p>
 * @author maxfideles
 */

public class Main {

    public static void main(String[] args) {
        setWrapper();
        setObject();
    }

    /**
     * Example of the <b>Interface Set</b> using <b>HashSet</b> and <b>TreeSet</b> with a Wrapper.<p></p>
     * <b>HashSet</b> - The elements are <b>unique</b>, but the <b>order is random</b>.(Faster)<p></p>
     * <b>TreeSet</b> - The elements are <b>unique</b> and there is a  <b>natural order</b>.(Slower)<p></p>
     * To compare to the Set use using objects, see {@link #setObject()} () setObject()}.
     * @author maxfideles
     */
    public static void setWrapper(){
        System.out.println("Example using Wrapper:");
        Set<String> names = new HashSet<>();
        Set<String> names1 = new TreeSet<>();

        names.add("Gabriel");
        names.add("Max");
        names.add("Joana");
        names.add("Max");
        names.add("Gabriel");
        names.add("Max");
        names.add("Joana");
        names.add("Max");

        names1.add("Gabriel");
        names1.add("Max");
        names1.add("Joana");
        names1.add("Max");
        names1.add("Gabriel");
        names1.add("Max");
        names1.add("Joana");
        names1.add("Max");

        System.out.println("HashSet:");
        System.out.println(names);
        System.out.println("TreeSet:");
        System.out.println(names1);


    }
    /**
     * Example of the <b>Interface Set</b> using <b>HashSet</b> and <b>TreeSet</b> using objects.<p></p>
     * <b>HashSet</b> - The elements are <b>unique</b>, but the <b>order is random</b>.(Faster)<p></p>
     * <b>TreeSet</b> - The elements are <b>unique</b> and there is a  <b>natural order</b>.(Slower)<p></p>
     *
     * To compare to the Set use using wrappers, see {@link #setWrapper() setWrapper()}.
     *
     * @author maxfideles
     */
    public static void setObject(){

        System.out.println("\nExample using Object:");

        //Creating Interface Set with Student type.
        Set<Student> students = new HashSet<>();


        //Instancing new Students objects;
        Student student1 = new Student("Gabriel","UX",1);
        Student student2 = new Student("Max","UI",2);
        Student student3 = new Student("Maria","Design",3);
        Student student4 = new Student("Gabriel","UX",4);
        Student student5 = new Student("Gabriel","UX",1);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);



        //As the students contains Student objects (not only wrappers as setWrapper,
        // it's needed to add two things in the class Student:
        //  - Implement the  equals() and hasCode() to be able to sort;
        //  - The function toString()  to print it out.
        //
        System.out.println(students);

    }
}
