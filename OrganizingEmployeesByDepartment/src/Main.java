import java.util.*;

public class Main {
    public static void main(String[] args) {
        // You are building a simple HR management system. The system needs to store employees,
        // categorize them by their department,
        // and sort them by seniority (years of experience) within each department.
        List<Employe> employes = Arrays.asList(
                new Employe("Alice Johnson", 30, "E001", "Engineering", 6, "Developer"),
                new Employe("Bob Smith", 45, "E002", "Engineering", 20, "Manager"),
                new Employe("Clara Martinez", 28, "E003", "Marketing", 4, "Analyst"),
                new Employe("David Lee", 35, "E004", "HR", 10, "HR Manager"),
                new Employe("Eva Chen", 25, "E005", "Engineering", 2, "Intern"),
                new Employe("Frank Thompson", 40, "E006", "Marketing", 12, "Director"),
                new Employe("Grace Kim", 38, "E007", "HR", 15, "Recruiter"),
                new Employe("Henry Zhao", 33, "E008", "Sales", 9, "Sales Rep"),
                new Employe("Isla Patel", 29, "E009", "Sales", 6, "Sales Rep"),
                new Employe("Jack Nguyen", 32, "E010", "Marketing", 7, "Copywriter"));

        Map<String, List<Employe>> groupedEmployes = new HashMap<>();
        for (Employe em : employes){
            String depName = em.department;
            if (groupedEmployes.containsKey(depName)){
                groupedEmployes.get(depName).add(em);
            }
            else {
                List<Employe> employesList = new ArrayList<>();
                employesList.add(em);
                groupedEmployes.put(depName,employesList);
            }
        }
        // sorting employes by years of experience
        for (List<Employe> deptList : groupedEmployes.values()){
            Collections.sort(deptList);
        }
        for (Map.Entry<String, List<Employe>> entry : groupedEmployes.entrySet()){
            System.out.println("Department: " + entry.getKey() + " name: " + entry.getValue());
        }
    }
}