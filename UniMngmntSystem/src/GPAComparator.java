import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.GPA,o2.GPA);
    }
}
