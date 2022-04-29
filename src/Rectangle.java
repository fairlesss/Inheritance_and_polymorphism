public class Rectangle extends Figure { //прямоугольник
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void information() {
        name = "Прямоугольник";
        super.information();
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