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
public class Metodos {
    
   public void AgregarMedico (Elementohospital[] vectorhospital, Elementohospital elementoagregar){
   int posicion = validaCamposVector(vectorhospital);
   if (posicion != -1){
   vectorhospital[posicion] = elementoagregar;
   if(elementoagregar instanceof Medicos){
   }
   
   
   }else{JOptionPane.showMessageDialog(null, "No hay espacios");
   }
   
   
  
    }
public static int validaCamposVector(Elementohospital[] vectorhospital){
for(int i = 0; i < vectorhospital.length;i++){
if (vectorhospital[i] == null){
return i;
}

}
return -1;
}

public Elementohospital creaElemento(int opcion){
if(opcion == 1){
return new Medicos(
        JOptionPane.showInputDialog("Digite la identificación"),
        JOptionPane.showInputDialog("Digite el Nombre"),
        JOptionPane.showInputDialog("Primer Apellido"),
        JOptionPane.showInputDialog("Segundo Apellido"),
        JOptionPane.showInputDialog("Genero"),
        JOptionPane.showInputDialog("Correo"),
        JOptionPane.showInputDialog("Fecha de Nacimiento"),
        JOptionPane.showInputDialog("Teléfono"),
        JOptionPane.showInputDialog("Provincia"),
        
false,
        false);
}

}

public void AgregarPaciente (Elementohospital[] vectorhospital, Elementohospital elementoagregar){
   int posicion = validaCamposVector(vectorhospital);
   if (posicion != -1){
   vectorhospital[posicion] = elementoagregar;
   if(elementoagregar instanceof Medicos){
   }
   
   
   }else{JOptionPane.showMessageDialog(null, "No hay espacios");
   }
   
   
  
    }
public static int validarCamposVector(Elementohospital[] vectorhospital){
for(int i = 0; i < vectorhospital.length;i++){
if (vectorhospital[i] == null){
return i;
}

}
return -1;
}

public Elementohospital crearElemento(int opcion){
if(opcion == 1){
return new Paciente(
        JOptionPane.showInputDialog("Digite la identificación"),
        JOptionPane.showInputDialog("Digite el Nombre"),
        JOptionPane.showInputDialog("Primer Apellido"),
        JOptionPane.showInputDialog("Segundo Apellido"),
        JOptionPane.showInputDialog("Genero"),
        JOptionPane.showInputDialog("Correo"),
        JOptionPane.showInputDialog("Fecha de Nacimiento"),
        JOptionPane.showInputDialog("Teléfono"),
        JOptionPane.showInputDialog("Provincia"),
        
false,
        false);
}

}


}







    
  

