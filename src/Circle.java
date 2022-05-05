public class Circle extends Figure { //круг

    public Circle(double a) {
        super(a, a);
    }

    @Override
    public String information() {
        return "Круг ";
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return 2 * a * Math.PI;
    }
}
