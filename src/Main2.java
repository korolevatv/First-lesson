import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Введите границу а функции");
        Scanner in2 = new Scanner(System.in);
        double a = in2.nextDouble();
        System.out.println("Введите границу b функции");
        Scanner in3 = new Scanner(System.in);
        double b = in3.nextDouble();
        double h = (b - a) / 1000;
        double s = 0;
        double x = a;
        while (x <= b) {
            double y;
            y = x * x * x + x + 1;
            s = s + y * h;
            x = x + h;
        }
        System.out.println("Площадь под графиком примерно равна:");
        System.out.println(Math.abs(s));

    }
}
