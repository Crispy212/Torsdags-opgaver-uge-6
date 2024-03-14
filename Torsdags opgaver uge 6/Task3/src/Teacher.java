import java.util.ArrayList;

public class Teacher extends Person{
    public Teacher(String name, ArrayList<String>canTeach) {
        super(name);
        this.canTeach=canTeach;
        this.curretnCourse=new ArrayList<>();


    }

    ArrayList<String> canTeach = new ArrayList<>();
    ArrayList<String> curretnCourse = new ArrayList<>();

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            curretnCourse.add(course);
            return true;
        }
        return false;
    }

}
