import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public boolean isIsomorphic(String s, String t) {
        
        // If lengths don't match, strings can't be isomorphic
        if (s.length() != t.length()) {
            return false;
        }

        // Map to store character mappings from s -> t
        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char original = s.charAt(i);     // character from string s
            char replacement = t.charAt(i);  // corresponding character from string t

            // If original char is not already mapped
            if (!charMap.containsKey(original)) {
                // Check if replacement char is already used for another mapping
                if (!charMap.containsValue(replacement)) {
                    charMap.put(original, replacement);  // create new mapping
                } else {
                    return false; // replacement already used for another char
                }
            } else {
                // If mapping exists, it must match the replacement
                char mappedChar = charMap.get(original);
                if (mappedChar != replacement) {
                    return false; // mapping mismatch
                }
            }
        }

        return true; // all checks passed
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test cases
        System.out.println(sol.isIsomorphic("egg", "add")); // true
        System.out.println(sol.isIsomorphic("foo", "bar")); // false
        System.out.println(sol.isIsomorphic("paper", "title")); // true
        System.out.println(sol.isIsomorphic("badc", "baba")); // false
    }
}
