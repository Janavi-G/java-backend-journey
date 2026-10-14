public class Current extends Bank{
    String name;
    double balance;

    Current(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    @Override
    void interest(){
        balance = balance + (balance * 2/ 100);
        System.out.println("name is:"+name);
        System.out.println("The interest is reading.." + balance);
    }
}