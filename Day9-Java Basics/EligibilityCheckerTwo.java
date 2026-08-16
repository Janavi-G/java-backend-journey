import java.util.Scanner;
public class EligibilityCheckerTwo {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your age to check eligibility:");
    int age = scanner.nextInt();
    if(age<18){
      System.out.println("You are not eligible to vote");
    }
    else if(age>=18 && age<=60){
      System.out.println("You are eligible to vote");
    }
    else if(age>60 && age<=80){
      System.out.println("You belong to senior category");
    }
    else if(age >=80 && age<=100) {
      System.out.println("You are too old,and elgible to vote as well");
    }
    scanner.close();
  }  
}