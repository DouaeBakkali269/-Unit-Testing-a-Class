import org.example.Point;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class PointTest {


//    private Point a;
//
//     we can add external method for common initialization
//    @BeforeEach
//    public void setUp() {
//        a = new Point(1, 2);
//    }

    // execute common code after each test : deallocation
    @AfterAll
    public static void tearDown() {
        a = null;
    }


    private static Point a;

    @BeforeAll
    public static void setUp() {
        a = new Point(1, 2);
    }

    @Test
    public final void testTranslater0_0()

    {
//        Point a = new Point(1, 2);
        Point expected = new Point(1, 2);
        Point obtained = a.translater(0, 0);
        assertEquals(expected, obtained);
    }

//    The test fails because the Point class doesn't override the equals() method. By default,
//    Java's Object.equals() method compares object references rather than their content.
//    So even if two Point objects have the same x and y values,
//    they're considered different unless we implement a proper equals() method.


    // After the first test failed, we need to override the equals() method in the Point class and test it again.
    // Tests for the equals() method pass after the implementation of the equals() method in the Point class.
    @Test
    public final void testEquals() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(3, 4);

        assertTrue(p1.equals(p2));
        assertTrue(p2.equals(p1));
        assertFalse(p1.equals(p3));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals(new Object()));
    }


    // The test passes after the implementation of the equals() method in the Point class.
    @Test
    public final void testTranslater1_3() {
//        Point a = new Point(1, 2);
        Point expected = new Point(2, 5);
        Point obtained = a.translater(1, 3);
        assertEquals(expected, obtained);
    }




}
