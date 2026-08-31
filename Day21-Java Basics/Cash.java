public class Cash extends Payment{
    @Override
    void makePayment(double amount){
        System.out.println("Paid"+amount+"using cash");
    }
}
