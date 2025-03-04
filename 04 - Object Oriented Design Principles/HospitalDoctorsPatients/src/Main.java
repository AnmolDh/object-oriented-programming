public class Main {
    public static void main(String[] args) {
        Hospital fortis = new Hospital("Fortis");

        Doctor ent = new Doctor("Harry", "ENT");
        Doctor cardiologist = new Doctor("John", "Cardiology");

        Patient p1 = new Patient("Jack", 30);
        Patient p2 = new Patient("Jane", 30);

        fortis.addDoctor(ent);
        fortis.addDoctor(cardiologist);
        fortis.addPatient(p1);
        fortis.addPatient(p2);

        ent.consult(p2);
        cardiologist.consult(p1);
        cardiologist.consult(p2);


        System.out.println("Total Number of Doctors in fortis: " + fortis.getDoctors().size());
        System.out.println("Total Number of Patients in fortis: " + fortis.getPatients().size());

        System.out.println("Cardiologist's Patients: ");
        for (Patient p : cardiologist.getPatients()) {
            System.out.println(p.getPatientName());
        }
    }
}