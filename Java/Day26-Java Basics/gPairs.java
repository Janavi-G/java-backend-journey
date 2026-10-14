public class gPairs{
    public static void main(String []args){
        Pairs<Integer,String> pair1 = new Pairs<>(101,"Janavi");
        Pairs<String,Double> pair2 = new Pairs<>("Salary",56000.50);
        System.out.print(pair1.getKey());
        System.out.println(pair1.getValue());
        System.out.print(pair2.getKey());
        System.out.println(pair2.getValue());
    }
}