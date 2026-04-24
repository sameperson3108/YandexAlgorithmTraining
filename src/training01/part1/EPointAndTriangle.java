package training01.part1;

import java.util.Scanner;

public class EPointAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int ans;
        if (X >= 0 && Y >= 0 && X + Y <= D) ans = 0;
        else {
            int dist1 = X * X + Y * Y;
            int dist2 = (X - D) * (X - D) + Y * Y;
            int dist3 = X * X + (Y - D) * (Y - D);

            int minDist = dist1;
            ans = 1;

            if (dist2 < minDist) {
                minDist = dist2;
                ans = 2;
            }

            if (dist3 < minDist) ans = 3;
        }

        System.out.println(ans);
    }
}
