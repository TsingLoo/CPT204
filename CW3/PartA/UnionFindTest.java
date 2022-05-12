import org.junit.Test;
import static org.junit.Assert.*;

public class UnionFindTest {

    @Test
    public void testDS_1() {
        UnionFind uf = new UnionFind(4);
        uf.union(1, 0);
        assertTrue(uf.isSameGroup(1, 0));
        assertEquals(2, uf.sizeOf(1));
        assertEquals(0, uf.parent(1));
        assertEquals(-2, uf.parent(0));
        uf.union(3, 2);
        assertFalse(uf.isSameGroup(3, 1));
        uf.union(3, 1);
        assertEquals(2, uf.parent(3));
        assertTrue(uf.isSameGroup(3, 1));
        assertEquals(0, uf.parent(3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTest_1() {
        UnionFind uf = new UnionFind(5);
        uf.validate(10);
    }


}
