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
        if(str.length()==0)
        {
            return "";
        }else {
            // base case
            if (start == str.length() - 1) {
                if (isVowel(str.charAt(start))) {
                    vowels += Character.toString(str.charAt(start));
                }
                return vowels;
            }

            if (isVowel(str.charAt(start))) {
                vowels += Character.toString(str.charAt(start));

            }
            start += 1;
            // recursive ste
            return extractVowelHelper(str, start, vowels);
        }
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args)
    {
        String input = "                sas";
        System.out.println(extractVowel(input));

    }
}
