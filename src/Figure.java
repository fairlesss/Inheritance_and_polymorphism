import java.util.Random;

abstract public class Figure {
    public double a, b;
    public double area;
    public double perimeter;
    public double volume;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract String information();

    public double area() {
        return area;
    }

    public double perimeter() {
        return perimeter;
    }

    public double volume() {
        return volume;
    }

    public static Figure rand(int n) {
        Figure figures = null;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            double x = Math.random() * 15 + 1;
            int randomNumber = random.nextInt(6);
            switch (randomNumber) {
                case 0:
                    figures = new Circle(x);
                    break;
                case 1:
                    figures = new Cube(x);
                    break;
                case 2:
                    figures = new Rectangle(x, x);
                    break;
                case 3:
                    figures = new Sphere(x);
                    break;
                case 4:
                    figures = new Triangle(x, x, x);
                    break;
                case 5:
                    figures = new Square(x);
                    break;
            }
        }
        return figures;
    }
}
