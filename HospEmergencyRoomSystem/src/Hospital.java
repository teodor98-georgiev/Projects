public class Hospital {
    private PatientsPriorityQue queue;

    public Hospital() {
        queue = new PatientsPriorityQue();
    }

    public void admitPatient(String name, String condition, int priority) {
        queue.addPatient(new Patient(name, condition, priority));
    }

    public void treatNextPatient() {
        Patient p = queue.getNextPatient();
        if (p != null) {
            System.out.println("Treating patient: " + p);
        } else {
            System.out.println("No patients to treat.");
        }
    }
    public boolean hasPatients(){
        return !queue.isEmpty();
    }

}
