// Define a public class named Str01
public class Str01 {

    // Define a recursive method to remove all occurrences of 'a' from the given string
    static String removeA(String str, int idx) {
        // Base Case: If index reaches the length of the string, return an empty string
        if (idx == str.length()) return " ";
        
  
        // Recursive call: Get the result from the remaining substring
        String smallans = removeA(str, idx + 1);

      // Get the current character at the given index
      char currentchar = str.charAt(idx);


        // If the current character is not 'a', append it to the result
        if (currentchar != 'a') {
            return currentchar + smallans;
        } else {
            // If the current character is 'a', do not include it in the result
            return smallans;
        }
    }

    //SECOND APRROCH
    static String remove2(String s){
        if(s.length()==0) return  " ";
        String smallans=remove2(s.substring(1));
        char currecur=s.charAt(0);

        if(currecur!='a'){
            return currecur +smallans;
        }else{
            return smallans;
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define the input string
        String str = "abcadeafag";

        // Call the removeA function and print the result
        System.out.println(removeA(str, 0) + " ");
        System.out.println(remove2(str) + " ");
    }
}

// Explanation:
// Recursive Approach: The function removeA processes one character at a time.

// Base Case: If the index reaches the length of the string, return an empty string.

// Recursive Call: The function calls itself for the next character in the string.

// Character Check: If the current character is 'a', it is skipped; otherwise, it is added to the result.

// Final Output: The modified string is printed after all 'a' characters are removed.