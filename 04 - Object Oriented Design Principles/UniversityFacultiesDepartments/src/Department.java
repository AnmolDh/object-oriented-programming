import java.util.ArrayList;

public class Department {
    private String name;
    private final ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        faculties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}
