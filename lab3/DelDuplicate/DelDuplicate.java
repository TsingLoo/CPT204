public class DelDuplicate {
	
    /**
     * Remove adjacent duplicate characters in a string.
     * For example, delDuplicate("aaabbc") → "abc".
     * @param input is the input string.
     * @return the resulting string.
     */
    public static String delDuplicate(String input) {
        if(input.length()==0)
        {
            return input;
        }else {
            return delDuplicateHelper(input, 0, "");
        }
    }

    public static String delDuplicateHelper(String input,int pos, String buildString)
    {
        if(pos > input.length()-2)
        {
            buildString += Character.toString(input.charAt(pos));
            return buildString;
        }

        if(input.charAt(pos)!=input.charAt(pos+1))
        {
            buildString += Character.toString(input.charAt(pos));

        }

        return delDuplicateHelper(input,pos+1,buildString);
    }

    public static void main(String[] args)
    {
        String input = "abaaaaasddddddsdsssdssdwweqweqqq";
        System.out.println(delDuplicate(input));
    }
}
