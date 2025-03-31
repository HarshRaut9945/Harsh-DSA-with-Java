
import java.util.ArrayList;

      //find the all index of array and return in the form of array list 

public class IndiesOfArrayList {

    static ArrayList<Integer> allindies(int arr[],int target,int idx){  
        ArrayList<Integer> ans= new ArrayList<>();
        if(idx>= arr.length){
            return  ans;
        }
        //self work
        if(arr[idx]==target){
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallAns=allindies(arr, target, idx+1);
        ans.addAll(smallAns);
        return  ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5,4};
        int target=4;
        ArrayList<Integer> ans=allindies(arr, target, 0);
       System.out.println(ans);
    }
}
