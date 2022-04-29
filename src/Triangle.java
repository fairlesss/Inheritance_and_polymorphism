public class Triangle extends Figure { //треугольник
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void information() {
        name = "Треугольник";
        super.information();
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}