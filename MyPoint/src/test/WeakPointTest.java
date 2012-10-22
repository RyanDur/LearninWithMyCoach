import org.junit.Test;
import sun.security.util.BigInt;

import java.awt.*;
import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

/**
* Created with IntelliJ IDEA.
* User: Thoughtworks
* Date: 10/11/12
* Time: 9:46 PM
* To change this template use File | Settings | File Templates.
*/
public class WeakPointTest {
    String p;

    @Test
    public void testGetPoint() throws Exception {
        WeakPoint weakPoint = new WeakPoint(1,1);
        System.out.println(weakPoint.getPoint());
        Point point1 = weakPoint.getPoint();
        point1.setLocation(2,2);
        System.out.println(point1);
        System.out.println(weakPoint.getPoint());
        assertTrue(point1.equals(weakPoint.getPoint()));

        System.out.println(p);
        System.out.println(new BigInteger(p));
    }
}
