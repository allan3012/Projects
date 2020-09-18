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
public class Elementohospital {
    
    private int identificacion;
    private String nombre;
    private String primerAp;
    private String segundoAp;
    private String genero;
    private String correo;
    private int telefonoP;
    private String provincia;
    

    public Elementohospital(int identificacion, String nombre, String primerAp, String segundoAp, String genero,String correo,
            int telefonoP,String provincia) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.primerAp = primerAp;
        this.segundoAp = segundoAp;
        this.genero = genero;
        this.correo = correo;
        this.telefonoP = telefonoP;
        this.provincia = provincia;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerAp() {
        return primerAp;
    }

    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    public String getSegundoAp() {
        return segundoAp;
    }

    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefonoP() {
        return telefonoP;
    }

    public void setTelefonoP(int telefonoP) {
        this.telefonoP = telefonoP;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

   
}
