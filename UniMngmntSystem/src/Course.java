import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseId;
    String courseName;
    String professorId;

    public Course(String courseId, String courseName, String professorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.professorId = professorId;

    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessorId() {
        return professorId;
    }

}
