public class CA extends BA {

    CA(String accountHolder,double balance){
        super(accountHolder,balance);
    }
    @Override
    void calculateInterest(){
        double interest = balance*2/100;
    System.out.println("The interest of CA account is:"+interest);
        showBalance();
    }       
}