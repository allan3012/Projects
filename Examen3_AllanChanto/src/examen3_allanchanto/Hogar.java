/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;



import java.util.Date;


public class Hogar extends Productos {
    private String nombreProvedor;
    private Date fechaCompra;
    private String numeroTelefonoProvedor;

    public Hogar(String id, String nombre, Double precio, Double cantidad, String nombreProvedor, Date fechaCompra, String numeroTelefonoProvedor) {
        super(id, nombre, precio, cantidad);
        this.nombreProvedor = nombreProvedor;
        this.fechaCompra = fechaCompra;
        this.numeroTelefonoProvedor = numeroTelefonoProvedor;
    }

    @Override
    public String toString() {
        return "Hogar{" +
                "id =" + getId() +
                ", Nombre =" + getNombre() +
                ", Precio =" + getPrecio() +
                ", Cantidad =" + getCantidad() +
                ", NombreProvedor='" + nombreProvedor + '\'' +
                ", FechaCompra=" + fechaCompra +
                ", NúmeroTelefonoProvedor='" + numeroTelefonoProvedor + '\'' +
                '}';
    }

    public String getNombreProvedor() {
        return nombreProvedor;
    }

    public void setNombreProvedor(String nombreProvedor) {
        this.nombreProvedor = nombreProvedor;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNumeroTelefonoProvedor() {
        return numeroTelefonoProvedor;
    }

    public void setNumeroTelefonoProvedor(String numeroTelefonoProvedor) {
        this.numeroTelefonoProvedor = numeroTelefonoProvedor;
    }

    public Hogar(String nombreProvedor, Date fechaCompra, String numeroTelefonoProvedor, String id, String nombre, Double precio, Double cantidad) {
        super(id, nombre, precio, cantidad);
        this.nombreProvedor = nombreProvedor;
        this.fechaCompra = fechaCompra;
        this.numeroTelefonoProvedor = numeroTelefonoProvedor;
    }
    
    
}