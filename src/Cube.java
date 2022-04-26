public class Cube extends Figure { //куб
    public Cube(double a) {
        super(a, a);
    }

    @Override
    double square() {
        return 6 * Math.pow(a, 2);
    }

    double perimeter() {
        return 12 * a;
    }

    double volume() {
        return Math.pow(a, 3);
    }
}
