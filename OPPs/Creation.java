public class Creation {

   static  class pen{
     String color;
     int tip;
     void changecolor( String  newcolor){
        color=newcolor;
     }
     void setTip(int newtip){
        tip=newtip;
     }
    }
    public class bankaccount {
      public  String name;
      private int password;

  public  void setpassword(int pwd){
password=pwd;
    }
        
    }
    public static void main(String[] args) {
        pen p1=new pen();
        p1.changecolor("blue");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        //bankaccount 
        // bankaccount bb=new bankaccount();
        // bb.name="harsh";
        // bb.password=1555122;
        
    }
}
