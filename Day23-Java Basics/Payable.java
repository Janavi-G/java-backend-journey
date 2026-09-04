public class Payable {
    public static void main(String []args){
        Pays[] payments = {new Paytm(),new cc(),new cashs()}; 
    
        for(Pays p :payments){
       p.pay(500);
        }
    }
}