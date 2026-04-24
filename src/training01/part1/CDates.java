package training01.part1;

import java.util.*;

public class CDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int ans = 1;
        if (x <= 12 && y <= 12 && x != y) ans = 0;
        System.out.println(ans);
    }
}
