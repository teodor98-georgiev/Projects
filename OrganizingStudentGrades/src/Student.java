import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person {
    String major;
    int year;
    HashMap<String, Integer> courseGrades;


    public Student(String name, String surname, String id, String major, int year, HashMap<String, Integer> courseGrades) {
        super(name, surname, id);
        this.major = major;
        this.year = year;
        this.courseGrades = courseGrades;
    }

    @Override
    public String getFullName() {
        return this.name + " " + this.surname;
    }

    public void addGrade(String course, int grade){
        courseGrades.put(course, grade);
    }
    public void removeGrade(String course){
        courseGrades.remove(course);
    }
    public double getAvgGrade(){
        int sumGrade = 0;
        int numberOfGrades = courseGrades.values().size();
        for (int grade : courseGrades.values()){
            sumGrade = sumGrade + grade;
        }
        double avgGrade = (double) sumGrade/numberOfGrades;
        return avgGrade;
    }

    public void sortCoursesByGrade(){
        // creating a list of entries to sort by grade courses using hashmap
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(courseGrades.entrySet());

        // sorting HashMap by the grade (ascending) via buble algorithm
        for (int i = 0; i < entryList.size(); i++) {
            for (int j = i + 1; j < entryList.size(); j++) {
                if (entryList.get(i).getValue() > entryList.get(j).getValue()) {
                    Map.Entry<String, Integer> temp = entryList.get(i);
                    entryList.set(i, entryList.get(j));
                    entryList.set(j, temp);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : courseGrades.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }

}
