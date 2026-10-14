public class employeeefa {
    String name;
    int id;
    double salary;

    employeeefa(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name"+name);
        System.out.println("Id:"+id);
        System.out.println("Salary:"+salary);
    }
}