/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunitat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alu2015059
 */
public class PracticaComunitat {

    /**
     * @param args the command line arguments
     */
    //Array de informacion de los txt
    static List<String> lineasComunidad = new ArrayList<>();
    static List<String> lineasDespeses = new ArrayList<>();
    //Array de 
    static List<Comunitat> listaComunidades = new ArrayList<>();
    static List<Despeses> listaDespeses = new ArrayList<>();
    //Array de clases
    static List<Comunitat> listaComunidad = new ArrayList<>();
    static List<Zona> listaZona = new ArrayList<>();
    static List<Propietat> listaPropiedad = new ArrayList<>();
    static List<Propietari> listaPropietario = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner com = new Scanner(new FileReader("Comunitats.txt"));
            Scanner des = new Scanner(new FileReader("Despeses.txt"));

            while (com.hasNext()) {
                lineasComunidad.add(com.nextLine());
            }

            while (des.hasNext()) {
                lineasDespeses.add(des.nextLine());
            }
            
            limpieza();
            
            System.out.println("*********** lista comunidad");
            System.out.println(listaComunidad);
            System.out.println("*********** lista despeses");
            System.out.println(lineasDespeses);
            /*for (int i = 0; i < lineasComunidad.size(); i++) {
                procesar(i);
            }*/

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaComunitat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void callateya(){
        
    }
    
    public static void limpieza() {
        List<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        for (int i = 0; i < lineasComunidad.size(); i++) {
            String[] datos = lineasComunidad.get(i).split("#");
            lista.add(datos[0]);
        }

        
        
        for (int i = 0; i < lista.size(); i++) {
            String[] datos = lista.get(i).split(" ");

            
            String identificacio = datos[0];
            String nom = datos[1];
            String poblacio = datos[2];

            Comunitat comunitat = new Comunitat(identificacio, nom, poblacio);
            listaComunidad.add(comunitat);
        }
    }

    public static void procesar(int i) {
        String[] datos = lineasComunidad.get(i).split(";");
        String identificacio = datos[0];
        String nom = datos[1];
        String poblacio = datos[2];

        Comunitat comunidad = new Comunitat(identificacio, nom, poblacio);
        listaComunidades.add(comunidad);
        System.out.println(identificacio + " " + nom + " " + poblacio);
    }

    
    
    public static void prueba() {
        for (int i = 0; i < lineasDespeses.size(); i++) {
            String[] datos = lineasDespeses.get(i).split(";");
            String p = lineasDespeses.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);

            if (ppp.equalsIgnoreCase("#")) {
                lineasDespeses.remove(lineasDespeses.get(i));
            } else {

                String identificacio = datos[0];
                String descripcio = datos[1];
                Double importe = Double.valueOf(datos[2]);
                char zona = datos[3].charAt(0);

                Despeses despeses = new Despeses(identificacio, descripcio, importe, zona);
                listaDespeses.add(despeses);
            }
        }

    }

}
