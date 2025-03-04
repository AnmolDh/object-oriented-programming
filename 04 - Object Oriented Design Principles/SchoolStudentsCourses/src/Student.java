import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private final ArrayList<Course> courses;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public ArrayList<Course> getCourses() {
        return courses;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void addCourse(Course course) {
        courses.add(course);
    }

    public static void enroll(Student student, Course course) {
        student.addCourse(course);
        course.addStudent(student);
    }

    public void displayEnrolledCourses() {
        for (Course course : courses) {
            course.display();
        }
        System.out.println();
    }

    public void display() {
        System.out.println("STUDENT DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Courses Enrolled: " + courses.size());
    }
}
