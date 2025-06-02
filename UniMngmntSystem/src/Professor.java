import java.util.ArrayList;
import java.util.List;

public class Professor extends Person implements Payable {
    String department;
    int salary;

    public Professor(String name, String mail, String id, String department, int salary) {
        super(name, mail, id);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return this.salary;
    }
    // getSalary is not used.
    @Override
    public void getRoleDescription() {
        System.out.println("Role: " + "ordinary professor");
    }



}
