package training01.part4;

import java.util.*;

public class Second {
    public static void main(String[] args) {
        //На шахматной доске N * N находится M ладей (ладья бьёт клетки на той же горизонтали или вертикали до ближайшей занятой)
        //Определите сколько пар ладей бьют друг друга. Ладьи задаются парой чисел I и J, обозначающих координаты клетки
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Integer> rows = new HashMap<>();
        Map<Integer, Integer> cols = new HashMap<>();

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            rows.put(r, rows.getOrDefault(r, 0) + 1);
            cols.put(c, cols.getOrDefault(c, 0) + 1);
        }

        long result = countPairs(rows) + countPairs(cols);
        System.out.println(result);
    }

    public static long countPairs(Map<Integer, Integer> map) {
        long pairs = 0;

        for (int count : map.values()) {
            pairs += (long) count * (count - 1) / 2;
        }
        return pairs;
    }
}
