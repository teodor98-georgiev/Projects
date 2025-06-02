import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniversitySystem {
    HashMap<String, Professor> professors = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, Course> courses = new HashMap<>();

    public void addProfessor(Professor professor){
        professors.put(professor.getId(), professor);
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
    }

    public void addCourse(Course course){
        courses.put(course.getCourseId(), course);
    }

//    public void enrollStudent(String studentId, String courseId){
//
//    }

    public void printAllStudentsSortedByGPA(){
        List<Student> StudentsList = new ArrayList<>(students.values());
        StudentsList.sort(new GPAComparator());
        for (Student student : StudentsList){
            System.out.println(student.getName() + " GPA: " + student.GPA);
        }
    }

    public void printTopNStudents(int n){
        List<Student> StudentsList = new ArrayList<>(students.values());
        StudentsList.sort(new GPAComparator());
        for (int i = 0; i < n; i++){
            System.out.println(StudentsList.get(i).getName() + " GPA: " + StudentsList.get(i).GPA);
        }
    }
}
