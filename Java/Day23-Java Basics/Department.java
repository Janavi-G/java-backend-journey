public class Department{
    String dept;
    Employeee employee;

    Department(String dept,Employeee employee){
        this.dept = dept;
        this.employee = employee;
    }

    void displaydept(){
        System.out.println("Department:"+dept);
        employee.displayemp();
    }
}