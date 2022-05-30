import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectCoinsTest {

    @Test
    public void givenTestCase() {
        boolean[][] ccMatrix = {{true,  false, true,  true},
                                {true,  false, true,  false},
                                {true,  false, true,  false},
                                {false, false,  false, true},
                                {false, true,  false, true},
                                {true,  false, false, true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 10;

        for(int i=0;i<cc.placeMaxConnCoins().length;i++)
        {
            System.out.println(cc.placeMaxConnCoins()[i]);
        }

        assertEquals(8, cc.maxConnCoins());

    }

}
