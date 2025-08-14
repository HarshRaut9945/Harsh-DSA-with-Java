
import java.util.HashMap;




class test{
    public static void main(String[] args) {
        HashMap<Integer,String> mp=new HashMap<>();
        mp.put(1, "Harsh");
        mp.put(2, "Raut");
        mp.put(3, "Ashish");
        mp.put(4, "Divesh");
      mp.get(1);
        mp.putIfAbsent(1, "Kgf");
        System.out.println(mp);

        // for(var e: mp.entrySet() ){
        //     System.out.print
        //     (e.getKey()+ ":"+ e.getValue() + " ");
            
        // }
    }
}