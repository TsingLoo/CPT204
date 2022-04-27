import org.junit.Test;
import static org.junit.Assert.*;

public class WeightedQuickUnionTest {

    @Test
    public void testWeightedQUDS_1() {
        WeightedQuickUnion uf = new WeightedQuickUnion(4);
        uf.union(1, 0);
        assertEquals(true, uf.isSameGroup(1, 0));
        assertEquals(0, uf.parent(1));
        assertEquals(-2, uf.parent(0));
        uf.union(3, 2);
        assertEquals(false, uf.isSameGroup(2, 1));
        uf.union(3, 1);
        assertEquals(true, uf.isSameGroup(2, 1));
        assertEquals(0, uf.parent(2));
        assertEquals(4, uf.sizeOf(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTest_1() {
        WeightedQuickUnion uf = new WeightedQuickUnion(5);
        uf.validate(10);
    }
	
	
	// add your own Unit Tests and Integration Tests here
	
	
	
	
	
	
}
