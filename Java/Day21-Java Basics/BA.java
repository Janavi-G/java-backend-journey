public class BA {

    String accountHolder;
    double balance;

    BA(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Calculating interest");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}