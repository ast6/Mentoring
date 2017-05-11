import demo1_2.Count;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;

public class TestDemo1 {
    Count count = new Count();



    @Test
    public void testDisc() {

        Assert.assertEquals("The result is wrong. Check test with zero descriminant", count.countingRoots(1, 2, 1), "Root is: -1.0 because discriminant is 0");
        Assert.assertThat("The result is wrong. Check test when descriminant < 0", count.countingRoots(5, 2, 3), is("Nor real roots. Discriminant < 0"));
        Assert.assertThat("The result is wrong. Check test when descriminant > 0", count.countingRoots(5, 2, -3), containsString("Root 1 is: -1.0; Root 2 is: 0.6"));

    }

    @Test
    public void testVars() {

        Assert.assertThat("The result is wrong. Check test when a = 0", count.countingRoots(0, 8, 7), equalTo("Root is: -0.875. Because a =0"));
        Assert.assertEquals("The result is wrong. Check test when b = 0", count.countingRoots(-2, 0, 5), "Root 1 is: 1.5811388300841898; Root 2 is: -1.5811388300841898. Because b = 0 and -c / a > 0");
        Assert.assertEquals("The result is wrong. Check test when b = 0", count.countingRoots(2, 0, 5), "Nor real roots. Because b = 0 and -c / a < 0");
        Assert.assertEquals("The result is wrong. Check test when c = 0", count.countingRoots(4, 2, 0), "Root 1 is: 0.0; Root 2 is: -0.5. Because c = 0");

    }
}
