public class statics {
    public static void main(String [] args){
        //static = Makes a variable or method belong to the class
        //rather than to any specific object
        //commonlly used for utility methods or shared resources

        // Math.round(3.99);
        Friend friend1 = new Friend("Janavi");
        Friend friend2 = new Friend("Sowjanya");
        Friend friend3 = new Friend("Rahul");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Sandyshore");
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println(friend5.name);
        // Friend.showFriends();
        System.out.println(Friend.numofFriends);
        Friend.showFriends();
        // System.out.println(friend2.numofFriends);
        // System.out.println(friend3.numofFriends);
        // System.out.println(friend4.numofFriends);
        // System.out.println(friend5.numofFriends);
    }
}