import java.util.ArrayList;

public class Course {
    private String name;
    private final ArrayList<Student> students;
    private Professor professor;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public void addStudent(Student student) {
        students.add(student);
    }

}
