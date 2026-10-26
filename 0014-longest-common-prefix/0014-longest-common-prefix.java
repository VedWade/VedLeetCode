public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        // Take the first word as the baseline string
        String firstWord = strs[0];
        
        // Loop through every character of the first word
        for (int i = 0; i < firstWord.length(); i++) {
            char currChar = firstWord.charAt(i);
            
            // Compare this character with the same position in all other words
            for (int j = 1; j < strs.length; j++) {
                // Stop if the current word is shorter than index i 
                // OR if the characters do not match
                if (i == strs[j].length() || strs[j].charAt(i) != currChar) {
                    return firstWord.substring(0, i);
                }
            }
        }
        
        return firstWord;
    }
}