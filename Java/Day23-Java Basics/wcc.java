public class wcc {
    public static void main(String []args){
        String number = "250";
        int num = Integer.parseInt(number);
        int x = num+50;
        System.out.println(x);

        double n = 25.5;
        Double box = n;
        double unbox = box;

        System.out.println(n);
        System.out.println(box);
        System.out.println(unbox);

        boolean ch = true;
        Boolean boxy = ch;
        boolean unboxy = boxy;

        System.out.println(ch);
        System.out.println(boxy);
        System.out.println(unboxy);
    }
}
