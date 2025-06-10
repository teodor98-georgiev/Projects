import java.util.Comparator;

public class CompareByPriority implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o1.getPriority(),o2.getPriority());
    }
}
