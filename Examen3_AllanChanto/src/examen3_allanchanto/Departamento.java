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
public class Departamento {
    
    
    int ventas;
    int administrativo;
    int logistica;
    int finanzas;
    int RRHH;

    public Departamento(int ventas, int administrativo, int logistica, int finanzas, int RRHH) {
        this.ventas = ventas;
        this.administrativo = administrativo;
        this.logistica = logistica;
        this.finanzas = finanzas;
        this.RRHH = RRHH;
    }

    @Override
    public String toString() {
        return "Departamento{" + "ventas=" + ventas + ", administrativo=" + administrativo + ", logistica=" + logistica + ", finanzas=" + finanzas + ", RRHH=" + RRHH + '}';
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getAdministrativo() {
        return administrativo;
    }

    public void setAdministrativo(int administrativo) {
        this.administrativo = administrativo;
    }

    public int getLogistica() {
        return logistica;
    }

    public void setLogistica(int logistica) {
        this.logistica = logistica;
    }

    public int getFinanzas() {
        return finanzas;
    }

    public void setFinanzas(int finanzas) {
        this.finanzas = finanzas;
    }

    public int getRRHH() {
        return RRHH;
    }

    public void setRRHH(int RRHH) {
        this.RRHH = RRHH;
    }
}
