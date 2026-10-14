public class ternaryoperator {
    public static void main(String []args){
        int score = 75;
        String output1 = (score>=60)? "PASS" : "FAIL";
        System.out.println(output1);

        int num = 4;
        String output2 = (num%2==0)? "EVEN" : "ODD";
        System.out.println(output2);

        int hours = 13;
        String timeOfDay = (hours>=12)? "PM" : "AM";
        System.out.println(timeOfDay);

        int income = 70000;
        double taxRate = (income>40000)? 0.25 : 0.15;
        System.out.println(taxRate);
    }
}