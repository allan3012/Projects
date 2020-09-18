/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;

import java.util.Date;

/**
 *
 * @author allan.chanto
 */
public class Consumo extends Productos {
    private Date fechaVencimiento;

    public Consumo(String id, String nombre, Double precio, Double cantidad, Date fechaVencimiento) {
        super(id, nombre, precio, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "id =" + getId() +
                ", nombre =" + getNombre() +
                ", precio =" + getPrecio() +
                ", cantidad =" + getCantidad() +
                ", fechaVencimiento=" + fechaVencimiento +
                '}';
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Consumo(Date fechaVencimiento, String id, String nombre, Double precio, Double cantidad) {
        super(id, nombre, precio, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    
}
