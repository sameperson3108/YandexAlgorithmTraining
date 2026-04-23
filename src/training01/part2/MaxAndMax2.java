package training01.part2;

import java.util.*;

public class MaxAndMax2 {
    public static void main(String[] args) {
        // Найти максимальное и второе максимальное
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int max1;
        int max2;

        if (nums[0] > nums[1]) {
            max1 = nums[0];
            max2 = nums[1];
        } else {
            max1 = nums[1];
            max2 = nums[0];
        }

        for (int i = 2; i < N; i++) {
            if (nums[i] > max1 & nums[i] > max2) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] < max1 & nums[i] > max2) {
                max2 = nums[i];
            }
        }

        System.out.println("max1 = " + max1 + ", max2 = " + max2);

    }
}
