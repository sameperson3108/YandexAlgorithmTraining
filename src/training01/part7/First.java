package training01.part7;

import java.util.*;

public class First {
    //Сайт посетило N человек, для каждого известно время входа на сайт Ini и время выхода с сайта Outi.
    //Считает, что человек был на сайте с момента Ini по Outi включительно
    //Определить, какое максимальное количество человек было на сайте одновременно
    static class Event {
        int time;
        int type; // +1 = вход, -1 = выход

        Event(int time, int type) {
            this.time = time;
            this.type = type;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int in = sc.nextInt();
            int out = sc.nextInt();

            events.add(new Event(in, +1));
            events.add(new Event(out, -1));
        }

        // Сортировка:
        // 1) по времени
        // 2) если время одинаковое → вход (+1) раньше выхода (-1)
        Collections.sort(events, (a, b) -> {
            if (a.time != b.time) return Integer.compare(a.time, b.time);
            return Integer.compare(b.type, a.type); // вход раньше выхода
        });

        int current = 0;
        int max = 0;

        for (Event e : events) {
            current += e.type;
            max = Math.max(max, current);
        }

        System.out.println(max);
    }
}
