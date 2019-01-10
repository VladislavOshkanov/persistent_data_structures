package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.Map;

public class MapTest extends TestCase {

    public MapTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(MapTest.class);
    }

    public void testAdd(){
        Map<Integer, Integer> map = new Map();

        map.set(0, 1);
        assertEquals(map.get(0), new Integer(1));
    }
    public void testRemove(){
        Map<Integer, Integer> map = new Map();

        map.set(0, 1);
        map.remove(0);
        assertEquals(map.get(0), null);
    }


}
