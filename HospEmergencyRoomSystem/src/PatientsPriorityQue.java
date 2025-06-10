
import java.util.PriorityQueue;
import java.util.Queue;
// clas has been renamed from PriorityQueue to PatientsPriorityEcc
public class PatientsPriorityQue {
    Queue<Patient> patientsByPriority;

    // tech note, priorityQue in general sorts elements via natural order, it doesn't work like
    // nameOfList.sort(new comparator class), BUT, to keep elements sorted in this case by priority
    // PriorityQueue must "see" CompareByPriority, how ?  as by documentation, in its constructor I pass
    // the class comparator object.
    public PatientsPriorityQue() {
        patientsByPriority = new PriorityQueue<>(new CompareByPriority());
    }

    public void addPatient(Patient p){
        patientsByPriority.add(p);
    }
    public Patient getNextPatient(){
        return patientsByPriority.poll();
    }
    public boolean isEmpty(){
        return patientsByPriority.isEmpty();
    }

}
