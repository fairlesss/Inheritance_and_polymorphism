public class Triangle extends Figure implements Perimeter {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String information() {
        return "Треугольник";
    }

    @Override
    public double area() {
        double pp = (a + b + c) / 2;
        if (pp > a && pp > b && pp > c) {
            return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
        }
        return 0;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}