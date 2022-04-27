import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        assert  false;
        final char[] letters = new char[] {'a','e','i','o','u'};
        //letters = new char[] {'x'};
        letters[0] = 'z';
        assert (letters[0]  =='p');

    }


}