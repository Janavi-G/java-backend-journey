public class Anonymousclass {
    public static void main(String []args){
        //Anonymous class = A class that doesnt have a name.cannot be reused.
        //add custom behavioour without having to create a new class
        //often used for one time uses(TimerTask,Runnably callbacks)
        Dgs dog1 = new Dgs();
        // TalkingDog doggy = new TalkingDog();
        Dgs dog2 = new Dgs(){
            @Override 
            void speak(){
            System.out.println("Scooby doo says roh roh");
            }
        };
        dog1.speak();
        dog2.speak();
        // doggy.speak();
    }
}