abstract public class Figure {
    public double a, b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract String information();

    public abstract double area();
}
