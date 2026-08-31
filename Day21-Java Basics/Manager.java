public class Manager extends EmployeeM {

    Manager(String name, double salary) {
        super(name,salary);
    }
    
    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }
}