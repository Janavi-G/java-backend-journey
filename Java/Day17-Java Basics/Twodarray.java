public class Twodarray{
    public static void  main(String[]args){
        //2D array = an array where each element is an array
        //useful for storing a matrix of data
        String[] fruits = {"apple","orange","banana"};
        String[] vegetables ={"potato","onion","carrot"};
        String[] meats = {"chicken","pork","fish","prawn"};
        String[][] groceries = {fruits,vegetables,meats};
        groceries[1][0] = "celery";

        for(String[] foods:groceries){
            for(String food:foods){
                System.out.print(food+" ");
            }
            System.out.println();
        }
    }
}