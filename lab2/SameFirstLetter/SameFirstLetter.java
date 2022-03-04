import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {

        Map<String, String> strMap = new HashMap<String, String>();
        String strValue = "";

        for(String str : list)
        {
            String ch = Character.toString(str.charAt(0));
            if(strMap.containsKey(ch))
            {
                strValue  = strMap.get(ch) + ","+ str;
            }else
            {
                strValue = str;
            }
            strMap.put(ch, strValue);
        }
		
		return strMap;
    }

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Alice", "Bob", "apple", "banana","bob");
        Map<String, String> map = sameFirstLetter(list);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

}