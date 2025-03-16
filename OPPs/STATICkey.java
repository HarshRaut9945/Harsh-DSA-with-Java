public class STATICkey {
    public static void main(String[] args) {
        Students ss= new Students();
        // Students student1 = new Students();
        ss.setname("Harsh Raut");
        // ss.getname();
        System.out.println(ss.getname());
        ss.scho="static is used";
        Students cc=new Students();
        System.out.println(cc.scho);
        Students rr=new Students();
        rr.scho="static is changed by new class";
        System.out.println(cc.scho);
        

        
    }
    
}


class Students{

String name;
    int roll;
   static String scho;

   void setname(String name){
    this.name=name;
   }

   String getname(){
    return this.name;
   }

}
