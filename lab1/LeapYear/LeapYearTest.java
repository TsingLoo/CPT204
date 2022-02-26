import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {

    @Test
    public void testLeapYear()
    {
        assertEquals(true,LeapYear.isLeapYear(0));
        assertEquals(true,LeapYear.isLeapYear(2020));
    }

    @Test
    public void testNonLeapYear()
    {
        assertEquals(false,LeapYear.isLeapYear(2019));

    }
	
    
}