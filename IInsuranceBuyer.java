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
public interface IInsuranceBuyer {
    public double visite(Life life);
    public double visite(Disability disability);
    public double visite(Health health);
    public double visite(Auto auto);
}
