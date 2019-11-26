package by.vlad.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistanceFloat() {
        Point p1 = new Point(5,3);
        Point p2 = new Point(2,7);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }

    @Test
    public void testDistanceInteger() {
        Point p1 = new Point(5,3);
        Point p2 = new Point(2,7);
        Assert.assertEquals(p1.distance(p2), 5);
    }

    @Test
    public void testDistanceIncorrect() {
        Point p1 = new Point(5,3);
        Point p2 = new Point(2,7);
        Assert.assertEquals(p1.distance(p2), 55);
    }

    @Test
    public void testDistanceOtherInput() {
        Point p1 = new Point(5,5);
        Point p2 = new Point(2,5);
        Assert.assertEquals(p1.distance(p2), 5);
    }
}
