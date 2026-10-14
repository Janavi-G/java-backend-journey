public class Developer extends EmployeeM {

    Developer(String name, double salary) {
        super(name,salary);
    }
    @Override
    void work() {
        System.out.println("Developer is writing the code");
    }
}