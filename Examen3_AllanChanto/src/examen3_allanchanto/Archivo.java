/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author allan.chanto
 */
public class Archivo {

    
    
    public ArrayList<Empleado> leer () {
        ArrayList<Empleado> Productos = new ArrayList<>();


        try {


            //lectura de datos
            BufferedReader entrada = new BufferedReader(new FileReader("planilla.txt"));
            String s, s2 = new String();
            String Nombre;
    String Apellido;
    int ID;
    int Salario;
    int C_horas_mes;
    int ventas =0;
    int administrativo =0;
    int logistica = 0;
    int finanzas = 0;
    int RRHH = 0;
    int NoD =0;
    int suma=0;
    int Tsalario;
    int sumsalario=0;
    int salm=0;
    int salma=0;
    int n=0;
    int v,pv=0;
    int sumn=0;
    int sumatotal=0;
    String noms=null;
            int sv=0;
    int a,pa=0;
            int sa=0;
    int l,pl=0;
            int sl=0;
    int f,pf=0;
            int sf=0;
    int r,pr=0;
            int sr=0;
    int no,pno=0;
            int sno=0;
        int prom=0;    
    
    
    String nom = null;
    
    
            while ((s = entrada.readLine()) != null) {
                
                s2 += s + "\n";
                String[] informacion = s.split(",");
                Nombre = informacion[0];
                Apellido = informacion[1];
                ID = Integer.parseInt(informacion[2]);
                Salario = Integer.parseInt(informacion[3]);
                C_horas_mes = Integer.parseInt(informacion[4]);
                Empleado objemple = new Empleado (Nombre,Apellido,ID,Salario,C_horas_mes);            
                Productos.add(objemple);
                
              if(ID == 1){
                  ventas++;
                v=Salario*C_horas_mes;
                sv=sv+v;
               pv=sv/ventas;
              }  
              if(ID ==2){
              administrativo++;
              a=Salario*C_horas_mes;
              sa=sa+a;
              pa=sa/administrativo;
              }
              if(ID==3){
              
              logistica++;
              if(logistica !=0){
              l=Salario*C_horas_mes;
              sl=sl+l;
              pl=sl/logistica;
              }}
              if(ID==4){
              finanzas++;
              f=Salario*C_horas_mes;
              sf=sf+f;
              pf=sf/finanzas;
              }
              if(ID==5){
              RRHH++;
              r=Salario*C_horas_mes;
              sr=sr+r;
              pr=sr/RRHH;
              }
              if(ID !=1 && ID !=2 && ID !=3 && ID!=4 && ID!=5){
              NoD++;
             no=Salario*C_horas_mes;
             sno=sno+no;
              pno=sno/NoD;
              sumn=Salario*C_horas_mes;
              
              }
              //Suma de salarios
              Tsalario =0;
              Tsalario = Salario * C_horas_mes;
              suma =suma + Tsalario;
              suma=suma-sumn;
              //Salario menor
              n=salm;
              salm=Salario * C_horas_mes;
              if(n<salm){
              nom=Nombre;
              }
              n=salm;
              salma=Salario * C_horas_mes;
              if(n>salm){
              noms=Nombre;
              }
                   
              sumatotal= administrativo+ventas+logistica+finanzas+RRHH;
             prom=suma/sumatotal;
                 
             PrintWriter salida = null;
        try {
            // escritura de datos
            
          
                
               
            
            salida = new PrintWriter(new BufferedWriter(new FileWriter("informacion.txt")));
            
                
                
            
            
            
                salida.println("# de Empleados menos No identificados"+"= "+sumatotal+" "+ "Promedio= "+prom);
                
                salida.println("La suma de todos los salirios es"+"= "+suma);
                
                salida.println("El salario menor es de"+" "+nom);
                salida.println("El salario mayor es de= "+" "+nom);
                
                
            salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Datos no Compatibles");
        } finally {
            salida.close();
        }   
            }
            System.out.println("Información encontrada:" + "\n" + s2);
            System.out.println("La suma de los salarios es"+"="+suma);
            System.out.println("El salario menor es"+"="+nom);
            System.out.print("El promedio de los salarios para ventas es:"+"="+pv);
            System.out.print("El promedio de los salarios para ventas es:"+"="+pv);
            
            
            entrada.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "La información no se encuentra");
        }
        return Productos;
        
        
    }}
    
 
    

