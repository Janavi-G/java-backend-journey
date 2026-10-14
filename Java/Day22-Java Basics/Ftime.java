public class Ftime extends Employ {
    double amount;

    Ftime(double amount){
        this.amount = amount;
    }

    double salary(){
        return 12*amount;
    }
}
