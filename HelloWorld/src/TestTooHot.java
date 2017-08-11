import org.junit.Assert;
import org.junit.Test;

public class TestTooHot {



    @Test
    public void testA() {

        TooHot i = new TooHot();
        Assert.assertEquals(false, i.trueOrFalse(40,false));

    }



}
