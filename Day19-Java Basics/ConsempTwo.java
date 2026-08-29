public class ConsempTwo {
    public static void main(String []args){
        EmployeeTwo emp1 = new EmployeeTwo("Janavi",101,29000);
        EmployeeTwo emp2 = new EmployeeTwo("Sowjanya",102,50000);

        emp1.showDetails();
        System.out.println("Annual salary"+emp1.calculateSalary());
        emp1.raise(10);
        System.out.println("The salary after raise is:");
        emp1.showDetails();
        
        System.out.println();

        emp2.showDetails();
        System.out.println("Annual salary"+emp2.calculateSalary());
        emp2.raise(10);
        System.out.println("The salary after raise is:");
        emp2.showDetails();
    }
}