/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosavanzadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author benjagoni
 */
public class PruebasDesempeñoAlgoritmosOrdenamiento {
    
    public  ArrayList <Pelicula> peliculas = new ArrayList();
    
    public PruebasDesempeñoAlgoritmosOrdenamiento() throws FileNotFoundException {// revisar si este "throws" es equivalente a usar try-catch 
        File doc = new File("/Users/benjagoni/Downloads/movie_titles2.txt");
        
        Scanner obj = new Scanner(doc);
        
        String[] arre;
        
        while(obj.hasNextLine()) {
            arre = obj.nextLine().split(",");
            Pelicula nueva = new Pelicula(Integer.parseInt(arre[0]), Integer.parseInt(arre[1]), arre[2]);
            peliculas.add(nueva);
        }
        
    }
    
    public  ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    public  String imprimePeliculas() {
        StringBuilder cad = new StringBuilder();
        
        for(int i = 0; i < peliculas.size(); i++) {
            cad.append(peliculas.get(i).serie + ", " +  peliculas.get(i).año + ", " + peliculas.get(i).titulo + "\n");
        }
        
        return cad.toString();
    }
    
    public  void desordenaPeliculas() {
        int i;
        Pelicula aux;
        int posRand;
        
        Random rand = new Random();
        for(i = peliculas.size(); i < 0; i--) {
            posRand = rand.nextInt(i + 1);
            aux = peliculas.get(i);
            peliculas.set(i, peliculas.get(posRand));
            peliculas.set(posRand, aux);
        }
    }
    
}
