import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// TODO: Создайте иерархию классов на основе класса абстрактного класса Фигура с набором необходимых абстрактных методов.
//    Должны быть описаны классы Квадрат, Прямоугольник, Треугольник, Круг, Куб, Шар.
//    --Реализовать конструкторы,
//    --Методы, выводящие информацию о фигуре(название и тип),
//    --Методы, считающие площадь, периметр и объем(где он есть)
//    --Создать  массив на n элементов(вводится пользователем) и добавить в него набор различных фигур случайным образом
//    --Найти фигуру с самой большой площадью. Если таких фигур несколько вывести все
//    --Результат вывести в файл

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
        for (int i = 0; i < n; i++) {
            figureList[i] = Figure.rand(n);
            figureList[i].area();
            //figureList[i].information();
            //System.out.println(": " + figureList[i].area());
        }
        Figure max = figureList[0];
        for (Figure figure : figureList) {
            if (figure > max) {
                max = figure;
            }
        }

        FileWriter fw = new FileWriter("file.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(max);
        bw.close();
    }
}
