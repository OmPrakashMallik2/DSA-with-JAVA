public class Pelindrome {
    public static void main(String[] args) {

        int a = 1215;
        String r  = Integer.toString(a);

        System.out.println(pelindrome(r, 0, r.length()));
    }

    private static boolean pelindrome(String s, int i, int f){
        if(i >= f-1){
            return true;
        }
        if(s.charAt(i) != s.charAt(f-1)){
            return false;
        }

        return pelindrome(s, i+1, f-1);
    }

}