package training01.part1;

import java.util.Scanner;

public class BRingMetroLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();

        int direct = Math.abs(i - j) - 1;
        int viaRing = N - Math.abs(i - j) - 1;

        int ans = Math.min(direct, viaRing);

        System.out.println(ans);

    }
}
