public class boxing {
    public static void main(String []args){
        int number = 50;
        Integer boxed = number;
        int unboxed = boxed;
    
        double n = 50.0;
        Double box = n;
        double unbox = box;
        
        boolean u = true;
        Boolean bo = u;
        boolean unbo = bo;

        char c = 'J';
        Character ch = c;
        char cho = ch;

        System.out.println(number);
        System.out.println(boxed);
        System.out.println(unboxed);    

        System.out.println(n);
        System.out.println(box);
        System.out.println(unbox);

        System.out.println(u);
        System.out.println(bo);
        System.out.println(unbo);

        System.out.println(c);
        System.out.println(ch);
        System.out.println(cho);

    }
}