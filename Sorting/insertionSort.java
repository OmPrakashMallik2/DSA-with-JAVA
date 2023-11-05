import java.util.Arrays;

public class insertionSort {

    // INSERTION SORT
    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 2, 0, 2, 8, 1, 4, 9, 3 };
        int n = arr.length;
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}