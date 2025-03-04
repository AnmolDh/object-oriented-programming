import java.util.ArrayList;

public class Doctor {
    private String doctorName;
    private String doctorSpecialty;
    private final ArrayList<Patient> patients;

    public Doctor(String doctorName, String doctorSpecialty) {
        this.doctorName = doctorName;
        this.doctorSpecialty = doctorSpecialty;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDoctorSpecialty() {
        return doctorSpecialty;
    }
    public void setDoctorSpecialty(String doctorSpecialty) {
        this.doctorSpecialty = doctorSpecialty;
    }
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this);
    }
}
