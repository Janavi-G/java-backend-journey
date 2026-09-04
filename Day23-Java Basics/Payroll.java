public class Payroll{
    public static void main(String []args){
        Employs[] emp = {new FTtime(29000),new PTtime(400),new Internship()};
        
       for( Employs e:emp){
        System.out.println("The income of the person is"+e.calsalary());
        }
}
}