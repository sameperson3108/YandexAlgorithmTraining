package training01.part2;

import java.util.*;

public class First {
    public static void main(String[] args) {
        // Дана последовательность чисел длиной N. Найти первое (левое) вхождение положительного числа X в неё или вывести -1, если X не было
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int answer = -1;

        for (int i = 0; i < N; i++) {
            if (answer == -1 & nums[i] == X) answer = i;
        }

        System.out.println(answer);
    }
}
