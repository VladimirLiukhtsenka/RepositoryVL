package by.epamtc.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

/*
7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */
public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число m");
        int m = sc.nextInt();
        System.out.println("Введите натуральное число n");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.println("Число: " + i + " его делители: ");
            boolean first = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    if (!first) System.out.print(", ");
                    System.out.print(j);
                    first = false;
                }
            }
            if (first) {
                System.out.print("отсутствуют");
            }
            System.out.println();
        }
    }
}
