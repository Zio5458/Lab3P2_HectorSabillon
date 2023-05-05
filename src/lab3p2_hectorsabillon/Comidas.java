/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_hectorsabillon;

/**
 *
 * @author hdann
 */
public class Comidas extends Productos {

    private boolean estado;

    public Comidas(boolean estado, double precio, String nombre) {
        super(precio, nombre);
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        if (estado == true) {
            return "Comidas{" + "estado= Comestible " + super.toString() + '}';
        } else {
            return "Comidas{" + "estado= Vencido " + super.toString() + '}';
        }
    }

}
