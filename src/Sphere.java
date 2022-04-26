public class Sphere extends Figure { //шар
    public Sphere(double a) {
        super(a, a);
    }

    @Override
    double square() {
        return 4 * Math.PI * Math.pow(a, 2);
    }

    double volume() {
        return (4 / 3) * Math.PI * Math.pow(a, 3);
    }
}
