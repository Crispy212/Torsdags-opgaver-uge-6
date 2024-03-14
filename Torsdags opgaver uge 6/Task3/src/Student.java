import java.util.ArrayList;

public class Student extends Person {
    public Student(String name, ArrayList<String>passedCourse) {
        super(name);
        this.passedCourse=passedCourse;
        this.currentCourse=new ArrayList<>();
    }

    ArrayList<String>passedCourse = new ArrayList<>();
    ArrayList<String>currentCourse = new ArrayList<>();

    @Override
    public boolean addCourse(String course) {
        if (!passedCourse.contains(course)) {
            currentCourse.add(course);
            return true;
        }
        return false;
    }

}
