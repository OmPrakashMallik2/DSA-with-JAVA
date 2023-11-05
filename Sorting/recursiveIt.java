public class recursiveIt {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 9, 8, 7, 6 };
        int target = 7;
        int n = a.length;
        int r = rec(a, n, target);
        sort(a);
        int r2 = bs_rec(a, 0, n - 1, target);
        int r3 = rec(a, n, target);
        System.out.println("itrative recurson : " + r);
        System.out.println("Binary s recurson : " + r2);
        System.out.println("itrative recurson : " + r3);
    }

    private static void sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int mn = i;
            for (int j = i; j < n; j++) {
                if (a[mn] > a[j]) {
                    mn = j;
                }
            }
            // swap
            int t = a[mn];
            a[mn] = a[i];
            a[i] = t;
        }
    }

    private static int rec(int[] a, int n, int target) {
        if (n == 0)
            return -1;
        else if (a[n - 1] == target)
            return n - 1;
        else
            return rec(a, n - 1, target);
    }


    private static int bs_rec(int[] a, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = (high + low) / 2;

        if (a[mid] == target) {
            return mid;
        } else if (a[mid] > target) {
            return bs_rec(a, low, mid - 1, target);
        } else {
            return bs_rec(a, mid + 1, high, target);
        }
    }
}