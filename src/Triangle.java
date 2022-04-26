public class Triangle extends Figure { //треугольник
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double square() {
        return (a * b) / 2;
    }

    double perimeter() {
        return 3 * a;
    }
}
