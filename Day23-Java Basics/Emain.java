public class Emain {
    public static void main(String []args){
        Employeee employee = new Employeee("Janavi",101,45000);
        Department dept = new Department("IT",employee);
   
        dept.displaydept();
    }
}