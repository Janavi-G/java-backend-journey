public class phonepe extends paymode{
    double amount;

    phonepe(double amount){
        this.amount = amount;
    }

    @Override
    void payment(){
        System.out.println("Payment by phonepe is amount"+amount);
    }
}