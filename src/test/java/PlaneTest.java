import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING_747);
    }

    @Test
    public void hasCapacity() {
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(100, plane.getTotalWeight());
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING_747, plane.getPlaneType());
    }
}
