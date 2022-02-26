import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class HailStoneTest {

    @Test
    public void testHailstone() {
        List<Integer> expected0 = Arrays.asList(5, 16, 8, 4, 2, 1);
        List<Integer> actual0 = Hailstone.hailstone(5);
        List<Integer> expected1 = Arrays.asList(3,10,5,16,8,4,2,1);
        List<Integer> actual1 = Hailstone.hailstone(3 );


        assertEquals(expected0, actual0);
        assertEquals(expected1, actual1);



    }

    @Test
    public void testMaxHailstone() {
        int expectedMax = 16;
        assertEquals(expectedMax, Hailstone.maxHailstone(5));



    }

}
