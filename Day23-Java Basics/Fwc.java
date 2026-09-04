public class Fwc {
    //*************8This code is enhanced comapred to the toal part of marks program*********//
    public static void main(String []args){
        Integer result = calculateTotal(10, 20, 30, 40, 50);
        // int value = result;     unboxing  
        System.out.println(result);
    }
   static  int calculateTotal(Integer... numbers){
    int total = 0;
            for(Integer number:numbers){
                total += number;
            }
            return total;
        }
    }