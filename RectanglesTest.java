

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectanglesTest {
    private Rectangle r0, r1, r2;

    @Before
    public void setUp() throws Exception {
        r0 = new Rectangle(0,0);
        r1 = new Rectangle(1,1);
        r2 = new Rectangle(2,2);
    }

    @Test
    public void testGetArea() {
        assertEquals(0, r0.getArea(), .001);
        assertEquals(1, r1.getArea(), .001);
        assertEquals(4, r2.getArea(), .001);
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(0, r0.getPerimeter(), .001);
        assertEquals(4, r1.getPerimeter(), .001);
        assertEquals(8, r2.getPerimeter(), .001);
    }

}
