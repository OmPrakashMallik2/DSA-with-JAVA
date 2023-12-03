
public class Test {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 4, 10, 12, 14, 16, 18, 20 };
        int k = 4;
        int res = BinarySearch(arr, k);
        System.out.println(res);
    }

    static int BinarySearch(int a[], int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] > target) {
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
