import java.util.Random;

abstract public class Figure {
    // Получается что из-за наследования некоторые наследники будут иметь ненужные методы и атрибуты
    //например  Rectangle будет иметь volume, что в промышленном программировании не очень удобно и противоречит букве 
    //  I в SOLID https://ru.wikipedia.org/wiki/SOLID_(%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BD%D0%BE-%D0%BE%D1%80%D0%B8%D0%B5%D0%BD%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%B5_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5)
    //Предлагаю вынести что-то относительно специфичное в интрефейсы
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

    public static Figure rand(int n) {// Этот метод лучше вынести в отдельную функцию вне класса, так как это 
    // противоречит приниципу S в SOLID
        Figure figures = null;
        Random random = new Random();
        for (int i = 0; i < n; i++) {//Непонятно зачем здесь цикл нужен
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
