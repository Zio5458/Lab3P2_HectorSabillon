/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_hectorsabillon;

import java.util.ArrayList;

/**
 *
 * @author hdann
 */
public class Compras {
    
    private int total;
    private ArrayList compras = new ArrayList();

    public Compras(int total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ArrayList getCompras() {
        return compras;
    }

    public void setCompras(ArrayList compras) {
        this.compras = compras;
    }

    
    
}