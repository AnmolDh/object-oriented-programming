import java.util.ArrayList;

public class Professor {
    private String name;
    private String dept;
    private final ArrayList<Course> teaches;

    public Professor(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.teaches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public ArrayList<Course> getCourses() {
        return teaches;
    }
    public void addCourse(Course course) {
        teaches.add(course);
    }

    public void assignProfessor(Course course) {
        course.setProfessor(this);
        addCourse(course);
    }
}
