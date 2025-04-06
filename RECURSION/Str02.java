public class Str02 {

    static String reverse(String s,int idx){

        if(idx==s.length()) return " ";

        String smallans=reverse(s, idx+1);

        char curren=s.charAt(idx);

        return  smallans + curren;
    }
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(reverse(s, 0));
        sout.println("Hello, World!");
    
    }
}
