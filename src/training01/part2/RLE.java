package training01.part2;

import java.util.Scanner;

public class RLE {
    public static void main(String[] args) {
        //На ввод подаётся строка вида AAAABBCCCXYYYY
        //Написание функции RLE, которая на выходе даст строку вида A4B2C3XY4...
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(RLE(str));
    }

    public static String RLE(String str) {
        char[] ch = str.toCharArray();
        char lastSym = ch[0];
        int lastPos = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != lastSym) {
                ans.append(Pack(lastSym, i - lastPos));
                lastPos = i;
                lastSym = ch[i];
            }
        }
        ans.append(Pack(lastSym, ch.length - lastPos));
        return ans.toString();
    }

    public static String Pack(char c, int cnt) {
        if (cnt > 1) {
            return c + Integer.toString(cnt);
        }
        return Character.toString(c);
    }
}
