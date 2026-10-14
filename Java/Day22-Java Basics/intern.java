public class intern extends Salary {
    double money;

    intern(double money){
        this.money = money;
    }
        
    @Override
    void calsalary(){
        System.out.println("the stipend for intern is "+money);
    }
}