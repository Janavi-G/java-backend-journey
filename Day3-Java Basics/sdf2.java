public class sdf2{
    public static void main(String[]args){
        String name = "Janavi";
        int age = 22;
        double pert = 91.2;
        System.out.printf("Your name is %s,and you are %d old.You have earned a %+.2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a %,.2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a %(.2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a % .2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a %.2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a %09.2f percentage\n",name,age,pert);
        System.out.printf("Your name is %s,and you are %d old.You have earned a %-8.2f percentage\n",name,age,pert);
    }
}