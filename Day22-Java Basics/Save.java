public class Save extends Bank {
    String name;
    double balance;

    Save(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    @Override
    void interest(){
        balance = balance + (balance * 5/ 100);
        System.out.println("name is:"+name);
        System.out.println("The interest is reading.." + balance);
    }
}