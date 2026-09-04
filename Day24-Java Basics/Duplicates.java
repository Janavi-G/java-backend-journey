import java.util.ArrayList;
public class Duplicates {
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);
        
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i = 0;i<list.size();i++){
        if(!list2.contains(list.get(i))){
            list2.add(list.get(i));
        }
    }   
    System.out.println(list2);
}
}