public class PTtime extends Employs {
    int hours;

    PTtime(int hours){
        this.hours = hours;
    }

    double calsalary(){
        return 100*hours;
    }
}