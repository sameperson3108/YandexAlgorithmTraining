package training01.part2;

import java.util.Scanner;

public class CCreatePalindroms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int left = 0;
        int right = s.length() - 1;
        int cost = 0;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                cost++;
            }
            left++;
            right--;
        }

        System.out.println(cost);
    }
}
