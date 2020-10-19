package net.usefulbits;

import static org.junit.Assert.*;
import org.junit.Test;

public class SomePersonTest {

    private static String TEAMCITY_VERSION = "TEAMCITY_VERSION";

    @Test
    public void Test1() {
        System.out.println("Some output");

        try{
            if (System.getenv(TEAMCITY_VERSION) != null || !System.getenv("TEAMCITY_VERSION").isEmpty()){
                Thread.sleep(10000);
            }
        } catch (InterruptedException ie){
            System.out.println("Something went wrong");
        }

        System.out.println("word");
        System.err.println("word");

        System.out.println("http://user:word@jetbrains.com");
        System.err.println("http://user:word@jetbrains.com");

        assertEquals(2, 3);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }
    @Test
    public void SecondFailingTest(){
        assertTrue(false);
    }
}
