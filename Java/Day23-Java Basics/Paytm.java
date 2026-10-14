public class Paytm implements Pays{
    @Override
    public void pay(double amount){
        System.out.println("the amount pais through paytm is"+amount);
    }
}