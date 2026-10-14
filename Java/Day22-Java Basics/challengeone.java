public class challengeone {
    public static void main(String []args){
        Payments p1 = new Credit();
        Payments p2 = new Gpay();
        Payments p3 = new Cashier();

p1.makePayment(500);
p2.makePayment(500);
p3.makePayment(500);
    }
}