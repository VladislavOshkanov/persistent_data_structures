package test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import main.Array;

public class ArrayTest extends TestCase {

    public ArrayTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(ArrayTest.class);
    }

    public void testAdd(){
        Array<Integer> arr = new Array<>();
        arr.set(0, 1);
        assertEquals(arr.get(0), new Integer(1));
    }




}
