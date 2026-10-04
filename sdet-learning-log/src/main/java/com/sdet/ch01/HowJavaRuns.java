package com.sdet.ch01;

/* =====================================================================
 * GOAL: Run the smallest Java program and see where the .class file
 *       lands.
 * WHY IT MATTERS: proves compile and run are two separate steps.
 * ===================================================================== */

public class HowJavaRuns {

    public static void main(String[] args) {
        System.out.println("Compiled by ECJ. Executed by the JVM.");
        System.out.println("Java version running this: " + System.getProperty("java.version"));
    }
}