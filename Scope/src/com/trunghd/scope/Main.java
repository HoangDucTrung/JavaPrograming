/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.scope;

/**
 *
 * @author trunghd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String privateVar = "this is private to main()";
        
        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();
        
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.varThree);
//        System.out.println("scopeInstance varOne is " + scopeCheck.getVarOne());
//        System.out.println(privateVar);
//        
//        scopeCheck.timesTwo();
//        System.out.println("*********************************");
//        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
//        innerClass.timesTwo();
    }
    
}
