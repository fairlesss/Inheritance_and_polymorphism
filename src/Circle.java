public class Circle extends Figure { //круг

    public Circle(double a) {
        super(a, a);
    }

    @Override
    public void information() {
        name = "Круг";
        super.information();
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
