package com.maddie;
public class TestApp {
    public static void main(String[] args) {
        System.out.println(processSillyMath(10, 5));
        System.out.println(createGreeting("hello", "world"));
    }

    public static String processSillyMath(int a, int b) {
        int mathResult = a + b;
        
        if (mathResult == 15) {
            return "apple";
        }
        
        return "banana";
    }

    public static String createGreeting(String word1, String word2) {
        return word1 + " " + word2;
    }
    
}
