public class challengefour {
    public static void main(String []args){
     Salary[] sal = {new fulltime(1000000),new parttime(40),new intern(10000)};   
        
   for(Salary s:sal){
    s.calsalary();
   }
    }
}