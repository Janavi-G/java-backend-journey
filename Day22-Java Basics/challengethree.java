public class challengethree {
    public static void main(String []args){
        Animals[] animals = {new Dogs(),new Cats(),new Cows()};
   
        for(Animals a:animals){
            a.sound();
        }
    }
}