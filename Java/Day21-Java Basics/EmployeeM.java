public class EmployeeM {
    String name;
    double salary;

    EmployeeM(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void work() {
        System.out.println("Employee is working");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}