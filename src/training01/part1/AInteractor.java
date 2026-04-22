package training01.part1;

import java.util.Scanner;

public class AInteractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte r = sc.nextByte();
        byte i = sc.nextByte();
        byte c = sc.nextByte();
        byte ans;

        if (i == 0) {
            if (r != 0) ans = 3;
            else ans = c;
        } else if (i == 1) {
            ans = c;
        } else if (i == 4) {
            if (r != 0) ans = 3;
            else ans = 4;
        } else if (i == 6) {
            ans = 0;
        } else if (i == 7) {
            ans = 1;
        } else { ans = i; }

        System.out.println(ans);

    }
}
