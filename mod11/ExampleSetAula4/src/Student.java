import java.util.Objects;

public class Student {

    private String name;
    private String course;
    private int idStudent;

    /**
     * Student object constructor.
     * @param name String
     * @param course String
     * @param idStudent int
     * @author maxfideles
     */
    public Student (String name, String course, int idStudent){
        this.name = name;
        this.course = course;
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idStudent == student.idStudent && Objects.equals(name, student.name) && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, idStudent);
    }

    public String toString(){
        return "{Name: " + this.name + " Course: " + this.course + " ID: " + this.idStudent +"}";
    }
    public String getName(){
        return this.name;
    }
    public String getCourse(){
        return this.course;
    }

    public int getIdStudent(){
        return this.idStudent;
    }
}
