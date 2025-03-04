public class Main {
    public static void main(String[] args) {
        University chitkara = new University("Chitkara");

        chitkara.addDepartment("CSE");
        chitkara.addDepartment("ECE");
        chitkara.addDepartment("MBA");

        Faculty f1 = new Faculty("Harry");
        Faculty f2 = new Faculty("Simon");
        Faculty f3 = new Faculty("Jack");

        chitkara.addFaculty("MBA", f1);
        chitkara.addFaculty("ECE", f2);
        chitkara.addFaculty("CSE", f3);


        chitkara.display();
    }
}