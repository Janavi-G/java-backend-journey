public class cary {
    String model;
    Engines engines;

    cary(String model){
        this.model = model;
        engines = new Engines("Petrol");
    }

    void startCar(){
        System.out.println("Car:"+model);
        System.out.println("Engine:"+engines.type);
        engines.starts();
        System.out.println("Car started");
    }
}