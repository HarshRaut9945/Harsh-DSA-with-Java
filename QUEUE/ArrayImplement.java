
public class ArrayImplement {

    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("queue is full");
                return;
            }

            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            } else {
                arr[r + 1] = val;
                r++;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            f++;
            size--;
            return arr[f - 1];

        }

        public int peek() {
            return arr[f];
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Quen is Empty");

            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
       queueA hr=new queueA();
           hr.Display();
           hr.add(1);
           hr.add(2);
           hr.add(3);
           hr.add(4);
           hr.add(15);
           hr.Display();
           hr.remove();
           hr.Display();
          System.out.println(hr.peek()); 
    }
}
