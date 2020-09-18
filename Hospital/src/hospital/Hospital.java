/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import javax.swing.JOptionPane;
/**
 *
 * @author allan.chanto
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    
        
        public static void main(String[] args) {
        int opcionMenuPrincipal = 0, opcionMenuAgregar = 0;
        Elementohospital[] hospital = new Elementohospital[10];
        Metodos objMetodos = new Metodos();
        do{
            opcionMenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog(
                    "*************HOSPITAL ESPERANZA***************\n"+
                    "1.	Agregar médico\n" +
                    "2.	Agregar paciente sospechoso\n" +
                    "3.	Incluir resultados de examen de paciente sospechoso\n" +
                    "4.	Consultar porcentaje de contagio por provincia\n" +
                    "5.	Salir\n\n" +
                    "Digite una opción que desea ejecutar\n"+
            "******************************************"));
            switch(opcionMenuPrincipal){
                case 1:
                    do{
                        switch(opcionMenuAgregar){
                            case 1:
                                
                                JOptionPane.showMessageDialog(null, "Prueba");
                                //objMetodos.AgregarElemento(hospital, objMetodos.creaElemento(opcionMenuAgregar));
                                opcionMenuAgregar = 3;
                                break;
                            case 2:
                                //objMetodos.AgregarElemento(Hospital, objMetodos.creaElemento(opcionMenuAgregar));
                                opcionMenuAgregar = 3;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "DIGITE UNA OPCION VALIDAD");
                        }
                    }while(opcionMenuAgregar!=5);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(opcionMenuPrincipal != 5);

    }
    
        
        
    }
    

