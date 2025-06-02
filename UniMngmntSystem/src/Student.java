import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Comparable<Student>{
    String major;
    double GPA;

    public Student(String name, String mail, String id, String major, double GPA) {
        super(name, mail, id);
        this.major = major;
        this.GPA = GPA;
    }

    @Override
    public void getRoleDescription() {
        System.out.println("Role: "+ "student");
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.GPA, this.GPA);
    }
}
