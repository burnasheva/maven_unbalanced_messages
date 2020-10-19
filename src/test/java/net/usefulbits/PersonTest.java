package net.usefulbits;

import org.junit.Ignore;
import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {

    private static String TEAMCITY_VERSION = "TEAMCITY_VERSION";

    @Test
    public void Test1() {

        try{
            if (System.getenv(TEAMCITY_VERSION) != null || !System.getenv("TEAMCITY_VERSION").isEmpty()){
                Thread.sleep(10000);
            }
        } catch (InterruptedException ie){
            System.out.println("Something went wrong");
        }

        System.out.println("word word");
        System.err.println("word");

        System.out.println("http://user:word@jetbrains.com");
        System.err.println("http://user:word@jetbrains.com");

        System.out.println("Durchführungvermögen"); 

        assertEquals(2, 2);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    public void TestBlock() {

        System.out.println("Login with User: Administrator");
        System.out.println("Logged in as: Name: 'test'");
        System.out.println("Logged in as: Name: 'test'");
        System.out.println("Login with User: test");
        System.out.println("Logged in as: Name: 'administrator'");

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

        assertEquals(2, 2);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    public void TestDifferentLogic() {

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
        assertEquals(2, 4);
        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    public void TestCalculator() {
        try{
            if (System.getenv(TEAMCITY_VERSION) != null || !System.getenv("TEAMCITY_VERSION").isEmpty()){
                Thread.sleep(10000);
            }
        } catch (InterruptedException ie){
            System.out.println("Something went wrong");
        }
        assertEquals(2, 2);
        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    public void TestBackup() {
        assertEquals(2, 2);

        assertEquals("Name not saved correctly", "David", "David");
        assertEquals("Age not saved correctly 123456", 22, 22);
    }

    @Test
    //@Ignore("long name u")
    public void Test2() {
        assertEquals("David", "David");
        assertEquals(28, 28);
    }

    @Test
    @Ignore("long name a")
    public void Test3() {
        assertEquals("Deleting person failed.", 0, 1);
    }

    @Test
    public void Test4(){
        assertFalse(false);
    }
    
    @Test
    public void OneMoreTest(){
        assertTrue(true);
    }

    @Test
    @Ignore("ignore test with short name")
    public void shortTestName(){
        assertFalse (true);
    }

    @Test
    //@Ignore("ignore test with simple name")
    public void shouldBeIgnored(){
        assertTrue(false);
    }
    
   
    @Test
    @Ignore("ignore test with simple name")
    public void shouldBeIgnored2(){
        assertTrue(false);
    }
}
