public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Akash", "Software Engineer");
        Employee emp2 = new Employee(2, "None", "Manager");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}