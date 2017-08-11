import org.junit.Assert;
import org.junit.Test;


public class TestBlackJack {


    @Test
    public void testA() {
        Intermediate i= new Intermediate();
        Assert.assertEquals(5,i.blackJack2(1,5));
    }

}
