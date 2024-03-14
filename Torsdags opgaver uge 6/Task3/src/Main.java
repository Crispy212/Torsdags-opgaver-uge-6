import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> passedCoursesStudent1 = new ArrayList<>();
        passedCoursesStudent1.add("Math");
        Student student1 = new Student("Alice", passedCoursesStudent1);
        persons.add(student1);

        ArrayList<String> passedCoursesStudent2 = new ArrayList<>();
        passedCoursesStudent2.add("Physics");
        passedCoursesStudent2.add("Chemistry");
        Student student2 = new Student("Bob", passedCoursesStudent2);
        persons.add(student2);

        ArrayList<String> canTeachTeacher1 = new ArrayList<>();
        canTeachTeacher1.add("Math");
        Teacher teacher1 = new Teacher("John", canTeachTeacher1);
        persons.add(teacher1);

        ArrayList<String> canTeachTeacher2 = new ArrayList<>();
        canTeachTeacher2.add("Physics");
        canTeachTeacher2.add("Chemistry");
        Teacher teacher2 = new Teacher("Jane", canTeachTeacher2);
        persons.add(teacher2);

        for (Person person : persons) {
            System.out.println("Name: " + person.getName());
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Passed Courses: " + student.passedCourse);
                System.out.println("Current Courses: " + student.currentCourse);
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Can Teach Courses: " + teacher.canTeach);
                //System.out.println("Current Courses: " + teacher.currentCourse);
            }
            System.out.println();
        }
    }

}