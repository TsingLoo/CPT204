import org.junit.Test;
import static org.junit.Assert.*;

public class LLDequeTest {

    @Test
    public void testEXERCISE() {
        LLDeque<String> deque = new LLDeque<>();
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());
        deque.addFirst("b");
        deque.addFirst("a");
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));

        assertEquals("a", deque.delFirst());
        assertEquals("b", deque.iterGet(0));
    }
	
	//	add more test cases
	
	
	

    @Test
    public void testASSIGNMENT() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        assertEquals("c", deque.recGet(2));
        assertEquals("a", deque.delFirst());
        assertEquals("c", deque.delLast());
        assertEquals("b", deque.recGet(0));
    }
	
	//	add more test cases
    @Test
    public void testCopyConstructor() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirst("a");
        LLDeque<String> copyDeque = new LLDeque<>(deque);
        deque.addFirst("x");
        copyDeque.addFirst("y");
        assertEquals("x", deque.iterGet(0));
        assertEquals("a", deque.iterGet(1));
        assertEquals("y", copyDeque.iterGet(0));
        assertEquals("a", copyDeque.iterGet(1));
    }

    @Test
    public void testCopyConstructor1() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirst("dequqa");
        deque.addFirst("dequeb");
        deque.addFirst("dequec");
        LLDeque<String> copyDeque = new LLDeque<>(deque);
        deque.addFirst("x");
        copyDeque.addFirst("y");
        copyDeque.addFirst("a");
        assertEquals("x", deque.iterGet(0));
        //assertEquals("a", deque.iterGet(1));
        assertEquals("y", copyDeque.iterGet(1));
        assertEquals("a", copyDeque.iterGet(0));
        assertEquals("dequec", copyDeque.iterGet(2));
        assertEquals("dequeb", copyDeque.iterGet(3));
    }


    @Test
    public void testNullIllegalArgument() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirst("c");
        //deque.addLegalFirst("b", "x");
        //deque.addLegalFirst(null, "a");
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));
        assertEquals("c", deque.iterGet(2));
    }




}
