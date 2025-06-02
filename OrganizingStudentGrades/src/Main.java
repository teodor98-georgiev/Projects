import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // You are tasked with building a student management system for a university. The system needs to handle student data,
        // including their grades, and provide flexible sorting and grouping capabilities using a HashMap. The goal is to
        // structure the program in a way that demonstrates strong OOP principles, including classes, abstract classes,
        // and interfaces.

        // Base Abstract Class (Person):
        //
        //Create an abstract base class Person with common attributes like name, surname, and id.
        //
        //Include an abstract method getFullName() that returns the full name of the person.
        //
        //Concrete Class (Student):
        //
        //Extend the Person class with a concrete class Student.
        //
        //Add attributes for major, year, and a HashMap<String, Integer> for storing course grades.
        //
        //Implement the getFullName() method to return the student's full name.
        //
        //Add methods to:
        //
        //Add a grade to a course.
        //
        //Remove a grade from a course.
        //
        //Get the average grade.
        //
        //Get a sorted list of courses based on grade.
        //
        //Interface (Sortable):
        //
        //Create an interface Sortable that defines methods for sorting and grouping.
        //
        //Include methods like:
        //
        //sortByGrade()
        //
        //groupByGradeRange()
        //
        //groupByMajor()
        //
        //Utility Class (StudentManager):
        //
        //Implement a StudentManager class that implements the Sortable interface.
        //
        //Store a collection of Student objects.
        //
        //Provide methods to:
        //
        //Add and remove students.
        //
        //Sort students by their average grade.
        //
        //Group students by specific grade ranges (e.g., A, B, C, D).
        //
        //Group students by their majors.
        //
        //Testing and Use Cases:
        //
        //Create a small driver program to:
        //
        //Add a few students with different majors and grades.
        //
        //Sort them by average grades.
        //
        //Group them by their major and print the result.
        //
        //Group them by grade range.
        //
        //Additional Challenges (Optional):
        //
        //Implement a comparator to sort students by different criteria (e.g., name, year).
        //
        //Add functionality for updating grades.

         //Create some students
        HashMap<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 8);
        grades1.put("Physics", 9);
        grades1.put("Chemistry", 7);

        HashMap<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 9);
        grades2.put("Physics", 10);
        grades2.put("Chemistry", 6);

        HashMap<String, Integer> grades3 = new HashMap<>();
        grades3.put("Math", 5);
        grades3.put("Physics", 6);
        grades3.put("Chemistry", 4);

        Student s1 = new Student("John", "Doe", "123", "Engineering", 2, grades1);
        Student s2 = new Student("Jane", "Smith", "456", "Engineering", 3, grades2);
        Student s3 = new Student("Alice", "Brown", "789", "Biology", 1, grades3);

        // Create StudentManager and add students
        //List<Student> studentList = new ArrayList<>();
        StudentManager manager = new StudentManager(new ArrayList<>());
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        // Test sorting
        System.out.println("\nSorted by Average Grade:");
        manager.sortByAvgGrade();

        // Test grouping by grade range
        System.out.println("\nGrouped by Grade Range:");
        manager.groupStudentsByGradeRange();
    }
}