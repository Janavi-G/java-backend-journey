public class Wrapper {
        public static void main(String []args){
            //wrapper calsses = allows primitive values(int,char,double,boolean
            //to be used as objects,"Wrap them in an object"
            //generally,dont wrap primitives unless you need an object.
            //allows use of collections framework and static utility methods
            //Autoboxing
            // Integer a = 123;
            // Double b = 3.14;
            // Character c ='$';
            // Boolean d = true;
            // String e ="Pizza";

            //Unboxing
            // int x = a;//similarly for other data types

            // String a = Integer.toString(123);

            // String b = Double.toString(3.14);
            // String c = Character.toString('@');
            // String d = Boolean.toString(false);

            // String x = a+b+c+d;
            // System.out.println(x);

            // int a = Integer.parseInt("123");
            // double b = Double.parseDouble("3.14");
            // char c = "Pizza".charAt(0);
            // boolean d = Boolean.parseBoolean("true");

            // String x = a+b+c+d;

            // System.out.println(x);

            char letter = 'b';
            System.out.println(Character.isLetter(letter));
            System.out.println(Character.isUpperCase(letter));
        }
}