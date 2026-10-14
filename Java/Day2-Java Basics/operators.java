public class operators{
    public static void main(String[]args){
        int x= 10;
        int y = 2;
        int a,b,c,d,e;
        a = x + y;
        b = x -y;
        c = x * y;
        d = x / y;
        e = x % y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //Augumented assignment operators
        // x+=y;
        // System.out.println(x);
        x-=y;
        System.out.println(x);
        // x*=y;
        // System.out.println(x);
        // x/=y;
        // System.out.println(x);
        // x%=y;
        // System.out.println(x);
    //Increment and decrement operators
    int f = 1;
    f++;
    f++;
    f++;
    System.out.println(f);
    //Order of operations -P-E-M-D-A-S
    double result = 10+2+(4-5)*4/Math.pow(2,1);
    System.out.println(result);
    }
}