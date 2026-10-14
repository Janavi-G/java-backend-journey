public class ConstructorCar {
    public static void main(String[]args){
        Carclass car1 =new Carclass("Toyota","Corolla",2024);
        Carclass car2 = new Carclass("Honda","Civic",2023);
        Carclass car3 = new Carclass("Tesla","Model3",2025);

        car1.displayDetails();
        car2.start();
        car3.stop();
    }
}