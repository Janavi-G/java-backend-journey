public class Conspro {
    public static void main(String []args){
        Pro pro1 = new Pro("Cup",10.98,50);
        Pro pro2 = new Pro("Spoons",20.50,2);
   
        pro1.total();
        pro1.showDetails();
        pro2.total();
        pro2.showDetails();
    }
}