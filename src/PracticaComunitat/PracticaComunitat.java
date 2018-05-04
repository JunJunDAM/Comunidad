/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaComunitat;

import Domain.*;
import java.io.*;
import java.util.*;
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
    //Array para los atributos de comunitat
    static List<String> comTXT = new ArrayList<>();
    static List<String> zonaTXT = new ArrayList<>();
    static List<String> propietatTXT = new ArrayList<>();
    static List<String> propietariTXT = new ArrayList<>();
    //Array de clases
    static List<Despeses> listaDespeses = new ArrayList<>();
    static List<Comunitat> listaComunidad = new ArrayList<>();
    static List<Zona> listaZona = new ArrayList<>();
    static List<Propietat> listaPropiedad = new ArrayList<>();
    static List<Propietari> listaPropietario = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try {
            //Scanner para poder leer los ficheros
            Scanner com = new Scanner(new FileReader("Comunitats.txt"));
            Scanner des = new Scanner(new FileReader("Despeses.txt"));

            //Scanner de los atributos de comunitats
            Scanner c = new Scanner(new FileReader("Comunitat.txt"));
            Scanner z = new Scanner(new FileReader("Zona.txt"));
            Scanner ppt = new Scanner(new FileReader("Propietat.txt"));
            Scanner ppti = new Scanner(new FileReader("Propietari.txt"));

            //Añadimos a las array de lineas todo el contenido de los txt
            while (com.hasNext()) {
                comunidadTXT.add(com.nextLine());
            }
            while (des.hasNext()) {
                despesesTXT.add(des.nextLine());
            }
            while (c.hasNext()) {
                comTXT.add(c.nextLine());
            }
            while (z.hasNext()) {
                zonaTXT.add(z.nextLine());
            }
            while (ppt.hasNext()) {
                propietatTXT.add(ppt.nextLine());
            }
            while (ppti.hasNext()) {
                propietariTXT.add(ppti.nextLine());
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(PracticaComunitat.class.getName()).log(Level.SEVERE, null, ex);
        }

        Cleaner();
        Resum();
        Propietats();
        propietaris();
    }

    public static void quotas() throws IOException{
        //URL donde ira el archivo txt
        String URL = "C:\\Users\\alu2015059\\Desktop\\PracticaComunitat\\Resultado\\Quotes.txt";
        //Creo el archivo
        File quotes = new File(URL);
        //BufferedWriter para escribir en el fichero
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(quotes));
        
        bw.write("QUOTES PER PROPIETATS : ");
        bw.newLine();
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        for(Propietat ppt : listaPropiedad){
            bw.write("ID : " + ppt.getId_Propietat() + ", Propietari : " + ppt.getId_Propietari().getNom() + ", %Escala: " + ppt.getPercentatges());
        }
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        bw.write("Propietats: " + listaPropietario.size());
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("QUOTES PER PROPIETARIS : ");
        bw.newLine();
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        bw.write("Propietats : " + listaPropietario.size());
        bw.close();
    }
    
    public static void propietaris() throws IOException{
        //URL donde ira el archivo txt
        String URL = "C:\\Users\\alu2015059\\Desktop\\PracticaComunitat\\Resultado\\Propietaris.txt";
        //Creo el archivo
        File propietaris = new File(URL);
        //BufferedWriter para escribir en el fichero
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(propietaris));
        
        bw.write("PROPIETARIS : ");
        bw.newLine();
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        for(Propietari p : listaPropietario){
            bw.write("ID : " + p.getId_Propietari() 
                    + ", Nom: " + p.getNom() 
                    + ", Correu : " + p.getCorreu() 
                    + ", Propietats : ");
            bw.newLine();
        }
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        bw.write("Total de propietaris : " + listaPropietario.size());
        bw.close();
    }
    
    public static void Propietats() throws IOException {
        //URL donde ira el archivo txt
        String URL = "C:\\Users\\alu2015059\\Desktop\\PracticaComunitat\\Resultado\\Propietats.txt";
        //Creo el archivo
        File propietats = new File(URL);
        //BufferedWriter para escribir en el fichero
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(propietats));

        bw.write("PROPIETATS : ");
        bw.newLine();
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        for (Propietat p : listaPropiedad) {
            bw.write("Codi : " + p.getId_Propietat()
                    + ", Metres^2 : " + p.getMetros2()
                    + ", Propietari : " + p.getId_Propietari().getId_Propietari() + " " + p.getId_Propietari().getNom()
                    + ", Quotes : " + p.getPercentatges()
                    + ", Informacio : " + p.getTipus() + " " + p.getLugar() + " " + p.getMaas());
            bw.newLine();
        }
        bw.write("-------------------------------------------------------------");
        bw.newLine();
        bw.write("Total de propietats : " + listaPropiedad.size());
        bw.close();
    }

    public static void Resum() throws IOException {
        //URL donde ira el archivo txt
        String URL = "C:\\Users\\alu2015059\\Desktop\\PracticaComunitat\\Resultado\\Resum.txt";
        //Creo el archivo
        File resum = new File(URL);
        //BufferedWriter para escribir en el fichero
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(resum));
        //Escribo en el fichero
        bw.write("ESTADISTIQUES : ");
        bw.newLine();
        bw.write("Comunitats : " + listaComunidad.size());
        bw.newLine();
        bw.write("Zones : " + listaZona.size());
        bw.newLine();
        bw.write("Propietats : " + listaPropiedad.size());
        bw.newLine();
        bw.write("Propietaris : " + listaPropietario.size());
        bw.newLine();
        bw.write("Despeses : " + listaDespeses.size());
        bw.newLine();
        //Cierro BufferedWriter
        bw.close();
    }

    public static void Cleaner() {
        ComunitatCleaner();
        ZonaCleaner();
        PropietariCleaner();
        PropietatCleaner();
        DespesesCleaner();
    }
    
    public static void PropietariCleaner() {
        for (int i = 0; i < propietariTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = propietariTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                
            } else if (ppp.equalsIgnoreCase(".")) {
                
            } else {
                String[] datos = propietariTXT.get(i).split(";");
                String identificacio = datos[0];
                String nom = datos[1];
                String poblacio = datos[2];
                String correu = datos[3];

                Propietari propietari = new Propietari(identificacio, nom, poblacio, correu);
                listaPropietario.add(propietari);
            }
        }
    }

    public static void PropietatCleaner() {
        for (int i = 0; i < propietatTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = propietatTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                
            } else if (ppp.equalsIgnoreCase(".")) {
                
            } else {
                String[] datos = propietatTXT.get(i).split(";");
                char tipu = datos[0].charAt(0);
                String codiPropietat = datos[1];
                int metres2 = Integer.valueOf(datos[2]);
                String codiPropietari = datos[3];
                String percentatges = datos[4];
                String lugar = datos[5];
                String maas = datos[6];
                //Proporciono los valores adequados
                String tipus = String.valueOf(tipu);
                if (tipus.equalsIgnoreCase("p")) {
                    tipus = "Pis";
                    if (lugar.equalsIgnoreCase("HH")) {
                        lugar = "habitual";
                    } else if (lugar.equalsIgnoreCase("HNH")) {
                        lugar = "no habitual";
                    }
                    if (maas.equalsIgnoreCase("2")) {
                        maas = "amb 2 havitacions";
                    } else if (maas.equalsIgnoreCase("3")) {
                        maas = "amb 3 havitacions";
                    } else if (maas.equalsIgnoreCase("4")) {
                        maas = "amb 4 havitacions";
                    }
                } else if (tipus.equalsIgnoreCase("l")) {
                    tipus = "Local";
                    String dedicat = maas;
                    maas = "dedicat a " + dedicat;
                } else if (tipus.equalsIgnoreCase("g")) {
                    tipus = "Garatge";
                    if (lugar.equalsIgnoreCase("a")) {
                        lugar = "Obert";
                    } else if (lugar.equalsIgnoreCase("c")) {
                        lugar = "Tancat";
                    }
                    if (maas.equalsIgnoreCase("s")) {
                        maas = "amb traster";
                    } else {
                        maas = "";
                    }
                }

                for (Propietari prop : listaPropietario) {
                    if (prop.getId_Propietari().equalsIgnoreCase(codiPropietari)) {
                        Propietat propietat = new Propietat(tipus, codiPropietat, metres2, prop, percentatges, lugar, maas);
                        listaPropiedad.add(propietat);
                    }
                }
            }
        }
    }

    public static void ZonaCleaner() {
        for (int i = 0; i < zonaTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = zonaTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                
            } else if (ppp.equalsIgnoreCase(".")) {
                
            } else {
                String[] datos = zonaTXT.get(i).split(";");
                char identificacio = datos[0].charAt(0);
                String nom = datos[1];
                char tipus = datos[2].charAt(0);
                Zona zona = new Zona(identificacio, nom, tipus);
                listaZona.add(zona);
            }
        }
    }

    public static void ComunitatCleaner() {
        for (int i = 0; i < comTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = comTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                
            } else if (ppp.equalsIgnoreCase(".")) {
                
            } else {
                String[] datos = comTXT.get(i).split(";");
                String identificacio = datos[0];
                String nom = datos[1];
                String poblacio = datos[2];
                Comunitat comunitat = new Comunitat(identificacio, nom, poblacio);
                listaComunidad.add(comunitat);
            }
        }
    }

    public static void DespesesCleaner() {
        for (int i = 0; i < despesesTXT.size(); i++) {
            //Cojo el primer caracter de cada linea
            String p = despesesTXT.get(i);
            char pp = p.charAt(0);
            String ppp = String.valueOf(pp);
            //
            if (ppp.equalsIgnoreCase("#")) {
                
            } else if (ppp.equalsIgnoreCase(".")) {
                
            } else {
                String[] datos = despesesTXT.get(i).split(";");
                String identificacio = datos[0];
                String descripcio = datos[1];
                Double importe = Double.valueOf(datos[2]);
                char zonachar = datos[3].charAt(0);

                for (Zona zona : listaZona) {
                    if (zona.getIdentificacio() == zonachar) {
                        Despeses despeses = new Despeses(identificacio, descripcio, importe, zona);
                        listaDespeses.add(despeses);
                    }
                }
            }
        }
    }
}
