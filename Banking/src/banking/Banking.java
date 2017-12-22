/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author trunghd
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");
        
        if(bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch created");
        }
        
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        
        bank.addBranch("Sydeney");
        bank.addCustomer("Sydeney", "Bob", 150.54);
        
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.56);
        
        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);
        
        bank.addBranch("Melbourne");
        
        if(!bank.addCustomer("Melbourne", "Brian", 5.53)){
            System.out.println("Error Melbourne branch does not exists");
        }
        
        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }
        
        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }
        
        if(!bank.addCustomer("Adelaide", "Time", 12.21)){
            System.out.println("Customer Tim already exists");
        }
    }
    
}
