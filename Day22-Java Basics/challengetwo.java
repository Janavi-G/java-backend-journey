public class challengetwo {
    public static void main(String []args){
        Notification n1 = new Email();
Notification n2 = new SMS();
Notification n3 = new Whatsapp();

n1.send("Hello Janavi");
n2.send("Hello Janavi");
n3.send("Hello Janavi");
    }
}