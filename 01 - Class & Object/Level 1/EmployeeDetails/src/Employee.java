public class Employee {
    private final int ID;
    private String name;
    private double salary;

    public Employee(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("ID: " + ID + "\nName: " + name + "\nSalary: " + salary);
    }
}
