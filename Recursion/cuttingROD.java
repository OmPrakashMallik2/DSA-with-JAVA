public class cuttingROD {
    public static void main(String[] args) {
        int p[] = {5,3,5,8,4,6};
        int n = 5;
        System.out.println(cut_rod(p, n));
    }
    private static int cut_rod(int price[], int length) {
        if(length == 0) return 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            max = Math.max(max, price[i+1]+cut_rod(price, length-1-i));
        }
        return max;
    }
}
