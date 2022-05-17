import java.util.HashMap;

public class LectureQuiz {
    public static void main(String[] args)
    {
        HashMap<String,Integer> a = new HashMap<>(),b = new HashMap<>();

        a.put("c",300);
        b.put("c",300);

        //what's wrong with this code ?

        int i = a.get("c");
        int j = b.get("C");

        System.out.print(i);

    }
}
