

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrianglesTest {

    private Triangle t0, t1, t2;

    @Before
    public void setUp() throws Exception {
        t0 = new Triangle(0,0,0);
        t1 = new Triangle(1,1,1);
        t2 = new Triangle(2,1.5,1);
    }

    @Test
    public void testGetArea() {
        assertEquals(0, t0.getArea(), .001);
        assertEquals(.4330, t1.getArea(), .001);
        assertEquals(.7261, t2.getArea(), .001);
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(0, t0.getPerimeter(), .001);
        assertEquals(3, t1.getPerimeter(), .001);
        assertEquals(4.5, t2.getPerimeter(), .001);
    }

}
