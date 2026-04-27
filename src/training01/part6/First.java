package training01.part6;

import java.util.Scanner;

public class First {
    //В управляющий совет школы входят родители, учителя и учащиеся школы, причём родителей должно быть не менее одной трети от общего числа членов совета. В настоящий момент в совет входит N человек, из них K родителей
    //Определите сколько родителей нужно дополнительно ввести в совет, чтобы их число стало составлять не менее трети от числа членов совета
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int L = 0;
        int R = N;

        while (L < R) {
            int M = (L + R) / 2;
            if ((K + M) * 3 >= N + M) R = M;
            else { L = M + 1;}
        }

        System.out.println(L);
    }
}
