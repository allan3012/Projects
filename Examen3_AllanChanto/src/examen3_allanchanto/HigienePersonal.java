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
public class HigienePersonal extends Productos{
    private int numeroLote;
    private String permisoSanitario;

    public HigienePersonal(String id, String nombre, Double precio, Double cantidad, int numeroLote, String permisoSanitario) {
        super(id, nombre, precio, cantidad);
        this.numeroLote = numeroLote;
        this.permisoSanitario = permisoSanitario;
    }

    @Override
    public String toString() {
        return "HigienePersonal{" +
                "id =" + getId() +
                ", nombre =" + getNombre() +
                ", precio =" + getPrecio() +
                ", cantidad =" + getCantidad() +
                ", numeroLote=" + numeroLote +
                ", permisoSanitario='" + permisoSanitario + '\'' +
                '}';
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public String getPermisoSanitario() {
        return permisoSanitario;
    }

    public void setPermisoSanitario(String permisoSanitario) {
        this.permisoSanitario = permisoSanitario;
    }

    public HigienePersonal(int numeroLote, String permisoSanitario, String id, String nombre, Double precio, Double cantidad) {
        super(id, nombre, precio, cantidad);
        this.numeroLote = numeroLote;
        this.permisoSanitario = permisoSanitario;
    }
    
    
}