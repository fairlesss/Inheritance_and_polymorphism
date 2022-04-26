public class Rectangle extends Figure { //прямоугольник
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double square() {
        return a * b;
    }

    double perimeter() {
        return 2 * (a + b);
    }
}
