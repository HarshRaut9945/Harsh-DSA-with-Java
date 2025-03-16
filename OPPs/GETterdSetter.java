     //Encapsulation
    public class GETterdSetter {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        // p1.color="red";
        // System.out.println(p1.color);

        p1.settip(18);
        System.out.println(p1.gettip());

    }
}

class pen {
    private String color;
    private int tip;

    // geteer
    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    // setter
    void setcolor(String newcolor) {
        this.color = newcolor;
    }

    void settip(int newtip) {
        this.tip = newtip;
    }
}