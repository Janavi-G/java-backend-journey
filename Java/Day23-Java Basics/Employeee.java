public class Employeee {
    String name;
    int id;
    double salary;

    Employeee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayemp(){
        System.out.println("Employee "+name);
        System.out.println("Id "+id);
        System.out.println("Salary"+salary);
    }
}