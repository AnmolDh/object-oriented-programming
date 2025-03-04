import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private final ArrayList<Student> students;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayEnrolledStudents() {
        for (Student student : students) {
            student.display();
        }
        System.out.println();
    }

    public void display() {
        System.out.println("COURSE DETAILS");
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Students Count: " + students.size());
    }
}
