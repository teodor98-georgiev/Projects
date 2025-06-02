public class Main {
    public static void main(String[] args) {
        //Design a system to manage university courses, professors, and students,
        // using various object-oriented programming principles and Java collections.
        // Create the system
        UniversitySystem university = new UniversitySystem();

        // Create Professors
        Professor prof1 = new Professor("Dr. Alice Smith", "P001", "alice@uni.edu", "Computer Science", 90000);
        Professor prof2 = new Professor("Dr. Bob Johnson", "P002", "bob@uni.edu", "Mathematics", 85000);

        university.addProfessor(prof1);
        university.addProfessor(prof2);

        // Create Courses
        Course cs101 = new Course("CS101", "Intro to Programming", "P001");
        Course math201 = new Course("MATH201", "Calculus I", "P002");

        university.addCourse(cs101);
        university.addCourse(math201);

        // Create Students
        Student s1 = new Student("John Doe", "S001", "john@uni.edu", "Computer Science", 3.8);
        Student s2 = new Student("Jane Roe", "S002", "jane@uni.edu", "Mathematics", 3.6);
        Student s3 = new Student("Sam Brown", "S003", "sam@uni.edu", "Physics", 3.9);
        Student s4 = new Student("Lisa White", "S004", "lisa@uni.edu", "Computer Science", 3.7);

        university.addStudent(s1);
        university.addStudent(s2);
        university.addStudent(s3);
        university.addStudent(s4);



        // Display students sorted by GPA (descending)
        System.out.println("All Students Sorted by GPA:");
        university.printAllStudentsSortedByGPA();

        // Display top 2 students
        System.out.println("\nTop 2 Students:");
        university.printTopNStudents(2);
    }
}