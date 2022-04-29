import java.util.Random;

abstract public class Figure {
    public double a, b;
    public String name;
    public double perimeter;
    public double volume;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void information() {
        System.out.print(name);
    }

    public abstract double area();

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
            int randomNumber = random.nextInt(6);
            switch (randomNumber) {
                case 0:
                    figures = new Circle(Math.random() * 10 + 1);
                    break;
                case 1:
                    figures = new Cube(Math.random() * 10 + 1);
                    break;
                case 2:
                    figures = new Rectangle(Math.random() * 10 + 1, Math.random() * 10 + 1);
                    break;
                case 3:
                    figures = new Sphere(Math.random() * 10 + 1);
                    break;
                case 4:
                    figures = new Triangle(Math.random() * 10 + 1, Math.random() * 10 + 1, Math.random() * 10 + 1);
                    break;
                case 5:
                    figures = new Square(Math.random() * 10 + 1);
                    break;
            }
        }
        return figures;
    }
}
