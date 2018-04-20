/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunitat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
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
    static List<String> comunidadTXT = new ArrayList<>();
    static List<String> despesesTXT = new ArrayList<>();

    //Array de clases
    static List<Despeses> listaDespeses = new ArrayList<>();
    static List<Comunitat> listaComunidad = new ArrayList<>();
    static List<Zona> listaZona = new ArrayList<>();
    static List<Propietat> listaPropiedad = new ArrayList<>();
    static List<Propietari> listaPropietario = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner com = new Scanner(new FileReader("Comunitats.txt"));
            Scanner des = new Scanner(new FileReader("Despeses.txt"));
            //Añadimos a las array de lineas todo el contenido de los txt
            while (com.hasNext()) {
                comunidadTXT.add(com.nextLine());
            }
            while (des.hasNext()) {
                despesesTXT.add(des.nextLine());
            }
            
            limpieza();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaComunitat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void limpieza() {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        List<String> lista3 = new ArrayList<>();
        List<String> lista4 = new ArrayList<>();

        HashMap<String, String> comunidadHS = new HashMap<>();
        System.out.println(comunidadTXT.size());

        String[] datos = null;
        String linea = "";
        int j = 0;

        for (int i = 0; i < comunidadTXT.size(); i++) {
            linea = comunidadTXT.get(i);
            if (linea.isEmpty()) {
                comunidadTXT.remove(comunidadTXT.get(i));
            }
        }

        
        //While para Guardar Comunidad en lista1
        while (j < 46) {
            linea = comunidadTXT.get(j);
            if (linea.equalsIgnoreCase("#Zona")) {
                return;
            }
            lista1.add(linea);
            comunidadTXT.remove(comunidadTXT.get(j));
        }
        j=0;
        while(j<46){
            linea = comunidadTXT.get(j);
            if(linea.equalsIgnoreCase("#Propietat")){
                return;
            }
            lista2.add(linea);
            comunidadTXT.remove(comunidadTXT.get(j));
        }
        j=0;
        while(j<46){
            linea = comunidadTXT.get(j);
            lista3.add(linea);
            comunidadTXT.remove(comunidadTXT.get(j));
        }
        
        System.out.println("Comunitat : " + lista1.size());
        System.out.println(lista1);
        System.out.println("Zona : " + lista2.size());
        System.out.println(lista2);
        System.out.println("Propietat : " + lista3.size());
        System.out.println(lista3);
        System.out.println("Propietari : " + lista4.size());
        System.out.println(lista4);

 /*for (int i = 0; i < comunidadTXT.size(); i++) {
            
            String line = comunidadTXT.get(i);
            
            
           if (comunidadTXT.get(i).equalsIgnoreCase("#Comunitat")) {
                String p = comunidadTXT.get(i);
                char pp = p.charAt(0);
                String ppp = String.valueOf(pp);
                while (!ppp.equalsIgnoreCase("#Zona")) {
                    lista1.add(comunidadTXT.get(i));
                    
                }
            }

            if (comunidadTXT.get(i).equalsIgnoreCase("#Zona")) {
                comunidadTXT.remove(comunidadTXT.get(i));
                String p = comunidadTXT.get(i);
                char pp = p.charAt(0);
                String ppp = String.valueOf(pp);
                while (!ppp.equalsIgnoreCase("#")) {
                    lista2.add(comunidadTXT.get(i));
                }
            }

            if (comunidadTXT.get(i).equalsIgnoreCase("#Propietat")) {
                comunidadTXT.remove(comunidadTXT.get(i));
                String p = comunidadTXT.get(i);
                char pp = p.charAt(0);
                String ppp = String.valueOf(pp);
                while (!ppp.equalsIgnoreCase("#")) {
                    lista3.add(comunidadTXT.get(i));
                }
            }

            if (comunidadTXT.get(i).equalsIgnoreCase("#Propietari")) {
                comunidadTXT.remove(comunidadTXT.get(i));
                String p = comunidadTXT.get(i);
                char pp = p.charAt(0);
                String ppp = String.valueOf(pp);
                while (!ppp.equalsIgnoreCase("#")) {
                    lista4.add(comunidadTXT.get(i));
                }
            }

        }*/

 /*for (int i = 0; i < comunidadTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = comunidadTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);*/
 /*if (ppp.equalsIgnoreCase("#")) {*/
        //String[] datos = comunidadTXT.get(i).split("#");
        //lista1.add(comunidadTXT.get(i));
        /*for(int i2 = 0; i2 < lista1.size(); i2++){
                    System.out.println(lista1);
                }*/
 /*String comunidad = datos[0];
                lista1.add(comunidad);
                System.out.println(lista1);
                System.out.println("0");
                
                String zona = datos[1];
                lista2.add(zona);
                System.out.println(lista2);
                System.out.println("1");
                
                String propiedad = datos[2];
                lista3.add(propiedad);
                System.out.println(propiedad);
                System.out.println("2");
                
                String propietari = datos[3];
                lista4.add(propietari);
                System.out.println(lista4);
                System.out.println("3");*/
 /*}*/
    }

    /*String[] datos = null;
    String[] datos2 = null;

    //Separo y añado en lista por #
    for (int i = 0;

    i< comunidadTXT.size ();
    i

    
        ++) {
            datos = comunidadTXT.get(i).split("#");
        lista1.add(datos[0]);
    }

    System.out.println (lista1);
    datos2  = lista1.get(0).split(" ");

    System.out.println (datos2 

    [0]);
     
    lista1.add (datos 

    [0]);
    System.out.println (lista1);

    for (int i = 0;

    i< comunidadTXT.size ();
    i

    
        ++) {
            String p = comunidadTXT.get(i);
        char pp = p.charAt(0);
        String ppp = String.valueOf(pp);
        if (ppp.equalsIgnoreCase("#")) {
            System.out.println(comunidadTXT.get(i));
            comunidadTXT.remove(comunidadTXT.get(i));
        } else if (ppp.equalsIgnoreCase(".")) {
            System.out.println(comunidadTXT.get(i));
            comunidadTXT.remove(comunidadTXT.get(i));
        } else {
            lista2.add(comunidadTXT.get(i));

        }
    }

    System.out.println (lista2);
    String[] datos2 = lista.get(0).split(" ");
    for(int i = 0;
    i< datos.length ;
    i

    
        ++){
                System.out.println(datos[0]);
    }

    String identificacio = datos[0];
    String nom = datos[1];
    String poblacio = datos[2];

    Comunitat comunitat = new Comunitat(identificacio, nom, poblacio);

    listaComunidad.add (comunitat);
}

    /*public static void procesar(int i) {
        String[] datos = comunidadTXT.get(i).split(";");
        String identificacio = datos[0];
        String nom = datos[1];
        String poblacio = datos[2];

        Comunitat comunidad = new Comunitat(identificacio, nom, poblacio);
        listaComunidades.add(comunidad);
        System.out.println(identificacio + " " + nom + " " + poblacio);
    }*/
    public static void cleanDespeses() {
        System.out.println("******* Lista despeses: ");
        for (int i = 0; i < despesesTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = despesesTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                despesesTXT.remove(despesesTXT.get(i));
            } else if (ppp.equalsIgnoreCase(".")) {
                despesesTXT.remove(despesesTXT.get(i));
            } else {
                String[] datos = despesesTXT.get(i).split(";");
                String identificacio = datos[0];
                String descripcio = datos[1];
                Double importe = Double.valueOf(datos[2]);
                char zona = datos[3].charAt(0);

                Despeses despeses = new Despeses(identificacio, descripcio, importe, zona);
                listaDespeses.add(despeses);
            }
        }
        System.out.println(listaDespeses);
    }

}
