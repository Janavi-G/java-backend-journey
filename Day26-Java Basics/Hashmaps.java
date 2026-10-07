import java.util.HashMap;

public class Hashmaps {
    public static void main(String []args){
        //HashMap = A data structure that stores key-value pairs
        //Keys are unique,but values can be duplicated
        //Does not maintain any order,but tis memory efficient
        //HashMap<Key,Value>

        HashMap<String,Double> map = new HashMap<>();

        map.put("apple",0.50);
        map.put("orange",1.50);
        map.put("banana",0.30);
        map.put("orange",100000.0);
        map.put("coconut",1.00);
        // map.remove("apple");
        // System.out.println(map.get("apple"));
        // System.out.println(map.containsKey("banana"));
        // System.out.println(map.containsKey("pineapple"));

        // if(map.containsKey("pineapple")){
        //     System.out.println(map.get("pineapple"));
        // }
        // else{
        //     System.out.println("Key not found");
        // }
        // System.out.println(map.containsValue(1.00));//if only 1 is put it gives false,put 1.00 since its double
        // System.out.println(map.size());
        for(String key: map.keySet()){
            System.out.println(key+" : $"+map.get(key));
            
        }

        
    }
}
