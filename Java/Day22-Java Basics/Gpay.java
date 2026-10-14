public class Gpay extends Payments{
    @Override
    void makePayment(double money){
        System.out.println("Making payment of $" + money + " through Gpay");
    }
}