public class CCP extends Payment {
    @Override
    void makePayment(double amount){
        System.out.println("Paid"+amount+"using Credit Card");
    }
}
