import java.util.*;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        String returnStr = "";

        for(String str : list) {
            if (map.containsKey(str)) {
                returnStr += str;
                map.remove(str);
            } else {
                map.put(str,1);
            }
        }
        return returnStr;
    }

    public static void main(String[] args)
    {
        double prob = 1/5;

    }

}