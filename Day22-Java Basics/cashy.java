public class cashy extends paymode{
    double amount;

    cashy(double amount){
        this.amount = amount;
    }
    @Override 
    void payment(){
        System.out.println("Payment by cash is amount:"+amount);
    }
}