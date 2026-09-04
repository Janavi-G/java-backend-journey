public class fulltime extends Salary {
    double money;

    fulltime(double money){
        this.money = money;
    }
    
    @Override
    void calsalary(){
        System.out.println("The salary for thefull time employee is"+money);
    }
}