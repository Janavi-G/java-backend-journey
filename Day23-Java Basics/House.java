public class House {
    String address;
    Room bedroom;
    Room kitchen;

    House(String address){
        this.address = address;
         bedroom = new Room("Bedroom","");
         kitchen = new Room("","Kitchen");
    }

    void display(){
        System.out.println(address);
        System.out.println("Room :"+bedroom.bed);
        System.out.println("Room :"+kitchen.kit);
    }
}
