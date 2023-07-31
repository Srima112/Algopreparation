import com.algoprep.basic.problemsolving.FactorsUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorsUtilityTest {

    @Test
    public void testNoOfFactors()
    {
        Assert.assertEquals(8,FactorsUtility.numberOfFactors(24));
    }

    @Test
    public void testNoOfFactors2()
    {
        Assert.assertEquals(10,FactorsUtility.numberOfFactors(36));
    }

    @Test
    public void negativeTestCase()
    {
        Assert.assertNotEquals(11,FactorsUtility.numberOfFactors(36));
    }

}
