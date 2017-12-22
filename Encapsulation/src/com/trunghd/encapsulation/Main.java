/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.encapsulation;

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
//        Player player = new Player();
//        player.fullName = "trunghd";
//        player.health = 20;
//        player.weapon = "Sword";
//        
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remanining health = " + player.healthRemaining());
//        
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remanining health = " + player.healthRemaining());

            EnhancedPlayer player = new EnhancedPlayer("trunghd", 200, "Sword");
            System.out.println("Initial health is " + player.getHealth());
    }
    
}
