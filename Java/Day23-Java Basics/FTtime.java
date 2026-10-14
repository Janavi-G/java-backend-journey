public class FTtime extends Employs{
    double amount;

    FTtime(double amount){
        this.amount = amount;
    }

    double calsalary(){
        return 12*amount;
    }
}
