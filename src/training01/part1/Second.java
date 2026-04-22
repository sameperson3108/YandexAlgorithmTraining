package training01.part1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        // Даны 3 целых числа a, b, c. Найти все корни уравнения ax2 + bx + c = 0

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double D = (double) b * b - 4 * a * c;

        if (a == 0) {
            if (b != 0) System.out.println( -c / b);
            if (b == 0 & c == 0) System.out.println("Infinite number of solutions");
        }
        else {
            if (D == 0) {
                double x1 = (double) -b / (2 * a );
                System.out.println(x1);
            } else if (D > 0) {
                double x1 = (-b - Math.sqrt(D)) / (2 * a);
                double x2 = (-b + Math.sqrt(D)) / (2 * a);

                if (x1 < x2) {
                    System.out.println(x1);
                    System.out.println(x2);
                } else {
                    System.out.println(x2);
                    System.out.println(x1);
                }



            }
        }

    }
}
