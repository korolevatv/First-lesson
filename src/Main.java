import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k1 = 0;
        for (int i = 1; i < 1000000; i++) {
            int s1 = (i / 100000) % 10 + (i / 10000) % 10 + (i / 1000) % 10;
            int s2 = (i / 100) % 10 + (i / 10) % 10 + i % 10;
            if (s1 == s2) {
                k1 = k1 + 1;
            }
        }
        System.out.println("Задача 1");
        System.out.println(k1);

        int k2 = 0;
        for (int j = 1; j < 1000000; j++) {
            int s3 = (j / 100000) % 10 + (j / 1000) % 10 + (j / 10) % 10;
            int s4 = (j / 10000) % 10 + (j / 100) % 10 + j % 10;
            if (s3 == s4) {
                k2 = k2 + 1;
                //System.out.println(j);
            }
        }
        System.out.println("Задача 2");
        System.out.println(k2);
        if (k1 < k2) {
            System.out.println("Количество счастливых билетов из условия задачи 2 больше");
        }
        if (k1 > k2) {
            System.out.println("Количество счастливых билетов из условия задачи 1 больше");
        }
        if (k1 == k2) {
            System.out.println("Количество частливых билетов в задачах одинаковое");
        }
    }
}

