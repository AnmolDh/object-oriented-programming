import java.util.ArrayList;

public class Patient {
    private String patientName;
    private int age;
    private final ArrayList<Doctor> doctors;

    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }
}
