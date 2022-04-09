public class testStaticDynamic {
    public static String nope() {
        return null;           // (1)
    }
    public static void main(String[] args) {
        String a = nope();     // (2)
        String b = null;       // (3)
        if (a.length() > 0) {  // (4)
            b = a;             // (5)
        }
                      // (6)
    }
}
