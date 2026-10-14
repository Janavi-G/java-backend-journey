public class gettersandsetters {
    public static void main(String []args){
        //They help protect object data and add rules for accessing or modifying them.
        //getters=methods that make a field readable.
        //settters = methods that make a field writable.
        newCar car = new newCar("Charger","Yellow",10000);  
        
        // car.setModel("Corvette");
        car.setColor("Blue");
        car.setPrice(-20000);
        System.out.println(car.getColor()+" "+car.getModel()+" "+car.getPrice());
    }
}