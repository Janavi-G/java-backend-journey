public class card extends paymode {
    double amount;

    card(double amount){
        this.amount = amount;
    }
    @Override 
    void payment(){
        System.out.println("Payment by card is amount:"+amount);
    }
    }