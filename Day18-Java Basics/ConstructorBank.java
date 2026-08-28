public class ConstructorBank{
    public static void main(String[]args){
        BankAccount account1 = new BankAccount("Janavi",100.0);
        BankAccount account2 = new BankAccount("Sowjanya",200.0);
        
        account1.accountDetails();
        account2.accountDetails();
        // System.out.println(account1.deposit(10000));
        // System.out.println(account1.withdraw(9000));
        // System.out.println(account1.showBalance());
        // System.out.println(account2.showBalance());
        // System.out.println(account2.withdraw(100));
        // System.out.println(account2.deposit(3000));
        // System.out.println(account2.showBalance());
        // account1.accountDetails();
    }
}