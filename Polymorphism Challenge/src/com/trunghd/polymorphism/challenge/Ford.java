/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.polymorphism.challenge;

/**
 *
 * @author trunghd
 */
class Ford extends Car {
    
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }
    
}
