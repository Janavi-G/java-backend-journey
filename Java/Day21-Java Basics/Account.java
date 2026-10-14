public class Account {
    public static void main(String []args){
        SA sa = new SA("Janavi",50000);
        CA ca = new CA("Sowjanya",50000);

        sa.showBalance();
        sa.calculateInterest();
        ca.showBalance();
        ca.calculateInterest();
    }
}
