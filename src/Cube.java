public class Cube extends Figure { //куб
    public Cube(double a) {
        super(a, a);
    }

    @Override
    public void information() {
        name = "Куб";
        super.information();
    }

    @Override
    public double area() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return 12 * a;
    }

    @Override
    public double volume() {
        return Math.pow(a, 3);
    }
}
