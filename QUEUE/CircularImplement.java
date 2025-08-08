public class CircularImplement {

    public static class CQA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = val;
            } else if (r < arr.length - 1) {
                arr[++r] = val;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[r] = val;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            int val = arr[f];
            if (size == 1) {
                f = r = -1;
            } else if (f == arr.length - 1) {
                f = 0;
            } else {
                f++;
            }
            size--;
            return val;
        }

        int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            return arr[f];
        }

        public void Display() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        CQA hr = new CQA();

        hr.add(10);
        hr.add(20);
        hr.add(30);
        hr.add(40);
        hr.add(50);
        hr.Display(); // 10 20 30 40 50

        System.out.println("Removed: " + hr.remove()); // 10
        System.out.println("Removed: " + hr.remove()); // 20
        hr.Display(); // 30 40 50

        hr.add(60);
        hr.add(70);
        hr.Display(); // 30 40 50 60 70 (circular add)

        System.out.println("Peek: " + hr.peek()); // 30
    }
}
