public class Manager extends Employee {
    public Manager(String employeeId, String department, double salary) {
        super(employeeId, department, salary);
    }

    public void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department Name: " + department);
        System.out.println("Salary: " + getSalary());
    }
}
