import java.util.ArrayList;

public class University {
    private String name;
    private final ArrayList<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
    public void addDepartment(String department) {
        departments.add(new Department(department));
    }

    public void addFaculty(String department, Faculty faculty) {
        for (Department d : departments) {
            if (d.getName().equals(department)) {
                d.addFaculty(faculty);
                return;
            }
        }
    }

    public void display(){
        System.out.println("University name: " + name);
        for (Department d : departments) {
            System.out.println("Department: " + d.getName());
        }
    }
}
