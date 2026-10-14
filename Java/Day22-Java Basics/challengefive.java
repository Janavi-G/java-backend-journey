public class challengefive {
    public static void main(String []args){
        Bank account1 =new Save("Janavi", 50000);

        Bank account2 =new Current("Sowjanya", 50000);

        account1.interest();
        account2.interest();
    }
}