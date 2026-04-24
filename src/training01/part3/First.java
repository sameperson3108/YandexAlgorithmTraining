package training01.part3;

import java.util.Scanner;
import java.util.*;

public class First {
    public static void main(String[] args) {
        //Дана последовательность положительных чисел длиной N и число X
        //Нужно найти два различных числа A и B из последовательности, таких что A+B=X или вернуть пару 0, 0, если такой пары чисел нет
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        int[] result = solution(nums, X);
        System.out.println(result[0] + ", " + result[1]);
    }

    // Решение за O(n2)
//    public static int[] solution(int[] nums, int X) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == X)
//                    return new int[]{nums[i], nums[j]};
//            }
//        }
//        return new int[]{0, 0};
//    }

    // Решение за O(N)
    public static int[] solution(int[] nums, int X) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            int nowNum = X - num;
            if (set.contains(nowNum)) return new int[]{nowNum, num};
            set.add(num);
        }
        return new int[]{0, 0};
    }
}
