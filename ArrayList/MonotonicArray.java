import java.util.ArrayList;

public class MonotonicArray {

    static boolean  monotonic( ArrayList<Integer> list){
        int n=list.size();
        boolean increasing=false;
        boolean decreasing=false;

        for(int i=0;i<n-1;i++){

            if(list.get(i)<list.get(i+1)){
                increasing=true;
            }else if (list.get(i)>list.get(i+1)){
                decreasing=true;
            }
            
        }
          if(increasing==true && decreasing==true){
            return false;
          }
          return  true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(16);
        list.add(16);
        list.add(17);
        list.add(18);
        System.out.println(monotonic(list));
    }
}