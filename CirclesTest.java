

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CirclesTest {
    private Circle c0, c1, c2;

    @Before
    public void setUp() throws Exception {
        c0 = new Circle(0);
        c1 = new Circle(1);
        c2 = new Circle(2);
    }


    @Test
    public void testGetArea() {
        assertEquals(0, c0.getArea(), .001);
        assertEquals(Math.PI, c1.getArea(), .001);
        assertEquals(12.566, c2.getArea(), .001);
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(0, c0.getPerimeter(), .001);
        assertEquals(6.28319, c1.getPerimeter(), .001);
        assertEquals(2*6.28319, c2.getPerimeter(), .001);
    }

}
