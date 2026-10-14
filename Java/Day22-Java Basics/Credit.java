public class Credit extends Payments{
    @Override
    void  makePayment(double money){
        System.out.println("Making payment of $" + money + " through credit card");
    }
}