// import java.util.Scanner;
    public class MaximumThree{
    public static void main(String []args){
        max(30,10,20);
    }   
    static void  max(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("The maximum of three is"+a);
            }
            else{
                System.out.println("The maximum of the three is"+c);
            }
            }
            else if(b>a){
                if(b>c){
                System.out.println("The maximum of three numbers is"+b);
            }
            else{
                System.out.println("The maximum of three is "+c);
            }
            }
            else{
                if(c>b){
                  System.out.println("The maximum of three numbers is"+c);  
                }
                else{
                    System.out.println("The maximum of three is"+b);
                }
            }
        }
    }