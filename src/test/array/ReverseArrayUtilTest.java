package array;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayUtilTest {


    @Test
    public void testingWithNullValue()
    {
        int[] input = null;
        int[] expectedResult = ReverseArrayUtil.reverseArray(input );
        Assert.assertEquals(expectedResult,null);
    }

    @Test
    public void testingWithOneArrayValue()
    {
        int[] input = {1};
        int[] actualResult = {1};
        int[] expectedResult = ReverseArrayUtil.reverseArray(input );
        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testingWithTwoArrayValue()
    {
        int[] input = {1,2};
        int[] actualResult = {2,1};
        int[] expectedResult = ReverseArrayUtil.reverseArray(input );
        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testingWithThreeArrayValue()
    {
        int[] input = {1,2,3};
        int[] actualResult = {3,2,1};
        int[] expectedResult = ReverseArrayUtil.reverseArray(input );
        Assert.assertArrayEquals(expectedResult,actualResult);
    }

    @Test
    public void testingWithMultipleArrayValue()
    {
        int[] input = {1,2,3,4,5};
        int[] actualResult = {5,4,3,2,1};
        int[] expectedResult = ReverseArrayUtil.reverseArray(input );
        Assert.assertArrayEquals(expectedResult,actualResult);
    }
}
