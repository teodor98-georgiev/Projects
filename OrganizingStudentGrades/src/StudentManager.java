import java.util.*;

public class StudentManager implements Sortable{

    public List<Student> students;

    public StudentManager(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    @Override
    public void sortByAvgGrade() {
        Collections.sort(students, new avgGradeComp());
        for (Student student : students) {
            System.out.println(student.getFullName() + ": " + student.getAvgGrade());
        }
    }

    @Override
    public void groupStudentsByGradeRange() {
        Map<String, List<Student>> groupedStudents = new HashMap<>(); // String range(A-D)


        for (Student student : students){
            double avGrade = student.getAvgGrade();
            if (student.getAvgGrade() <= 10 && student.getAvgGrade() >= 9.0){
                String rangeLetter = "";
                rangeLetter = rangeLetter + "A";
                if (groupedStudents.containsKey(rangeLetter)){
                    groupedStudents.get(rangeLetter).add(student);
                }
                else {
                    List<Student> studentList = new ArrayList<>();
                    studentList.add(student);
                    groupedStudents.put(rangeLetter,studentList);
                }
            }
            else if (student.getAvgGrade() <= 8.99 && student.getAvgGrade() >= 7.0){
                String rangeLetter = "";
                rangeLetter = rangeLetter + "B";
                if (groupedStudents.containsKey(rangeLetter)){
                    groupedStudents.get(rangeLetter).add(student);
                }
                else {
                    List<Student> studentList = new ArrayList<>();
                    studentList.add(student);
                    groupedStudents.put(rangeLetter,studentList);
                }
            }
            else if (student.getAvgGrade() <= 6.99 && student.getAvgGrade() >= 5.0){
                String rangeLetter = "";
                rangeLetter = rangeLetter + "C";
                if (groupedStudents.containsKey(rangeLetter)){
                    groupedStudents.get(rangeLetter).add(student);
                }
                else {
                    List<Student> studentList = new ArrayList<>();
                    studentList.add(student);
                    groupedStudents.put(rangeLetter,studentList);
                }
            }
            else if (student.getAvgGrade() < 4.99 && student.getAvgGrade() > 3.0){
                String rangeLetter = "";
                rangeLetter = rangeLetter + "D";
                if (groupedStudents.containsKey(rangeLetter)){
                    groupedStudents.get(rangeLetter).add(student);
                }
                else {
                    List<Student> studentList = new ArrayList<>();
                    studentList.add(student);
                    groupedStudents.put(rangeLetter,studentList);
                }
            }
            else {
                System.out.println("student not classificable");
            }

        }
        for (Map.Entry<String, List<Student>> entry : groupedStudents.entrySet()) {
            for (Student student : entry.getValue()) {
                System.out.println(entry.getKey() + " " + student.getFullName());
            }
        }

    }


}
