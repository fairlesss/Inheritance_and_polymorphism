public class Sphere extends Figure implements Volume {
    public Sphere(double a) {
        super(a, a);
    }

    @Override
    public String information() {
        return "Шар";
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
