public class StrCompression {

    public static String compress(String str){

        String newstr=" ";
        for(int i=0;i<str.length();i++){
            Integer counter=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                counter++;
                i++;
            }
            newstr += str.charAt(i);
            
            if(counter>1){
                newstr +=counter.toString();
            }
        }
        return newstr;

    }
    public static void main(String[] args) {
        String str="aaaabbbccd";
        System.out.println(compress(str));
    }
    
}
