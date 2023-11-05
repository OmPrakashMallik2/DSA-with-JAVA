public class recursionop3 {
    public static void printName(int i,int x){

        if(i>x) {
            return;
        }
        printName(i+1, x);
        System.out.print(i+"  ");
    }
    public static void main(String[] args) {
        // System.out.println();
        printName(1,10);
    }
}
