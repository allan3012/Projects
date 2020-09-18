/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3_allanchanto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author allan.chanto
 */

    
    public class InformeInventarios {
    private List<Consumo> consumoList = new LinkedList<>();
    private List<HigienePersonal> higienePersonalList = new LinkedList<>();
    private List<Hogar> hogarList = new LinkedList<>();
    private List<Tecnologia> tecnologiaList = new LinkedList<>();

    public void leerProductos(){
        try{
            FileReader fileReader =  new FileReader("inventario.txt");
            BufferedReader leer = new BufferedReader(fileReader);
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date;
            String productos;
            String[] datosSeparados;

            while ((productos = leer.readLine()) != null){
                datosSeparados = productos.toString().split(",");
                int largo = datosSeparados.length;
                for(int i = 0; i< largo;i+=largo){
                    if(largo==5){
                        try{
                            date = dateFormat.parse(datosSeparados[4]);
                            consumoList.add(new Consumo(datosSeparados[0],datosSeparados[1],Double.parseDouble(datosSeparados[2]),
                                    Double.parseDouble(datosSeparados[3]),date));

                        }
                        catch(Exception exception){
                            tecnologiaList.add(new Tecnologia(datosSeparados[0],datosSeparados[1],Double.parseDouble(datosSeparados[2]),
                                    Double.parseDouble(datosSeparados[3]),datosSeparados[4]));
                        }

                    }else if (largo==6){
                        higienePersonalList.add(new HigienePersonal(datosSeparados[0],datosSeparados[1],Double.parseDouble(datosSeparados[2]),
                                Double.parseDouble(datosSeparados[3]),Integer.parseInt(datosSeparados[4]),datosSeparados[5]));
                    }else if (largo==7){
                        date = dateFormat.parse(datosSeparados[5]);
                        hogarList.add(new Hogar(datosSeparados[0],datosSeparados[1],Double.parseDouble(datosSeparados[2]),
                                Double.parseDouble(datosSeparados[3]),datosSeparados[4], date ,datosSeparados[6]));
                    }

                }

            }
            leer.close();

         

        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Revise el formato"+exception.getStackTrace());
        }


    }

    public void reporteConsumo(){
        try{
            FileWriter fileWriter = new FileWriter("Reporte de productos.txt");

            fileWriter.write("Categoria de "+consumoList.get(0).getClass().getSimpleName()+"\n\n");
            for(int i=0; i<consumoList.size();i++){
                fileWriter.write("\n"+consumoList.get(i).getNombre()+" - cantidad = "+consumoList.get(i).getCantidad());
            }

            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Se genero un reporte de consumo");


        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getStackTrace());
        }

    }

    public void reporteHigiene(){
        try{
            FileWriter fileWriter = new FileWriter("Reporte Productos Higiene.txt");

            fileWriter.write("Categoria de "+higienePersonalList.get(0).getClass().getSimpleName()+"\n\n");
            for(int i=0; i<higienePersonalList.size();i++){
                fileWriter.write("\n"+higienePersonalList.get(i).getNombre()+" - cantidad = "+higienePersonalList.get(i).getCantidad());
            }

            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Productos higiene creado exitosamente");


        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getStackTrace());
        }

    }

    public void reporteHogar(){
        try{
            FileWriter fileWriter = new FileWriter("Reporte Productos Hogar.txt");
            fileWriter.write("Categoria de "+hogarList.get(0).getClass().getSimpleName()+"\n\n");
            for(int i=0; i<hogarList.size();i++){
                fileWriter.write("\n"+hogarList.get(i).getNombre()+" - cantidad = "+hogarList.get(i).getCantidad());
            }

            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Reporte Productos Hogar generado exitosamente");


        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getStackTrace());
        }

    }

    public void reporteTecnologia(){
        try{
            FileWriter fileWriter = new FileWriter("Reporte Producto Tecnologia.txt");
            fileWriter.write("Categoria de "+tecnologiaList.get(0).getClass().getSimpleName()+"\n\n");
            for(int i=0; i<tecnologiaList.size();i++){
                fileWriter.write("\n"+tecnologiaList.get(i).getNombre()+" - cantidad = "+tecnologiaList.get(i).getCantidad());
            }

            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Reporte Producto Tecnologia generado exitosamente");


        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getStackTrace());
        }

    }
}
    

