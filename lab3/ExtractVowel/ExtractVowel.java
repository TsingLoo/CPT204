public class ExtractVowel {
    /**
     * Extract the vowels from the input string.
     * For example, extractVowel("i love you 3000") → "ioeou".
     * @param str is the input string.
     * @return the vowels of the input string.
     */
    public static String extractVowel(String str) {
		// call your recursive helper method
        return extractVowelHelper(str, 0, "");
    }

    private static String extractVowelHelper(String str, int start, String vowels) {
        // base case
        
		
		
        // recursive step
        
		
		return null;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
