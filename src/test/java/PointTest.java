import org.example.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PointTest {
    @Test
    public final void testTranslater0_0()

    {
        Point a = new Point(1, 2);
        Point expected = new Point(1, 2);
        Point obtained = a.translater(0, 0);
        assertEquals(expected, obtained);
    }
}
