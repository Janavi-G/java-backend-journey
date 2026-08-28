public class Carclass {
    String brand;
    String model;
    int year;

    Carclass (String brand,String model,int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    void displayDetails(){
        System.out.println(brand+" "+model+" "+year);
    }
    void start(){
        System.out.println("Car started");
    }
    void stop(){
        System.out.println("Car Stopped");
    }
}