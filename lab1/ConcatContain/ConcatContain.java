public class  ConcatContain {

    /**
     * Compute the smallest number of times source is concatenated with itself
     * so that the resulting string contains target.
     * For example, For example, source "ab" concatenated 2 times "ab"+"ab"+"ab" into "ababab"
     * contains target "baba".
     * @param source a non-empty string to be concatenated.
     * @param target a non-empty string that can be contained in repeatedly concatenated source.
     * @return the smallest number of times of the concatenation.
     */
    public static int concatContain(String source, String target) {

        //if the source string has already contains the target string
        if(source.indexOf(target) != -1)
        {
            return 0;
        }


        int times = target.length() / source.length();
        String concatenated = source;
        for(int i = 0; i< times; i++)
        {
            concatenated += source;
        }

        //System.out.println(concatenated);

        if( concatenated.indexOf(target) == -1)
        {
            concatenated += source;
            times += 1;
            if(concatenated.indexOf(target) == -1) {
                return -1;
            }
        }
        else
        {
            concatenated = source;
            for(int i = 0; i< times-1; i++)
            {
                concatenated += source;
            }
            //System.out.println(concatenated);
            if( concatenated.indexOf(target) == -1)
            {
                return times;
            }else
            {
                return  times -1;
            }
        }
        return  times;
    }

    public static  void main(String[] args)
    {
        System.out.println(concatContain("abc","cabcabcabcabca"));
    }


    
}