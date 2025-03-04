public class Main {
    public static void main(String[] args) {
        Course maths = new Course("Maths");

        Professor p1 = new Professor("Jack", "DAM");

        Student s1 = new Student("Harry", 13);
        Student s2 = new Student("John", 22);

        s1.enrollCourse(maths);
        s2.enrollCourse(maths);

        p1.assignProfessor(maths);

        System.out.println(maths.getProfessor().getName());
    }
}