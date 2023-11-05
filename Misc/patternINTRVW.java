import java.util.Scanner;

public class patternINTRVW {

	public static void printBinary(int[] binary, int id) {
		// Write your code here.
        for (int i = id - 1; i >= 0; i--){
            System.out.print(binary[i] + "");
        }
	}
    
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        
        int num = op.nextInt();
        System.out.println(printBinary(null, num));
    }
}
	