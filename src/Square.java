public class Square extends Figure { //квадрат

    public Square(double a) {
        super(a, a);
    }

    @Override
    public void information() {
        name = "Квадрат";
        super.information();
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