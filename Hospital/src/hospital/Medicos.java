/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;



/**
 *
 * @author allan.chanto
 */
public class Medicos extends Elementohospital {
   private int codigomedico;
   private String especialidad;
   private boolean consult;
   
   public Medicos(int identificacion, String nombre, String primerAp, String segundoAp, String genero, String correo, int telefonoP, String Provincia,
           String especialidad, boolean consult, int codigomedico){
super(identificacion, nombre, primerAp, segundoAp, genero, correo, telefonoP, Provincia);
this.codigomedico = codigomedico;
this.especialidad = especialidad;
this.consult = consult;
}

    public int getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(int codigomedico) {
        this.codigomedico = codigomedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isConsult() {
        return consult;
    }

    public void setConsult(boolean consult) {
        this.consult = consult;
    }
    
    
    
    
}
