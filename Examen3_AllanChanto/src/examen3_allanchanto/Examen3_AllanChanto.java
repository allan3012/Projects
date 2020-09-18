/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author allan.chanto
 */
public class Examen3_AllanChanto {
   public static Archivo ar = new Archivo();
       ArrayList<Empleado> Productos = new ArrayList<>();

    private static InformeInventarios informeInventarios = new InformeInventarios();
    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu(){

        int opcion =0;

            do{
                try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(
                        "********** Welcome to Litle World ***************\n" +
                                "1)	Inventarios por categoria\n"+
                                "2)	Leer y generar reporte Planilla\n"+
                                "3)	Salir\n"));
                switch(opcion){
                    case 1:
                        informeInventarios.leerProductos();
                        menuInventarios();
                        break;
                    case 2:
                        ar.leer();
                        JOptionPane.showMessageDialog(null,"Se genera un TXT llamado *informacion*");
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }

                }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Por favor ingrese un número valido");
                e.printStackTrace();
            }
            }while(opcion!=6);


    }

    private static void menuInventarios(){

        int opcion =0;

            do{
                try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(
                        "************* Seleccione un inventario ***************\n" +
                                "1)	Consumo \n"+
                                "2)	Higiene Personal\n"+
                                "3)	Hogar\n"+
                                "4)	Tecnologia\n"+
                                "5)	Volver\n"));
                switch(opcion){
                    case 1:
                        informeInventarios.reporteConsumo();
                        break;
                    case 2:
                        informeInventarios.reporteHigiene();
                        break;
                    case 3:
                        informeInventarios.reporteHogar();
                        break;
                    case 4:
                        informeInventarios.reporteTecnologia();
                        break;
                    case 5:
                        opcion = 6;
                        break;
                }

                }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Solo se permite ingresar numeros");
                }
            }while(opcion!=6);



    }

}