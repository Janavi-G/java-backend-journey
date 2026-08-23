public class Variablescope{
    static int x = 3;//class 
    public static void main(String []args){
        //variable scope = where a variable can be accessed
        // int x = 1;//Local Scope
        System.out.println();  
    }
    static void doSomething(){
        int x = 2;//Local scope
        System.out.println(x);  
    }
}