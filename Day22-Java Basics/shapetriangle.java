public class shapetriangle extends Shapez {
    double base, height;
    shapetriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    void area() {
        System.out.println(0.5 * base * height);
        
    }
}