import java.util.Scanner;

public class ompxxx {

    public static int primePelindrome(int area) {
        int inverse = 0;
        while(area >0){

            int rem = area%10;
            inverse = (inverse*10)+rem;
            area = area/10;
        }

        if(area==inverse){
            return area;
        }      
    }

    public static void main(String[] args) {

        int res = primePelindrome(192);
        System.out.println(res);
    }
}
