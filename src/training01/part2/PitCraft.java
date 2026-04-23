package training01.part2;

import java.util.*;

public class PitCraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cubs = new int[N];

        for (int i = 0; i < N; i++) {
            cubs[i] = sc.nextInt();
        }

        int maxpos = 0;
        for (int i = 0; i < N; i++) {
            if (cubs[i] > cubs[maxpos]) maxpos = i;
        }

        int ans = 0;
        int nowm = 0;

        for (int i = 0; i < maxpos; i++) {
            if (cubs[i] > nowm) nowm = cubs[i];
            ans += nowm - cubs[i];
        }

        nowm = 0;

        for (int i = N - 1; i > maxpos; i--) {
            if (cubs[i] > nowm) nowm = cubs[i];
            ans += nowm - cubs[i];
        }

        System.out.println(ans);
    }
}
