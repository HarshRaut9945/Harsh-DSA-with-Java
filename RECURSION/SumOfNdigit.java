public class SumOfNdigit {

    // Recursive function to calculate the sum of digits of a number
    static int SD(int n) {
        // Base case: If the number is a single digit, return it
        if (n >= 0 && n <= 9) {
            return n;
        }
        
        // Recursive case: Extract last digit (n % 10) and call SD on the remaining number (n / 10)
        return n % 10 + SD(n / 10);
    }

    public static void main(String[] args) {
        int n = 123; // Input number
        System.out.println("Sum of digits of " + n + " is: " + SD(n));
    }
}
