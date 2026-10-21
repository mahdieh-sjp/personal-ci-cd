package com.maddie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAppTest {

    @Test
    public void verifyNoExceptionThrown() {
        TestApp.main(new String[] {});
    }
    
    @Test
    public void testSillyMathWithIfStatement() {
        String ifResult = TestApp.processSillyMath(10, 5);
        assertEquals("apple", ifResult, "When math equals 15, it should return apple!");
        
        String elseResult = TestApp.processSillyMath(10, 99);
        assertEquals("banana", elseResult, "When math is not 15, it should return banana!");
    }
    
    @Test
    public void testSillyStringPrint() {
        String greeting = TestApp.createGreeting("hello", "world");
        
        assertEquals("hello world", greeting, "The strings didn't combine correctly!");
    }
}