public class Circle extends Figure { //круг
    public Circle(double a) {
        super(a, a);
    }

    @Override
    double square() {
        return Math.PI * 2 * a;
    }

    double perimeter() {
        return 2 * a * Math.PI;
    }
}
