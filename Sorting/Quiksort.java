import java.util.Arrays;

public class Quiksort {
    public static void main(String[] args) {
        int[] arr = { -7, -300, -5, -2, 2, 8, 1, 4, 9, -30, 0 };
        System.out.println(Arrays.toString(arr));

        Qsort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void Qsort(int a[], int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = a[mid];

        while (s <= e) {
            while (pivot > a[s]) {
                s++;
            }
            while (pivot < a[e]) {
                e--;
            }

            if ((s <= e)) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;

                s++;
                e--;
            }
        }

        Qsort(a, low, e);
        Qsort(a, s, hi);

    }
}
