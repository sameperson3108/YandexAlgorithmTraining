package training01.part1;

import java.util.Scanner;

public class DBildingSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] houses = new int[N];
        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }
        int medianIndex = N / 2;
        System.out.println(houses[medianIndex]);
    }
}
