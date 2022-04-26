abstract public class Figure {
    public double a, b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //метод для вычисления площади
    abstract double square();

}
