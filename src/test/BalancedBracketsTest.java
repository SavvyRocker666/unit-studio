package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void testEmptyString(){
        assertTrue(hasBalancedBrackets(""));
    }
    @Test
    public void testOnlyOpen(){
        assertFalse(hasBalancedBrackets("["));
    }
    @Test
    public void testOnlyClose(){
        assertFalse(hasBalancedBrackets("]"));
    }
    @Test
    public void testOpenClose(){
        assertTrue(hasBalancedBrackets("[]"));
    }
    @Test
    public void testStringOpenClose(){
        assertTrue(hasBalancedBrackets("test[]"));
    }
    @Test
    public void testOpenStringClose(){
        assertTrue(hasBalancedBrackets("[test]"));
    }
    @Test
    public void testOpenCloseString(){
        assertTrue(hasBalancedBrackets("[]test"));
    }
    @Test
    public void testOpenOpenClose(){
        assertFalse(hasBalancedBrackets("[[]"));
    }
    @Test
    public void testOpenCloseClose(){
        assertFalse(hasBalancedBrackets("[]]"));
    }
    @Test
    public void testOpenStringOpenClose(){
        assertFalse(hasBalancedBrackets("[test[]"));
    }
    @Test
    public void testOpenStringCloseClose(){
        assertFalse(hasBalancedBrackets("[test]]"));
    }
    @Test
    public void testOpenOpenCloseClose(){
        assertTrue(hasBalancedBrackets("[[]]"));
    }
    @Test
    public void testOpenOpenStringCloseClose(){
        assertTrue(hasBalancedBrackets("[[test]]"));
    }
    @Test
    public void testCloseOpen(){
        assertFalse(hasBalancedBrackets("]["));
    }
    @Test
    public void testTestCasesFromLesson(){
        String[] trueConditions = {"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"};
        String[] falseConditions = {"[LaunchCode", "Launch]Code[", "[", "][","[]][]"};
        for(String condition:trueConditions){
            assertTrue(hasBalancedBrackets(condition));
        }
        for(String condition:falseConditions){
            assertFalse(hasBalancedBrackets(condition));
        }
    }



}