public class empman {
    public static void main(String [] args){
        Manager man = new Manager("Janavi",70000);
        Developer dev = new Developer("Rahul",60000);
    
    man.showDetails();
    man.work();
    dev.showDetails();
    dev.work();
    }
}