public class NumberOf1 {

    public static void main(String[] args)
    {
        System.out.println(NumberOf1Method(10));
    }

    public static int NumberOf1Method(int n) {

        int count = 0;
        for(int i=0;i<32;i++)
        {

            count = count + (n&1);
            n = n >>1;

        }

        return count;
    }
}
