package com.sdet.ch03;

/* =====================================================================
 * GOAL: Put all five token types in one short file and name each one.
 * WHY IT MATTERS: every compiler error you read is the compiler
 *       complaining about a token it did not expect.
 * ===================================================================== */

public class TokenTypes {

    public static void main(String[] args) {

        // KEYWORDS: int, double, char, boolean, final, String is NOT a keyword
        // IDENTIFIERS: testName, timeout, grade, isPassed, MAX_RETRIES
        // LITERALS: "Login Test", 30, 'A', true, 3
        // OPERATORS: =, +
        // SEPARATORS: ( ) { } ; .

        String testName = "Login Test";
        int timeout = 30;
        double loadTime = 2.45;
        char grade = 'A';
        boolean isPassed = true;
        final int MAX_RETRIES = 3;

        System.out.println("Test name   : " + testName);
        System.out.println("Timeout     : " + timeout);
        System.out.println("Load time   : " + loadTime);
        System.out.println("Grade       : " + grade);
        System.out.println("Passed      : " + isPassed);
        System.out.println("Max retries : " + MAX_RETRIES);

        // Underscores in a numeric literal -- compiler ignores them
        int oneMillion = 1_000_000;
        System.out.println("One million : " + oneMillion);
    }
}