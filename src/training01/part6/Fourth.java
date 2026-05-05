package training01.part6;

public class Fourth {
    public static void main(String[] args) {
        //Задана отсортированная по неубыванию последовательность из N чисел и число X
        // Необходимо определить индекс первого числа в последовательности, которое больше либо равно X. Если такого нет, то вернуть N
        int[] nums = {1, 3, 3, 5, 7, 9};
        int X = 4;

        System.out.println(sol(nums, X));
    }

    public static int sol(int[] nums, int X) {
        int L = 0;
        int R = nums.length;

        while (L < R) {
            int mid = (L + R) / 2;

            if (nums[mid] < X) {
                L = mid + 1;
            } else {
                R = mid;
            }
        }

        return L;
    }
}
