package com.thingtrack.jenkins.project.example;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        assertTrue(true);
    }
    
    @Ignore
    @Test
    public void ignoringTest(){
    	assertTrue(true);
    }
}
