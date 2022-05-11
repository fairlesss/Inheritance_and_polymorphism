import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void num(int number) throws FigureException {
        if (number < 0) throw new FigureException("the number is less than 0", number);
    }

    public static void main(String[] args) {
        System.out.println("Введите количество элементов:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        try {
            num(n);
        } catch (FigureException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

        Figure figureList[] = new Figure[n];
        Map<String, Double> figureArea = new HashMap<>();

        for (int i = 0; i < n; i++) {
            figureList[i] = rand(n);
            System.out.println(figureList[i].information() + ": " + figureList[i].area());
            figureArea.put(figureList[i].information(), figureList[i].area());
        }

        try {
            FileWriter out = new FileWriter("file.txt");
            out.write(String.valueOf(Collections.singletonList(figureArea)));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Figure rand(int n) {
        Figure figures = null;
        Random random = new Random();
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
        return figures;
    }
}
