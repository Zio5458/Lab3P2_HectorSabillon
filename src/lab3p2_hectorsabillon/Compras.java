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
    
    private double total;
    private ArrayList compras = new ArrayList();

    public Compras() {
    }
    
    public Compras(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList getCompras() {
        return compras;
    }

    public void setCompras(ArrayList compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Compras{" + "total=" + total + ", compras=\n" + compras + '}';
    }

    public void imprimirArreglo(){
        for (int i = 0; i < compras.size(); i++){
            System.out.println(i + " <-" + compras.get(i));
        }
    }
    
    
}
