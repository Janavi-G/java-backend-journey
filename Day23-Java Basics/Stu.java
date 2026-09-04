public class Stu {
    String name;
    Address address;

    Stu(String name,Address address){
        this.name = name;
        this.address = address;
    }

    void displayStudent(){
        System.out.println("Name:"+name);
        address.display();
    }
}
