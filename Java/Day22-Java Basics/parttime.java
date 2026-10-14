public class parttime extends Salary {
    int hours;

    parttime(int hours){
        this.hours = hours;
    }
    
    @Override
    void calsalary(){
        System.out.println("The salary for the part time employee is"+(10*hours));
    }
}