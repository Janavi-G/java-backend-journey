public class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance =  balance;
    }

    void accountDetails(){
        System.out.println("The account holder is:"+accountHolder);
        System.out.println("Balance:"+balance); 
    }
    double deposit(double deposit){
        if(deposit<=0){
        System.out.println("Deposit cant be negative or zero");
        }
        else{
        balance+= deposit;
        System.out.print("The current balance  after deposit is:");
        }
        return balance;
    }
    double withdraw(double withdraw){
        if(withdraw<=0){
            System.out.println("Wihtdraw must be greater than 0");
        }
        else if(withdraw>balance){
            System.out.println("Withdrawal cant be greater than balance");
        }
        else{
            System.out.print("The current balance  after withdrawal is:");
            balance -=withdraw;
        }
        return balance;
    }
    double showBalance(){
        System.out.print("The current balance is:");
        return balance;
    }
}