public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.admitPatient("Alice", "Broken leg", 4);
        hospital.admitPatient("Bob", "Chest pain", 1);
        hospital.admitPatient("Charlie", "Headache", 5);

        while (hospital.hasPatients()) {
            hospital.treatNextPatient();
        }
    }
}