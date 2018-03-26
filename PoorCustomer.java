/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myvisitorpattern;

import java.text.DecimalFormat;

/**
 *
 * @author arash
 */
public class PoorCustomer implements IInsuranceBuyer{

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public double visite(Life life) {
        return Double.parseDouble(df.format(life.getPrimeCost()));
    }

    @Override
    public double visite(Disability disability) {
        return Double.parseDouble(df.format(disability.getPrimeCost()));
    }

    @Override
    public double visite(Health health) {
        return Double.parseDouble(df.format(health.getPrimeCost()));
    }

    @Override
    public double visite(Auto auto) {
        return Double.parseDouble(df.format(auto.getPrimeCost()));
    }
    
}
