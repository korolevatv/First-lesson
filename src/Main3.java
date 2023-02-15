import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Введите коэффициент уравнения а");
        Scanner in2 = new Scanner(System.in);
        double a = in2.nextDouble();
        System.out.println("Введите коэффициент уравнения b");
        Scanner in3 = new Scanner(System.in);
        double b = in3.nextDouble();
        System.out.println("Введите коэффициент уравнения с");
        Scanner in1 = new Scanner(System.in);
        double c = in1.nextDouble();
        double d = b*b - 4*a*c;
        double d1 = Math.sqrt(d);
        if (d < 0) {
            System.out.println("Корней нет");
        }
        else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("Один корень:");
            System.out.println(x);
        }
        else {
            double x1 = (-b + d1) / (2 * a);
            double x2 = (-b - d1) / (2 * a);
            System.out.println("Два корня:");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}

