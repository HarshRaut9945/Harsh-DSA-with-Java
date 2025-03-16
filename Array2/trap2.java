 class trap2 {

   public  static int TrappedRainWater(int height[]){
        int n=height.length;
        int leftmax[]= new int[n];
        //left  max
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1] );
        }
        //right max
        int righttmax[]=new int[n];
        righttmax[n-1]=height[n-1];
        for( int i=n-2;i>0;i--){
            righttmax[i]=Math.max(height[i], righttmax[i+1]);
        }
        
        // for trapeed water
        int trappedwater=0;
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(leftmax[i], righttmax[i]);

           trappedwater += waterlevel-height[i];
        }
                    return trappedwater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       System.out.println( TrappedRainWater(height));
    }
    
}
