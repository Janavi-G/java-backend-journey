public class challengeyten {
    public static void main(String[]args){
        paymode[] pay = {new phonepe(500),new card(400),new cashy(300)};

        for(paymode p :pay){
        p.payment();
        }
    }
}