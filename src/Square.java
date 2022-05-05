public class Square extends Figure { //квадрат

    public Square(double a) {
        super(a, a);
    }

    @Override
    public String information() {
        return "Квадрат ";
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }
}