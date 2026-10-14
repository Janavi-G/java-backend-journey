public class EmployeeTwo {
    String name;
    int id;
    double salary;

    EmployeeTwo(String name,int id,double salary){
        this.name =name;
        this.id = id;
        this.salary = salary;
    }
    
    void showDetails(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
    
    double calculateSalary(){
        return salary*12;
    }

    void raise(double percentage){
        salary +=salary*(percentage/100);
        // return salary;
    }

}