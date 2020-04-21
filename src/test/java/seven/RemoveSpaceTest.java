package seven;

import org.junit.Assert;

/**
 * @author Yang on 2020/4/21.
 * @version 1.0
 */
public class RemoveSpaceTest {

    @org.junit.Test
    public void removeSpace() {
        String s = "   a   b    c    d";
        Assert.assertEquals("a b c d", RemoveSpace.removeSpace(s));
    }
}