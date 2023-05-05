/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_hectorsabillon;

/**
 *
 * @author hdann
 */
public class Bebidas extends Productos{
    
    private int tam;

    public Bebidas(int tam, double precio, String nombre) {
        super(precio, nombre);
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "tam=" + tam + super.toString() + '}';
    }
    
    
    
}
