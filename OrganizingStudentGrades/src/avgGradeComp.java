import java.util.Comparator;

public class avgGradeComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAvgGrade(), o2.getAvgGrade());
    }
}
