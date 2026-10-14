public class Pro {
    String name;
    double price;
    int quantity;
    double total;
    Pro(String name){
        this.name = name;
    }

    Pro(String name,double price){
        this.name = name;
        this.price = price;
    }

    Pro(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void showDetails(){
        System.out.println("Name of product: "+name);
        System.out.println("Price: $"+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total: $"+total);
    }

    double total(){
        total = price*quantity;
        return total;
    }
}
