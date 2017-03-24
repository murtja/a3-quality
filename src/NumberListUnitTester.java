import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class NumberListUnitTester {

    @Test
    public void testLargestSmallestOnEmptyNumberList() {
        NumberList nl = new NumberList();

        try {
            int l = nl.getLargest();
            fail();
        } catch (NoNumbersSeenException e){
            assertTrue(true);
        }

        try {
            int l = nl.getSmallest();
            fail();
        } catch (NoNumbersSeenException e){
            assertTrue(true);
        }
    }

    @Test
    public void testLargestSmallestOnNumberList(){
        int num = 5;
        NumberList nl = new NumberList(num);

        try{
            assertEquals(nl.getLargest(), nl.getSmallest());
            assertEquals(5, nl.getLargest());
        } catch (NoNumbersSeenException e){
            fail();
        }

    }

    @Test
    public void testLargestSmallestOnNumberListDefaultConstructor(){
        int num = 5;
        NumberList nl = new NumberList();

        nl.addValue(5);

        try{
            assertEquals(nl.getLargest(), nl.getSmallest());
            assertEquals(5, nl.getLargest());
        } catch (NoNumbersSeenException e){
            fail();
        }

    }

    @Test
    public void testLargestSmallestOnNumberListMultiple(){
        int num = 5;
        NumberList nl = new NumberList(num);

        nl.addValue(10);
        try{
            assertEquals(5, nl.getSmallest());
            assertEquals(10, nl.getLargest());
        } catch (NoNumbersSeenException e){
            fail();
        }

    }

    @Test
    public void testLargestSmallestOnNumberListMultipleFourOutOfOrder(){
        int num = 5;
        NumberList nl = new NumberList();

        nl.addValue(5);
        nl.addValue(100);
        nl.addValue(2);
        nl.addValue(10);
        try{
            assertEquals(2, nl.getSmallest());
            assertEquals(100, nl.getLargest());
        } catch (NoNumbersSeenException e){
            fail();
        }

    }

    @Test
    public void testSumAndCountValues(){
        NumberList nl = new NumberList();

        assertEquals(0, nl.getCount());
        assertEquals(0, nl.getSum());

        nl.addValue(10);

        assertEquals(1, nl.getCount());
        assertEquals(10, nl.getSum());

        nl.addValue(18);

        assertEquals(2, nl.getCount());
        assertEquals(28, nl.getSum());
    }

}
