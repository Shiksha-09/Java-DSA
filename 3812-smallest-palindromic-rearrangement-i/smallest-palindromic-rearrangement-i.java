class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char mid = ' ';

        // Build the lexicographically smallest first half
        for (int i = 0; i < 26; i++) {

            char ch = (char) (i + 'a');

            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append(ch);
            }

            // Find the middle character
            if (freq[i] % 2 == 1) {
                mid = ch;
            }
        }

        // Create the second half by reversing the first half
        String secondHalf = new StringBuilder(firstHalf)
                                .reverse()
                                .toString();

        // Combine both halves and the middle character
        return firstHalf.toString()
                + (mid == ' ' ? "" : String.valueOf(mid))
                + secondHalf;
    }
}