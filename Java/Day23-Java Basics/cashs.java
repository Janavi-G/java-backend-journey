public class cashs implements Pays{
    @Override
    public void pay(double amount){
        System.out.println("the amount paid through cash is"+amount);
    }
}