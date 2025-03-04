import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private final ArrayList<Student> students;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public ArrayList<Student> getStudents() {
        return students;
    }


    public void display() {
        System.out.println("SCHOOL DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Students Count: " + students.size());
    }
}
