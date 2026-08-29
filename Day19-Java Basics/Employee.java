public class Employee {
    String name;
    int id;
    double salary;
    String dept;
    double percentage;

    Employee(String name,int id,double salary,String dept){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.dept = dept;
    }
    void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("salary: "+salary);
        System.out.println("Department: "+dept);
    }

    double giveRaise(double percentage){
        salary += salary*(percentage/100);
        System.out.print("The increase in salary is:");
        showDetails();
        return salary;
    }
}