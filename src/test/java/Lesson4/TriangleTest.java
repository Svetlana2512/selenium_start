package Lesson4;

import static Lesson4.TriangleType.Равносторонний;
import static Lesson4.TriangleType.Непрошел;
import static Lesson4.TriangleType.Равнобедренный;
import static Lesson4.TriangleType.Неравносторонний;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void test1() {
        final TriangleType type = Triangle.classify(1, 2, 3);
        assertEquals(Неравносторонний, type);
    }

    @Test
    public void testInvalid1() {
        final TriangleType type = Triangle.classify(1, 2, 4);
        assertEquals(Непрошел, type);
    }

    @Test
    public void testInvalid2() {
        final TriangleType type = Triangle.classify(1, 4, 2);
        assertEquals(Непрошел, type);
    }

    @Test
    public void testInvalid3() {
        final TriangleType type = Triangle.classify(4, 1, 2);
        assertEquals(Непрошел, type);

    }

    @Test
    public void testInvalidNeg1() {
        final TriangleType type = Triangle.classify(-1, 1, 1);
        assertEquals(Непрошел, type);
    }

    @Test
    public void testInvalidNeg2() {
        final TriangleType type = Triangle.classify(1, -1, 1);
        assertEquals(Непрошел, type);
    }

    @Test
    public void testInvalidNeg3() {
        final TriangleType type = Triangle.classify(1, 1, -1);
        assertEquals(Непрошел, type);
    }

    @Test
    public void testEquiliteral() {
        final TriangleType type = Triangle.classify(1, 1, 1);
        assertEquals(Равносторонний, type);
    }

    @Test
    public void testIsoceles1() {
        final TriangleType type = Triangle.classify(2, 2, 3);
        assertEquals(Равнобедренный, type);
    }

    @Test
    public void testIsoceles2() {
        final TriangleType type = Triangle.classify(2, 3, 2);
        assertEquals(Равнобедренный, type);
    }

    @Test
    public void testIsoceles3() {
        final TriangleType type = Triangle.classify(3, 2, 2);
        assertEquals(Равнобедренный, type);
    }

    @Test
    public void testInvalid() {
        final TriangleType type = Triangle.classify(3, 1, 1);
        assertEquals(Непрошел, type);
    }
}