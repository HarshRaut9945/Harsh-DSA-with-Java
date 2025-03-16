public class UseHyb {
    public static void main(String[] args) {
        D hh=new D();
        hh.show();
        hh.input();
        hh.output();
        B kk=new B();
        kk.disp();
        kk.show();
        
    }
}


class A{
    void show(){
        System.out.println("my name is harsh");
    }
}
class B extends A{
    void disp(){
        System.out.println("My name is Raut");
    }
}
class c extends A{
    void input(){
        System.out.println("my name is akhilesh");
    }
}
class D extends c{
    void output(){
        System.out.println("My namme is modi");
    }
}