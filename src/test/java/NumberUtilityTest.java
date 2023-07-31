import com.algoprep.basic.problemsolving.NumbersUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberUtilityTest {

    @Test
    public void checkSumOfNaturalNumber()
    {
        Assert.assertEquals(3, NumbersUtility.sumOfNaturalNumbers(2));
    }
    @Test
    public void checkSumOfNaturalNumber2()
    {
        Assert.assertEquals(6, NumbersUtility.sumOfNaturalNumbers(3));
    }
}
