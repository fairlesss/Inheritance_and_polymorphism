public class Rectangle extends Figure implements Perimeter {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public String information() {
        return "Прямоугольник";
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}