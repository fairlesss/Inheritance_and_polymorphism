public class Square extends Figure { //квадрат

    public Square(double a) {
        super(a, a);
    }

    @Override
    double square() {
        return Math.pow(a, 2);
    }

    public double perimeter() {
        return 4 * a;
    }
}
