public class SA extends BA {

    SA(String accountHolder,double balance){
        super(accountHolder,balance);
    }
    @Override
    void calculateInterest(){
        double interest = balance*5/100;
    System.out.println("The interest of SA account is:"+interest);
        showBalance();
    }       
}