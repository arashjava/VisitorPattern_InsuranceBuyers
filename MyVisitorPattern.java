/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myvisitorpattern;

/**
 *
 * @author arash
 */
public class MyVisitorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PoorCustomer pCustomer = new PoorCustomer();
        RichCustomer rCustomer = new RichCustomer();
        
        //  set the current costs for both prime and premium insurance 
        Life life = new Life(12.27, 24.56);
        Disability disability = new Disability(8.30, 15.86);
        Auto auto = new Auto(12.27, 24.56);
        Health health = new Health(49.5, 83.20);
        
        System.out.println("Here are the costs for prime and premium Life insurance:");
        System.out.println("$"+life.accept(pCustomer));
        System.out.println("$"+life.accept(rCustomer));
        System.out.println("--------------------------------");

        System.out.println("Here are the costs for prime and premium Disability insurance:");
        System.out.println("$"+disability.accept(pCustomer));
        System.out.println("$"+disability.accept(rCustomer));
        System.out.println("--------------------------------");

        System.out.println("Here are the costs for prime and premium Auto insurance:");
        System.out.println("$"+auto.accept(pCustomer));
        System.out.println("$"+auto.accept(rCustomer));
        System.out.println("--------------------------------");

        System.out.println("Here are the costs for prime and premium Health insurance:");
        System.out.println("$"+health.accept(pCustomer));
        System.out.println("$"+health.accept(rCustomer));
        System.out.println("--------------------------------");

    }
    
}
