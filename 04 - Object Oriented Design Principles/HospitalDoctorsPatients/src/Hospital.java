import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private final ArrayList<Patient> patients;
    private final ArrayList<Doctor> doctors;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}
