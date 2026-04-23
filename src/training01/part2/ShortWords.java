package training01.part2;

import java.util.*;

public class ShortWords {
    public static void main(String[] args) {
        //Вывести все самые короткие слова через пробел
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
        }

        int minLen = words[0].length();
        for (String word : words) {
            if (word.length() < minLen) minLen = word.length();
        }

        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            if (word.length() == minLen) ans.append(word).append(" ");
        }

        System.out.println(ans);
    }
}
