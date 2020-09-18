/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;

/**
 *
 * @author allan.chanto
 */
public class Tecnologia extends Productos {
    private String marca;

    public Tecnologia(String id, String nombre, Double precio, Double cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Tecnologia{" +
                "id =" + getId() +
                ", nombre =" + getNombre() +
                ", precio =" + getPrecio() +
                ", cantidad =" + getCantidad() +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Tecnologia(String marca, String id, String nombre, Double precio, Double cantidad) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }
    
    
}
