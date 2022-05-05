
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ARDequeTest {
    @Test
    public void testSet_1() {
        ARDeque<String> deque = new ARDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        for (String item : deque) {
            System.out.print(item + " ");
        }
    }
}
