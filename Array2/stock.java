public class stock {

    public static int BuyAndSellStock(int prices[])
    {
        int buyprice=Integer.MAX_VALUE;
    int MAxprofit=0;
    for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){  //profit
     int profit =prices[i]-buyprice; //today profit
     MAxprofit=Math.max(MAxprofit, profit);
        }
        else{
            buyprice=prices[i];
        }
    }
    return MAxprofit;
    }


    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
      System.out.println(BuyAndSellStock(prices));
    }
    
}
