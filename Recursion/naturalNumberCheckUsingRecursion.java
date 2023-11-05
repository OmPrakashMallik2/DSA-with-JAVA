import java.util.Arrays;

public class naturalNumberCheckUsingRecursion {
    public static void main(String[] args) {
        System.out.println(naturalNumber(5));
        naturalPrint(5);

        int a[] = naturalArray(5);
        System.out.println(Arrays.toString(a));
    }

    // to generat array of n natural numbers
    private static int[] naturalArray(int n){
        if(n == 1){
            int a[] = {n}; 
            return a; 
        }

        int preArr[] = naturalArray(n-1);
        int newArr[] = Arrays.copyOf(preArr, preArr.length+1);
        newArr[preArr.length] = n;

        return newArr;
    }

    // print n natural numbers
    private static void naturalPrint(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        naturalArray(n-1);
        System.out.print(n+" ");
    }

    // sum of n natural number.
    private static int naturalNumber(int n) {
        if(n == 1){
            return n;
        }
        return n+naturalNumber(n-1);
    }
}
