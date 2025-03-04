public class Main {
    public static void main(String[] args) {
        // School
        School dps = new School("Delhi Public School", "289, Delhi-6");

        // Courses
        Course english = new Course("English", "EN201");
        Course math = new Course("Math", "MA101");
        Course physics = new Course("Physics", "PH048");

        // Students
        Student s1 = new Student("Koki", 18);
        Student s2 = new Student("Simon", 18);
        Student s3 = new Student("Harry", 18);
        Student s4 = new Student("Hello", 18);


        // Add Students in School
        dps.addStudent(s1);
        dps.addStudent(s2);
        dps.addStudent(s3);
        dps.addStudent(s4);

        // Enroll Students in Courses
        Student.enroll(s1, english);
        Student.enroll(s1, physics);
        Student.enroll(s2, math);
        Student.enroll(s3, physics);
        Student.enroll(s4, english);
        Student.enroll(s4, math);


        // Display
        dps.display();
        System.out.println();
        math.display();
        System.out.println();
        s4.display();


        System.out.println("ENROLLED COURSES OF s1: ");
        s1.displayEnrolledCourses();
        System.out.println("ENROLLED STUDENTS IN Maths: ");
        math.displayEnrolledStudents();
    }
}