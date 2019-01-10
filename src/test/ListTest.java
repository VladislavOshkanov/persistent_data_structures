package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.Array;
import main.List;

import static junit.framework.Assert.assertEquals;

public class ListTest extends TestCase {
    public ListTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ListTest.class);
    }

    public void testAdd(){
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(0), new Integer(1));
        assertEquals(list.get(1), new Integer(2));

    }
    public void testRemove(){
        List<Integer> list = new List<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        assertEquals(list.get(0), new Integer(2));
    }

}
