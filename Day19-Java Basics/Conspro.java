public class Conspro {
    public static void main(String []args){
        Product pro1 = new Product("Cup",10.98,50);
        Product pro2 = new Product("Spoons",20.50,2);
   
        pro1.total();
        pro1.showDetails();
        pro2.total();
        pro2.showDetails();
    }
}