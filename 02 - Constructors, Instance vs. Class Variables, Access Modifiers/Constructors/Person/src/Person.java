public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Default Person Constructor called!");
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person(Person p) {
        this.age = p.age;
        this.name = p.name;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
