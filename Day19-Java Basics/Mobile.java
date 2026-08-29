public class Mobile {
    String brand;
    String model;
    double price;
    int bp;

    Mobile(String brand,String model,double price,int bp){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.bp = bp;
    }

    void showDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
        System.out.println("Percentage: "+bp);
    }
        void makeCall(){
            System.out.println("Hello");
        }

        int chargeBattery(int percentage){
           bp +=percentage;
            if(bp>100){
            bp = 100;
            System.out.println("Battery is full till 100");
        }
        else {
            System.out.println("The new battery life is "+bp);
        }
        return bp;
    }
        int useBattery(int percentage){
            bp -= percentage ;
            if(bp <0){
                bp = 0;
            }
            System.out.println("The new battery life is "+bp);
        return bp;
}
}