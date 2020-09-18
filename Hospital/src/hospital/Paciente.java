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
public class Paciente extends Elementohospital {
    
    private int peso;
    private String presion;
    private int temperatura;
    private int codigomedico;
    
    
    
    public Paciente(int identificacion, String nombre, String primerAp, String segundoAp, String genero, String correo, int telefonoP, String Provincia,
            int peso, String presion, int temperatura, int codigomedico){
    super(identificacion, nombre, primerAp, segundoAp, genero, correo, telefonoP, Provincia);
    this.peso = peso;
    this.presion = presion;
    this.temperatura = temperatura;
    this.codigomedico = codigomedico;
}

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(int codigomedico) {
        this.codigomedico = codigomedico;
    }

}
