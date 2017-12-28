package com.trunghd;

public class Main {

    public static void main(String[] args) {
        StaticTest  firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest seconStaticTest = new StaticTest("2nd instance");
        System.out.println(seconStaticTest.getName() + " is instance number " + firstInstance.getNumInstances());

    }
}
