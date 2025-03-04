import java.util.ArrayList;

public class Student {
    private static int totalStudents = 0;
    private int id;
    private String name;
    private int age;
    private final ArrayList<Course> courses;

    public Student(String name, int age) {
        totalStudents++;
        this.id = totalStudents;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollCourse(Course course) {
        course.addStudent(this);
        addCourse(course);
    }
}
