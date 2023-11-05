public class trythis {
    public static void main(String[] args) {

        String s = "hello";
        reverseWords(s, 0, s.length());
        System.out.println(s);
    }

    static void reverseWords(String s, int i, int f) {

        if(i > f){
            return;
        }
        char temp = s.charAt(i);
        s.charAt(i) = s.charAt(f);
        s.charAt(f) = temp;

        reverseWords(s, i+1, f-1);
    }
}