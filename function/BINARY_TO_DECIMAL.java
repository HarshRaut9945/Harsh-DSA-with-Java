public class BINARY_TO_DECIMAL {

    public static void binTodec(int binNum){
      int  mynum =binNum;
        int pow=0;
        int dec=0;
        while (binNum>0) {
           int lastdigit= binNum%10;
            dec=dec+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("binary form of "+mynum+ " =" +dec);
    }

    public static void main(String[] args) {
        binTodec(1000);
    }
}