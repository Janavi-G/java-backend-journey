public class Abstraction {
    public static void main(String []args){
        //abstract = used to define abstract classes and methods.
        //abstraction is the process of hiding implementation details
        //and showing only the essential features
        //abstract classes can't be instantiated directly
        //can contain 'abstract' methods(which must be implemented)
        //can contain 'concrete' methods (which are inherited)

        // geometry geo = new geometry();
        circles  cir = new circles(3);
        triangle tri = new triangle(4,5);
        rect rect = new rect(6,7);

        System.out.println(cir.area());
        System.out.println(tri.area());
        System.out.println(rect.area());

        // cir.display();
        // tri.display();
        // rect.display();
    }
}
