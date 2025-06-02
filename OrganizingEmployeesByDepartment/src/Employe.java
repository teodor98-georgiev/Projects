public class Employe extends Person implements Comparable<Employe> {
    String employeId;
    String department;
    int yearsOfExperience;
    String role;

    public Employe(String name, int age, String employeId, String department, int yearsOfExperience, String role) {
        super(name, age);
        this.employeId = employeId;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.role = role;
    }

    @Override
    public String getRole() {
        return department;
    }

    @Override
    public int compareTo(Employe o) {
        return Integer.compare(this.yearsOfExperience, o.yearsOfExperience);
    }
    @Override
    public String toString(){
        return name;
    }
}
