package com.trunghd;

public class StaticTest {
    private static int numInstances = 0;
    private static String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public static String getName() {
        return name;
    }


}
