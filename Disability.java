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
public class Disability implements IInsurance{
    private double primeCost;
    private double premiumCost;

    public Disability(double primeCost, double premiumCost) {
        this.primeCost = primeCost;
        this.premiumCost = premiumCost;
    }

    public double getPrimeCost() {
        return primeCost;
    }

    public double getPremiumCost() {
        return premiumCost;
    }
    
    @Override
    public double accept(IInsuranceBuyer buyer) {
        return buyer.visite(this);
    }
    
}
