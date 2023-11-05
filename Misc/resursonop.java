import java.util.Scanner;

public class resursonop {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int n = op.nextInt();

        int res= sumOfN(n);

        System.out.println("sum is : "+res);

    }

    public static int sumOfN(int x){
        if(x==1){
            return 1;
        }

        return x+sumOfN(x-1);
    }
}
