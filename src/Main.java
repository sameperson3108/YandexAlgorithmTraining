import java.util.*;


public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        Map<String, Character> library = new HashMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String word = sc.next();
//            library.put(word, word.charAt(0));
//        }
//
//        for (int i = 0; i < k; i++) {
//            char c = sc.next().charAt(0);
//            if (library.containsValue(c)) {
//
//            }
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] first = new String[n];
        String[] second = new String[n];

        for (int i = 0; i < n; i++) {
            first[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            second[i] = sc.next();
        }
    }
}