import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 11/08/2017.
 */
public class TestLibrary {
    Library l = new Library();

    @Test
    public void LibTestGetSet() {

        List<Item> i = new ArrayList<>();
        l.setI(i);

        Assert.assertEquals(i, l.getI());

    }

    @Test
    public void searchTest() { //complete here

        // Assert.assertNotNull(l.search(new Item()).equals(null));
        String item = "science";

       // Assert.assertEquals(, l.search(item));

    }


}
