public class Methods {
    public static void main(String[]args){
        //method = a block of reusable code that is executed when called()
        String name= "Spongebob";
        int age = 22;
        
        happyBirthday(name,age);
        String fullName = getFullName("Spongebob","Squarepants");
        // happyBirthday();
        // happyBirthday();
        // double result = square(3);
        // double result = 9;
        // System.out.println(result);
        //String fullName = "Spongebob Squarepants";
        //System.out.println(fullName);
        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(fullName);
        if(ageCheck(age)){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }   
        static void happyBirthday(String Janavi,int number){
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy birthday dear %s\n",Janavi);
        System.out.printf("You are %d years old\n",number);
        System.out.println("Happy birthday to you !\n");
    }
        static double square(double number){
            return number *number;
        }
        static double cube(double number){
            return number*number*number;
        }
        static String getFullName(String first,String last){
            return first+" "+last;
        }
        static boolean ageCheck(int age){
            if(age>=18){
                return true;
            }
            else{
                return false;
            }
        }
}