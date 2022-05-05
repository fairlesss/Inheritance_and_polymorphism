import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Figure cub = new Cube(4);
//        cub.information();
//        System.out.println();
//        System.out.println("Площадь = " + cub.area());
//        System.out.println("Периметр = " + cub.perimeter());
//        System.out.println("Объём = " + cub.volume());

        System.out.println("Введите количество элементов:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Figure figureList[] = new Figure[n];
        Map<String, Double> figureArea = new HashMap<>();

        for (int i = 0; i < n; i++) {
            figureList[i] = Figure.rand(n);
            String info = figureList[i].information();
            double area = figureList[i].area();
            System.out.println(figureList[i].information() + ": " + figureList[i].area());
            figureArea.put(info, area);
        }

        try {
            FileWriter out = new FileWriter("file.txt");
            out.write(String.valueOf(Collections.singletonList(figureArea)));
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
