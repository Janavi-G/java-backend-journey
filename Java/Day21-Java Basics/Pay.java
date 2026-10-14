public class Pay {
    public static void main(String []args){
        CCP ccp = new CCP();
        UPI upi = new UPI();
        Cash cash = new Cash();

        ccp.makePayment(500);
        upi.makePayment(600);
        cash.makePayment(700);
    }
}