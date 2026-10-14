public class Add {
    String city;
    String state;

    Add(String city,String state){
        this.city = city;
        this.state = state;
    }

    void address(){
        System.out.println(city+" "+state);
    }
}