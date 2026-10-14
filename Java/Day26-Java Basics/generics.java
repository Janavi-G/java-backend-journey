// import java.util.ArrayList;
public class generics {
        public static void main(String []args){
            //Generics = A concept where you can write a class,interface,or method
            //that is compatible with different data types.
            //<T> type parameter (placeholder that gets replaced with a real type)
            //<String> type argument (specifies the type)
        //      Boxx<Double> box = new  Boxx<>();
        //      box.setItem(3.14);
        //      System.out.println(box.getItem());
                // Product<String, Double> product1 = new Product<>("apple",0.50);
                Product<String, Double> product2 = new Product<>("ticket",15.0);
                
                System.out.println(product2.getItem());
                System.out.println(product2.getPrice());
        }
}