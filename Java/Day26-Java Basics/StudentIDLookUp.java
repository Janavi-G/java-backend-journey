import java.util.HashMap;

public class StudentIDLookUp {
    public static void main(String []args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"Janavi");
        map.put(102,"Sneha");
        map.put(103,"Rahul");
        // map.remove("Apple");
        // System.out.println(map.get(101));
        System.out.println(map.containsKey(104));
    }
}