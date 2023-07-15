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


    public String toString(){
        return this.name;
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
