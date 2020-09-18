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
public class Empleado {
    String Nombre;
    String Apellido;
    int ID;
    int Salario;
    int C_horas_mes;
     

   
    
    
     public Empleado(String Nombre, String Apellido, int ID, int Salario, int C_horas_mes) {
        this.Nombre =   Nombre;
        this.Apellido = Apellido;
        this.ID =ID;
        this.Salario = Salario;
        this.C_horas_mes =C_horas_mes; 
    }

    

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public int getC_horas_mes() {
        return C_horas_mes;
    }

    public void setC_horas_mes(int C_horas_mes) {
        this.C_horas_mes = C_horas_mes;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", ID=" + ID + ", Salario=" + Salario + ", C_horas_mes=" + C_horas_mes + '}';
    }

   

    
    }

    

