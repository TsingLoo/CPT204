public class NumberOf1 {

    public static void main(String[] args)
    {
        System.out.println(NumberOf1Method(10));
    }

    public static int NumberOf1Method(int n) {

        int count = 0;
        while(n != 0) {
            n = n&(n-1);
            ++count;
        }


        return count;
    }
}
