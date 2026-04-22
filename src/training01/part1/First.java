package training01.part1;

import java.util.*;

public class First {
    public static void main(String[] args) {
        // Найти самый часто встречающийся символ в строке. Если несколько символов встречаются одинаково часто, то можно вывести любой

        // Решение 1 через O(N2). Перебор всех позиций и для каждой позиции в строке ещё раз перебор всех позиций. В случае совпадения прибавить к счетчику 1. Найти максимальное значение счётчика
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        char answer = chars[0];
        int answerCount = 0;

//        for (int i = 0; i < chars.length; i++) {
//            int nowCount = 0;
//            for (int j = 0; j < chars.length; j++) {
//                if (chars[i] == chars[j]) nowCount++;
//            }
//            if (nowCount > answerCount) {
//                answer = chars[i];
//                answerCount = nowCount;
//            }
//        }
//        System.out.println(answer);


        //Решение 2 O(NK). Перебор все символов, встречающихся в строке, затем перебрать все позиции и в случае совпадения прибавить к счетчику единицу
//        Set<Character> uniqueChars = new HashSet<>();
//        for (char c : str.toCharArray()) {
//            uniqueChars.add(c);
//        }
//
//        for (char now : uniqueChars) {
//            int nowCount = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (now == str.charAt(j)) nowCount++;
//            }
//            if (nowCount > answerCount) {
//                answer = now;
//                answerCount = nowCount;
//            }
//        }
//        System.out.println(answer);

        //Решение 3 O(N * K) = O(N).Создание мапы, где ключом является символ, а количество значением. Если впервые встретился символ, то создаётся элемент в мапе
        Map<Character, Integer> map = new HashMap<>();
        for (char now : chars) {
            if (!map.containsKey(now)) {
                map.put(now, 1);
            } else {
                map.put(now, map.get(now) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > answerCount) {
                answer = entry.getKey();
                answerCount = entry.getValue();
            }
        }

        System.out.println(answer);
    }
}
