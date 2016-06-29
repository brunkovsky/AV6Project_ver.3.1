package Utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DataUtilTest {

    @Test
    public void testGetDoubles() {
        List<Double> doubles = DataUtil.getDoubles("12 44.3");
        List<Double> expected = new ArrayList<>();
        expected.add(12.0);
        expected.add(44.3);
        assertEquals(expected, doubles);
    }

    @Test
    public void testGetNDouble() {
        List<Double> doubles = new ArrayList<>();
        doubles.add(12.0);
        doubles.add(-4.66);
        Double nDouble = DataUtil.getNDouble(doubles, 1);
        assertEquals(-4.66, nDouble, 0.0);
    }
}