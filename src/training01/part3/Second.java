package training01.part3;

import java.util.Scanner;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        //Дан словарь из N слов, длина каждого не превосходит K
        //В записи каждого из M слов текста (каждое длиной до K) может быть пропущена одна буква. Для каждого слова сказать, входит ли оно (возможно, с одной пропущенной буквой), в словарь
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] dictionary = new String[N];
        for (int i = 0; i < N; i++) {
            dictionary[i] = sc.next();
        }

        int M = sc.nextInt();
        String[] text = new String[M];
        for (int i = 0; i < N; i++) {
            text[i] = sc.next();
        }

        boolean[] result = wordsInDict(dictionary, text);

        for (boolean res : result) {
            System.out.println(res ? "Yes" : "No");
        }
    }

    public static boolean[] wordsInDict(String[] dictionary, String[] text) {
        Set<String> goodWords = new HashSet<>();
        for (String word : dictionary) {
            goodWords.add(word);
            for (int i = 0; i < word.length(); i++) {
                String newWord = word.substring(0,i) + word.substring(i + 1);
                goodWords.add(newWord);
            }
        }
        boolean[] ans = new boolean[text.length];

        for (int i = 0; i < text.length; i++) {
            ans[i] = goodWords.contains(text[i]);
        }
        return ans;
    }
}
