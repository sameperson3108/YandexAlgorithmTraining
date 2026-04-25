package training01.part4;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        //Дано два числа X и Y без ведущих нулей
        //Нужно проверить, можно ли получить первое из второго перестановкой цифр
        //Решение сортировкой подсчётом
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(check(X, Y));
    }

    public static boolean check(int X, int Y) {
        int[] digitsX = countDigits(X);
        int[] digitsY = countDigits(Y);

        for (int i = 0; i < 10; i++) {
            if (digitsX[i] != digitsY[i]) return false;
        }

        return true;
    }

    public static int[] countDigits(int num) {
        int[] digitCount = new int[10];
        while(num > 0) {
            int lastDigit = num % 10;
            digitCount[lastDigit]++;
            num /= 10;
        }
        return digitCount;
    }
}
