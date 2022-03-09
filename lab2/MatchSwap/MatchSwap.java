import java.util.*;

public class MatchSwap {


    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {
        Map<Character,Integer> charIntMap = new HashMap<Character,Integer>();
        for(int i = 0; i < list.size(); i++)
		{
		    String temp = list.get(i);
		    char ch = list.get(i).charAt(0);
            if(charIntMap.containsKey(ch))
            {
                list.set(i,list.get(charIntMap.get(ch)));
                list.set(charIntMap.get(ch),temp);
                charIntMap.remove(ch);
            }else
            {
                charIntMap.put(ch,i);
            }
        }
		return list;
    }

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("ap");
        List<String> output = matchSwap(list);
        for (String word : output) {
            System.out.print(word + " ");
        }
    }
}