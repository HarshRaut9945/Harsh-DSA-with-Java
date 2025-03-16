public class constUer {

    public static void main(String[] args) {
        student s1=new student();
        s1.name="vidansu raut";
        s1.age=21;
        s1.rollno=556600;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollno);
        s1.marks[0]=100;
        s1.marks[1]=150;
        s1.marks[2]=200;
       student s2=new student(s1);
     s2.rollno=2201326;
     System.out.println(s2);
    }
}
  class student{
    String name;
    int age;
    int rollno;
    int marks[];
    student(){
        marks=new int[3];
   System.out.println("contructoe can be called");
    }
    student(student s1){    //coppy constructor
        marks=new int[3];
      this.name=s1.name;
      this.age=s1.age;
      for(int i=0;i<marks.length;i++){
        this.marks[i]=s1.marks[i];
      }
    }
  }