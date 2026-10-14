public class MainPerson {
    public static void main(String [] args){
        //super = refers to the parent class (subclass <- superclass)
        //used in constructors and method overriding
        //calls the parent constructor to initalize attributes
         
        // Person person = new Person("Janavi","Gandikota");
        StudentPerson stu = new StudentPerson("Sowjanya","Gandikota",9.8);
        Emp emp1 = new Emp("Rahul","Kapadia",50000);
        // stu.showName();
        // person.showName();
        System.out.println(stu.gpa);
        emp1.showSalary();
        stu.showGPA();
    }
}