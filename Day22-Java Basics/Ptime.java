public class Ptime extends Employ {
    int hours;

    Ptime(int hours){
        this.hours = hours;
    }

    double salary(){
        return  hours*100;
    }
}