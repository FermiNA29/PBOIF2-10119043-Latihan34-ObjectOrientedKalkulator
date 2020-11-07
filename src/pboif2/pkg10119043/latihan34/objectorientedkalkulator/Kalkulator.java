/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan34.objectorientedkalkulator;

/**
 *
 * @author FERMI
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan() {
        double hasil = value1 + value2;
        return hasil;
    }
    
    public double kurangBilangan() {
        double hasil = value1 - value2;
        return hasil;
    }
    
    public double kaliBilangan() {
        double hasil = value1 * value2;
        return hasil;
    }
    
    public double bagiBilangan() {
        double hasil = value1 / value2;
        return hasil;
    }
    
    public double sisaBilangan() {
        double hasil = value1 % value2;
        return hasil;
    }
}
