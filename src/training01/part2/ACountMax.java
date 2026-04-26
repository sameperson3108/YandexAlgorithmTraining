package training01.part2;

import java.util.*;

public class ACountMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num;
        do {
            num = sc.nextInt();
            if (num == 0) break;
            list.add(num);
        } while (true);

        Integer max = Collections.max(list);

        int ans = 0;

        for (int n : list) {
            if (n == max) ans++;
        }

        System.out.println(ans);
    }
}
