public class Main {
    public static void main(String[] args) {
        Person p = new Person("Anmol", 21);
        Person p2 = new Person(p);

        p2.display();
    }
}