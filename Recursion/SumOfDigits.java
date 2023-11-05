public class SumOfDigits {
    public static void main(String[] args) {
        int a = 1234;
        System.out.println(sumDigits(a));
    }
    
    private static int sumDigits(int n){
        if(n < 10){
            return n;
        }
        int remender = n % 10;
        return remender + sumDigits(n/10);
    }
}
