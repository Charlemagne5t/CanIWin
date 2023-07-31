import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void canIWinTest1False1() {
        int maxChoosableInteger = 10;
        int desiredTotal = 11;

        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertFalse(actual);
    }

    @Test
    public void canIWinTestTrue1() {
        int maxChoosableInteger = 10;
        int desiredTotal = 0;

        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertTrue(actual);
    }

    @Test
    public void canIWinTestTrue2() {
        int maxChoosableInteger = 10;
        int desiredTotal = 1;

        boolean actual = new Solution().canIWin(maxChoosableInteger, desiredTotal);

        Assert.assertTrue(actual);
    }

}
