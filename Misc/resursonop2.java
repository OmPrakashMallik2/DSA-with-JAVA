import java.util.Scanner;

public class resursonop2 {
    public static int powerOf(int x, int y) {
        if(y==0){
            return 1;
        }

        return x*powerOf(x, y-1);
    }

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = op.nextInt();
        System.out.print("Enter b : ");
        int b = op.nextInt();

        System.out.println("a to the power b is : "+powerOf(a, b));
    }
}
