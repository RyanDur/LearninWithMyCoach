import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
* Created with IntelliJ IDEA.
* User: Thoughtworks
* Date: 10/11/12
* Time: 9:46 PM
* To change this template use File | Settings | File Templates.
*/
public class StrongPointTest {
    @Test
    public void testGetPoint() throws Exception {
        StrongPoint strongPoint = new StrongPoint(1,1);
        System.out.println(strongPoint.getPoint());
        Point point1 = strongPoint.getPoint();
        point1.setLocation(2,2);
        System.out.println(point1);
        System.out.println(strongPoint.getPoint());
        assertFalse(point1.equals(strongPoint.getPoint()));
    }
}
