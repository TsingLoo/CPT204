public class removeXcode {
    public static String removeX(String input) {

        if (input.length() == 0) {
            return input;
        }


        // recursive step
        else {
            if (input.charAt(0) == 'X') {
                return removeX(input.substring(1));
            } else {
                return input.charAt(0) + removeX(input.substring(1));
            }
        }

    }

    public static  void main(String[] args)
    {
        String s = "ABDCX";
        System.out.println(removeX(s));

    }


}
