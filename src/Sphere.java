public class Sphere extends Figure { //шар
    public Sphere(double a) {
        super(a, a);
    }

    @Override
    public void information() {
        name = "Шар";
        super.information();
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(a, 3);
    }
}
