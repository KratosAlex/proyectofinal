/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author T-101
 */
public class Proyecto extends Trabajador{

    @Override
    public void pagar() {
        System.out.println("Trabajador por proyecto se le dara su pago");
    }
    
}
