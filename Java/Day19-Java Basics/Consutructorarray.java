public class Consutructorarray {
    public static void main(String [] args){
        
        // Conscar[] cars = new Conscar[3];
        Conscar[] cars= {new Conscar("Mustang","Red"),
                                    new Conscar("Corvette","Blue"),
                                new Conscar("Charger","Yellow")};
        // for(int i =0;i<cars.length;i++){
        //     cars[i].drive();
        // }
        for(Conscar car : cars){
            car.color = "black";
        }
        for(Conscar car : cars){
            car.drive();
        }
    }
}