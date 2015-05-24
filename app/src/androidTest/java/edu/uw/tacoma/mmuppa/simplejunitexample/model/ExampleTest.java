package edu.uw.tacoma.mmuppa.simplejunitexample.model;

import junit.framework.TestCase;

/**
 * Created by mmuppa on 5/24/15.
 */
public class ExampleTest extends TestCase {
    private Example mExample;

    public void setUp() {
        mExample = new Example(1, "testing 1");
    }

    public void testConstructor() {

        assertNotNull(mExample);
    }

}
