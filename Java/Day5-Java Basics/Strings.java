public class Strings{
    public static void main(String[]args){
        String name = "Bro Code";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");
        String name1 = name.toUpperCase();
        String name2 = name.toLowerCase();
        String name3 = name.trim();
        String name4 = name.replace("o","s");
        boolean empty = name.isEmpty();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        if(empty){
        System.out.println("Is  empty");
        }
        else{
            System.out.println("Is not empty");
        }

        if(name.contains("")){
            System.out.println("Your name has space");
        }
        else{
            System.out.println("Your name has no spaces");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name is a password");
        }
        else{
            System.out.println("Your name is not a password");
        }
    }
}