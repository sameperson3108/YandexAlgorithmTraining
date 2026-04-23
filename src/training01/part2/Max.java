package training01.part2;

import java.util.Scanner;

public class Max {
    //Найти максимальное в непустой последовательности
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }

        System.out.println(max);
    }
}
